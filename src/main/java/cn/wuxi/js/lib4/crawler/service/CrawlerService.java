package cn.wuxi.js.lib4.crawler.service;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.config.CookieSpecs;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import cn.wuxi.js.lib4.crawler.entity.CorpEntity;
import cn.wuxi.js.lib4.crawler.mapper.CorpMapper;

@Service
public class CrawlerService {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String TYC_URL_PREFIX = "https://m.tianyancha.com";

	public CloseableHttpClient httpClient = null;
	public CookieStore cookieStore = null;
	public HttpClientContext context = null;
	public RequestConfig globalConfig = null;

	@Autowired
	private MohurdCrawler mohurdCrawler;

	@Autowired
	private BmfwCrawler bmfwCrawler;

	@Autowired
	private CorpMapper corpMapper;

	/**
	 * 爬取统一社会信用代码程序
	 */
	public void start(String corpName) {

		// 全局请求设置
		globalConfig = RequestConfig.custom()
				.setCookieSpec(CookieSpecs.STANDARD).build();

		// mohurdCrawler.start(corpName);

		// testMockData();
		//
		List<CorpEntity> corps = corpMapper
				.getCorpWithoutUnifiedSocialCreditCode();

		logger.info("计划爬取企业数:" + corps.size());
		long startTime = System.currentTimeMillis();
		int success = 0;
		int total = corps.size();

		String corpCreditCode = null;
		for (CorpEntity corp : corps) {
			// corpCreditCode = searchUnifiedSocialCreditCodeFromMohurd(corp
			// .getQymc());
			logger.info("开始爬取企业:" + corp.getQymc());
			// if (corpCreditCode == null ||
			// StringUtils.isEmpty(corpCreditCode)) {

			corpCreditCode = searchUnifiedSocialCreditCodeFromTianYanCha(corp
					.getQymc());
			// }

			// logger.info(corp.getQymc() + "-" + corpCreditCode);
			if (corpCreditCode != null
					&& !StringUtils.isEmpty(corpCreditCode)
					&& corpCreditCode.trim().length() == 18
					&& isUnifiedSocialCreditCode(corpCreditCode, corp.getQyID())) {
				corp.setTyshxydm(corpCreditCode.trim());
				corp.setXgr("crawler");

				logger.info("成功爬取企业(" + corp.getQymc() + ":" + corp.getQyID()
						+ ")的统一社会信用代码:" + corp.getTyshxydm());
				corpMapper.updateUnifiedSocialCreditCode(corp);
				success++;
			}

		}

		long endTime = System.currentTimeMillis();
		logger.info("爬取" + success + "/" + total + " 企业，总耗时"
				+ (endTime - startTime) / 1000l / 60l + "分钟");

	}

	/**
	 * 爬取统一社会信用代码程序
	 */
	public void beginCrawler(String corpName) {

		// 全局请求设置
		// globalConfig = RequestConfig.custom()
		// .setCookieSpec(CookieSpecs.STANDARD).build();
		List<CorpEntity> corps = null;
		if (corpName == null) {
			corps = corpMapper.getCorpWithoutUnifiedSocialCreditCode();
		} else {
			corps = new ArrayList<CorpEntity>();
			CorpEntity corp = new CorpEntity();
			corp.setQymc(corpName);
			corps.add(corp);
		}

		logger.info("计划爬取企业数:" + corps.size());
		long startTime = System.currentTimeMillis();
		int success = 0;
		int total = corps.size();

		String corpCreditCode = null;
		for (CorpEntity corp : corps) {
			// corpCreditCode = searchUnifiedSocialCreditCodeFromMohurd(corp
			// .getQymc());
			logger.info("开始爬取企业:" + corp.getQymc());

			try {
				corpCreditCode = bmfwCrawler.crawler(corp.getQymc());
				Thread.sleep(10000);
			}catch(Exception e){
				e.printStackTrace();
				logger.error("error : " + e.getMessage());
			}
			

			// logger.info(corp.getQymc() + "-" + corpCreditCode);
			if (corpCreditCode != null && !StringUtils.isEmpty(corpCreditCode)
					&& corpCreditCode.trim().length() == 18
			// && isUnifiedSocialCreditCode(corpCreditCode, corp.getQyID())
			) {
				corp.setTyshxydm(corpCreditCode.trim());

				if (corp.getQyID() == null
						|| StringUtils.isEmpty(corp.getQyID())) {

					String zzjgdm = corpCreditCode.substring(8, 16) + "-"
							+ corpCreditCode.substring(16, 17);
					logger.info("zzjgdm:" + zzjgdm);

					corp.setQyID(zzjgdm);
				}
				corp.setXgr("crawler");

				logger.info("成功爬取企业(" + corp.getQymc() + ")的统一社会信用代码:"
						+ corp.getTyshxydm());
				corpMapper.updateUnifiedSocialCreditCode(corp);
				success++;
			}else {
				if(!StringUtils.isEmpty(corp.getQyID())){
					corp.setXgr("crawler");
					corpMapper.updateNoCredCode(corp);
				}				
			}

		}

		long endTime = System.currentTimeMillis();
		logger.info("爬取" + success + "/" + total + " 企业，总耗时"
				+ (endTime - startTime) / 1000l / 60l + "分钟");

	}

