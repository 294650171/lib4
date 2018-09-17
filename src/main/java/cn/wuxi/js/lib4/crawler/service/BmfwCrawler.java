package cn.wuxi.js.lib4.crawler.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wuxi.js.lib4.crawler.mapper.CorpMapper;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Service
public class BmfwCrawler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String CORP_SEARCH_URL = "http://bmfw.www.gov.cn/ZFW-AccessPlatform/front/xyzg/xyzgtysh.do?";

	public static final String TAG = "qlmsoft";
	public static final String XGR = "crawler";

	public CloseableHttpClient closeHttpClient = HttpClients.createDefault();

	@Autowired
	private CorpMapper corpMapper;

	/**
	 * 爬取企业信息程序
	 */
	public String crawler(String corpName) {

		String result = null;
		// 创建HttpClient对象

		CloseableHttpResponse httpResponse = null;
		// 发送Post请求
		HttpPost httpPost = new HttpPost(CORP_SEARCH_URL + "keyword="
				+ corpName);

		// 设置Post参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("page", "1"));

		try {
			// 转换参数并设置编码格式
			httpPost.setEntity(new UrlEncodedFormEntity(params, Consts.UTF_8));
			// 执行Post请求 得到Response对象
			httpResponse = closeHttpClient.execute(httpPost);
			// httpResponse.getStatusLine() 响应头信息

			String html = EntityUtils.toString(httpResponse.getEntity(),
					"UTF-8");
			
			if (html != null) {
				result = searchCorpResult(corpName, html);
			}

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			logger.error(e.getMessage());
			e.printStackTrace();
		} finally {
			if (httpResponse != null) {
				try {
					httpResponse.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			// if (closeHttpClient != null) {
			// try {
			// closeHttpClient.close();
			// } catch (IOException e) {
			// e.printStackTrace();
			// }
			// }
		}

		return result;

	}

	/**
	 * 处理按企业名字查询结果
	 * 
	 * @param corpName
	 * @param html
	 * @return
	 */
	private String searchCorpResult(String corpName, String html) {

		String tyshxydm = null;

		JSONObject outObj = JSON.parseObject(html);

		if (outObj != null) {
			JSONObject jsonObj = outObj.getJSONObject("result");
			if (jsonObj != null) {
				int totalCount = jsonObj.getIntValue("totalCount");

				if (totalCount > 0) {
					JSONArray arr = jsonObj.getJSONArray("results");

					for (int i = 0; i < arr.size(); i++) {
						JSONObject o = arr.getJSONObject(i);
						String name = o.getString("entName");
						if (corpName.equals(name)) {
							String credCode = o.getString("credCode");

							if (corpName.equals(name) && credCode != null
									&& credCode.length() == 18) {
								tyshxydm = credCode;
							}
							logger.info("tyshxydm: " + tyshxydm);
							break;

						}
					}
				}
			}

		} else {
			logger.info("no result");
		}

		return tyshxydm;
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