	private void testMockData() {
		String corpName = "浙江宏正建筑设计有限公司";
		String corpId = searchUnifiedSocialCreditCodeFromTianYanCha(corpName);
		System.out.println("search out:" + corpName + "-" + corpId);

	}

	/**
	 * 从天眼查网站按名称爬取企业的统一社会信用代码
	 * 
	 * @param qymc
	 * @return
	 */
	private String searchUnifiedSocialCreditCodeFromTianYanCha(String qymc) {

		String result = null;
		// CloseableHttpClient httpClient = HttpClients.createDefault();
		// 创建cookie store的本地实例
		cookieStore = new BasicCookieStore();
		// 创建HttpClient上下文
		context = HttpClientContext.create();
		context.setCookieStore(cookieStore);
		httpClient = HttpClients.custom().setDefaultRequestConfig(globalConfig)
				.setDefaultCookieStore(cookieStore).build();

		CloseableHttpResponse response = null;
		InputStream is = null;
		String html = null;
		String url = TYC_URL_PREFIX + "/search";
		// 封装请求参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("key", qymc));
		params.add(new BasicNameValuePair("checkFrom", "searchBox"));
		String str = "";
		try {
			// 转换为键值对
			str = EntityUtils.toString(new UrlEncodedFormEntity(params,
					Consts.UTF_8));

			// 创建Get请求
			HttpGet httpGet = new HttpGet(url + "?" + str);
			// httpGet.setHeader("Cookie","aliyungf_tc=AQAAAAWEcGMRIQ4AWKyVJCclP028gGwG; csrfToken=wyKnjFYENo0sB8_NvvY3gMnO; TYCID=f765d560042411e8819b3751947f55f2; undefined=f765d560042411e8819b3751947f55f2; Hm_lvt_e92c8d65d92d534b0fc290df538b4758=1517141811; ssuid=1042133199; RTYCID=0f68e45b0877410b914c7054af65670a; bannerFlag=true; tyc-user-info=%257B%2522token%2522%253A%2522eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxMzkxNDEwMjI1NCIsImlhdCI6MTUxNzE0NTk3MSwiZXhwIjoxNTMyNjk3OTcxfQ.aBp4N1ZdkXEDJOJ5uncE7tqx5v4qzb2mBr71TbLGGZlSgsNe2K7dOsWXylYpBnuOXUd3LO3mRCXJBZjiwKhQbw%2522%252C%2522integrity%2522%253A%25220%2525%2522%252C%2522state%2522%253A%25220%2522%252C%2522vipManager%2522%253A%25220%2522%252C%2522vnum%2522%253A%25220%2522%252C%2522onum%2522%253A%25220%2522%252C%2522mobile%2522%253A%252213914102254%2522%257D; auth_token=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxMzkxNDEwMjI1NCIsImlhdCI6MTUxNzE0NTk3MSwiZXhwIjoxNTMyNjk3OTcxfQ.aBp4N1ZdkXEDJOJ5uncE7tqx5v4qzb2mBr71TbLGGZlSgsNe2K7dOsWXylYpBnuOXUd3LO3mRCXJBZjiwKhQbw; _csrf=q/UcahgYjmg1L+d6mdr25g==; OA=2ufreVjH581eRsW0mq8S1e02eqWjuO/RB2eMoswMSdjrpWugqnt9/R9sAEHAthkD; _csrf_bk=7dcb2e89179abe808fb51cf19d9f23dd; Hm_lpvt_e92c8d65d92d534b0fc290df538b4758=1517146190");
			// 执行Get请求，

			response = httpClient.execute(httpGet, context);
			// 得到响应体
			HttpEntity entity = response.getEntity();

			String innerUrl = null;
			if (entity != null) {
				is = entity.getContent();
				html = inputStream2String(is);

				// logger.info(html);
				if (html != null) {
					Document doc = Jsoup.parse(html);
					Elements els = doc.select("div.search_name a");

					// if (!els.isEmpty() && els.size() >= 1) {
					// Element a = els.get(0);
					// innerUrl = a.attr("href");
					// logger.info("innerUrl:" + innerUrl);
					// logger.info("html:" + a.html());
					// }
					String corpName = null;
					for (Element el : els) {
						logger.info("html:" + el.html());
						corpName = el.getElementsByTag("span").get(0).html();
						if (("<em>" + qymc + "</em>").equals(corpName.trim())) {
							innerUrl = el.attr("href");
							logger.info("innerUrl:" + innerUrl);
							break;
						}
					}
				}

				is.close();
			}

			if (innerUrl != null) {
				result = getUnifiedSocialCreditCodeFromTianYanChaDetail(TYC_URL_PREFIX
						+ innerUrl);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭输入流，释放资源
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 消耗实体内容
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 关闭相应 丢弃http连接
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	/**
	 * 从天眼查网站按名称爬取企业的统一社会信用代码,根据查询到的URL获取企业详细信息页面，并从中分析出统一社会信用代码
	 * 
	 * @param innerUrl
	 * @return
	 */
	private String getUnifiedSocialCreditCodeFromTianYanChaDetail(
			String innerUrl) {

		String result = null;
		CloseableHttpResponse response = null;
		InputStream is = null;
		String html = null;

		try {
			// 创建Get请求
			HttpGet httpGet = new HttpGet(innerUrl);
			// 执行Get请求，
			response = httpClient.execute(httpGet, context);
			// 得到响应体
			HttpEntity entity = response.getEntity();

			if (entity != null) {
				is = entity.getContent();
				html = inputStream2String(is);

				// System.out.println(html);
				if (html != null) {
					Document doc = Jsoup.parse(html);

					Elements divs = doc
							.select("div.company-mobile-container416 > div > div.content-container > div.item-line");
					// logger.info("divs: " + divs.get(8).html());

					Element span = divs.get(8).getElementsByTag("span").get(1);
					result = span.html().trim();
					logger.info("code: " + span.html());

				}

				is.close();
			}

			if (innerUrl != null) {

			}

		} catch (ParseException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// 关闭输入流，释放资源
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 消耗实体内容
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// 关闭相应 丢弃http连接
			if (httpClient != null) {
				try {
					httpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return result;

	}

	/**
	 * 从住建部网站按名称爬取企业的统一社会信用代码
	 * 
	 * @param corpName
	 * @return
	 */
	private String searchUnifiedSocialCreditCodeFromMohurd(String corpName) {
		String result = null;
		// 创建HttpClient对象
		CloseableHttpClient closeHttpClient = HttpClients.createDefault();
		CloseableHttpResponse httpResponse = null;
		// 发送Post请求
		HttpPost httpPost = new HttpPost(
				"http://jzsc.mohurd.gov.cn/dataservice/query/comp/list");
		// 设置Post参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("complexname", corpName));
		try {
			// 转换参数并设置编码格式
			httpPost.setEntity(new UrlEncodedFormEntity(params, Consts.UTF_8));
			// 执行Post请求 得到Response对象
			httpResponse = closeHttpClient.execute(httpPost);
			// httpResponse.getStatusLine() 响应头信息

			// 返回对象 向上造型
			HttpEntity httpEntity = httpResponse.getEntity();
			String html = null;
			if (httpEntity != null) {
				// 响应输入流
				InputStream is = httpEntity.getContent();
				html = inputStream2String(is);
				is.close();
			}
			// System.out.println(html);
			if (html != null) {
				Document doc = Jsoup.parse(html);
				Elements tds = doc.select("table tr td.complist-num");
				for (Element td : tds) {
					result = td.html().trim();
					if (result.length() == 18) {
						break;
					}
					// System.out.println("corpName:" + corpName + "-"
					// + td.html().trim());
				}
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (httpResponse != null) {
				try {
					httpResponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (closeHttpClient != null) {
				try {
					closeHttpClient.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	public String inputStream2String(InputStream in) throws IOException {
		StringBuffer out = new StringBuffer();
		byte[] b = new byte[4096];
		for (int n; (n = in.read(b)) != -1;) {
			out.append(new String(b, 0, n));
		}
		return out.toString();
	}

	/**
	 * 判断统一社会信用代码是否跟组织机构代码一致
	 * 
	 * @param corpCreditCode
	 * @param qyID
	 * @return
	 */
	private boolean isUnifiedSocialCreditCode(String corpCreditCode, String qyID) {
		String zzjgdm = corpCreditCode.substring(8, 16) + "-"
				+ corpCreditCode.substring(16, 17);
		return qyID.equals(zzjgdm);
	}

}
