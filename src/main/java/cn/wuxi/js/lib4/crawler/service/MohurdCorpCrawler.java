package cn.wuxi.js.lib4.crawler.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.Consts;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
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

import cn.wuxi.js.lib4.crawler.entity.CorpCert;
import cn.wuxi.js.lib4.crawler.entity.CorpCertExample;
import cn.wuxi.js.lib4.crawler.entity.CorpCertMapping;
import cn.wuxi.js.lib4.crawler.entity.CorpEntity;
import cn.wuxi.js.lib4.crawler.entity.Qycsyw;
import cn.wuxi.js.lib4.crawler.entity.Qyjbxx;
import cn.wuxi.js.lib4.crawler.entity.Qyzs;
import cn.wuxi.js.lib4.crawler.entity.UeppCode;
import cn.wuxi.js.lib4.crawler.entity.UeppCodeExample;
import cn.wuxi.js.lib4.crawler.mapper.CorpCertMapper;
import cn.wuxi.js.lib4.crawler.mapper.CorpCertMappingMapper;
import cn.wuxi.js.lib4.crawler.mapper.CorpMapper;
import cn.wuxi.js.lib4.crawler.mapper.QycsywMapper;
import cn.wuxi.js.lib4.crawler.mapper.QyjbxxMapper;
import cn.wuxi.js.lib4.crawler.mapper.QyzsMapper;
import cn.wuxi.js.lib4.crawler.mapper.QyzzmxMapper;
import cn.wuxi.js.lib4.crawler.mapper.UeppCodeMapper;
import cn.wuxi.js.lib4.crawler.mohurd.bean.BaseCorpVO;
import cn.wuxi.js.lib4.crawler.mohurd.bean.CorpCaVO;
import cn.wuxi.js.lib4.crawler.mohurd.bean.CorpDetailVO;
import cn.wuxi.js.lib4.crawler.mohurd.bean.RegStaffs;

@Service
public class MohurdCorpCrawler {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	public static final String TYC_URL_PREFIX = "https://m.tianyancha.com";

	public static final String MOHURD_HOME_URL = "http://jzsc.mohurd.gov.cn";
	public static final String CORP_SEARCH_URL = "http://jzsc.mohurd.gov.cn/dataservice/query/comp/list";
	public static final String CORP_DETAIL_URL = "http://jzsc.mohurd.gov.cn";
	public static final String CORP_CA_LIST_URL = "http://jzsc.mohurd.gov.cn/dataservice/query/comp/caDetailList/";
	public static final String CORP_REG_STAFF_LIST_URL = "http://jzsc.mohurd.gov.cn/dataservice/query/comp/regStaffList/";

	public static final String TAG = "qlmsoft";
	public static final String XGR = "crawler";
	public static final String CERT_DATE_FORMAT = "yyyy-MM-dd";
	
	public CloseableHttpClient closeHttpClient = HttpClients.createDefault();

	@Autowired
	private CorpCertMapper certMapper;
	
	@Autowired
	private CorpMapper corpMapper;
	@Autowired
	private QyjbxxMapper qyjbxxMapper;
	
	@Autowired
	private QycsywMapper qycsywMapper;
	
	@Autowired
	private QyzsMapper qyzsMapper;
	
	@Autowired
	private QyzzmxMapper qyzzmxMapper;
	
	@Autowired
	private UeppCodeMapper codeMapper;
	
	
	@Autowired
	private RegStaffProccesor startProc;
	
	@Autowired
	private CorpCertMappingMapper corpCertMappingMapper;
	
	private List<CorpCertMapping> corpCertList = null;
	
	private int success = 0;
	private int total = 0;

	
	/**
	 * 爬取企业信息程序
	 */
	public void start(boolean withStaffFlag) {
		
		corpCertList = corpCertMappingMapper.selectAll(null);
		
		List<CorpEntity> corps = corpMapper.getSurveyAndDesignAdd();
//		List<CorpEntity> corps = corpMapper.getSurveyAndDesignStaff();
		
		logger.info("计划获取企业数:" + corps.size());
		long startTime = System.currentTimeMillis();
		
		total = corps.size();

		for (CorpEntity corp : corps) {
			logger.info("开始获取企业:" + corp.getQymc());

			try {
				start(withStaffFlag,corp.getQymc());
				// 防止被防火墙阻挡，90秒获取一次
				Thread.sleep(30000);
//				Thread.sleep(60000);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("error : " + e.getMessage());
			}
		}

		long endTime = System.currentTimeMillis();
		logger.info("爬取" + success + "/" + total + " 企业，总耗时"
				+ (endTime - startTime) / 1000l / 60l + "分钟");
	}
	
	
	/**
	 * 爬取企业信息程序
	 */
	public void startPeixun(boolean withStaffFlag) {

		corpCertList = corpCertMappingMapper.selectAll(null);

		List<String> corps = corpMapper.getPeixun();

		logger.info("计划获取企业数:" + corps.size());
		long startTime = System.currentTimeMillis();

		total = corps.size();

		for (String corp : corps) {
			logger.info("开始获取企业:" + corp);

			try {
				start(withStaffFlag, corp);
				// 防止被防火墙阻挡，90秒获取一次
				Thread.sleep(30000);
				// Thread.sleep(60000);
			} catch (Exception e) {
				e.printStackTrace();
				logger.error("error : " + e.getMessage());
			}
		}

		long endTime = System.currentTimeMillis();
		logger.info("爬取" + success + "/" + total + " 企业，总耗时"
				+ (endTime - startTime) / 1000l / 60l + "分钟");
	}
	
	/**
	 * 爬取企业信息程序
	 */
	public void start(boolean withStaffFlag, String corpName) {
		if(corpCertList == null){
			corpCertList = corpCertMappingMapper.selectAll(null);
		}

		if (corpName != null) {

			// 搜索企业
			BaseCorpVO corpVO = searchCorpByNameReq(corpName);

			if (corpVO != null) {
				logger.info("企业 :" + corpVO.toString());

				String zzjgdm = corpVO.getZzjgdm();
				// 企业详细页面
				CorpDetailVO detailVO = corpDetailReq(corpVO);
				logger.info("企业详细页面 :" + detailVO.toString());
				if(StringUtils.isEmpty(zzjgdm)){
					zzjgdm = detailVO.getZzjgdm();
					corpVO.setCorpID(zzjgdm);
				}
				logger.info("zzjgdm:" + zzjgdm);
				
				if (detailVO != null) {
					Qyjbxx qy = qyjbxxMapper.selectByPrimaryKey(zzjgdm);
					if (qy == null) {
						qy = new Qyjbxx();
						qy.setQyid(corpVO.getZzjgdm());
						qy.setTyshxydm(corpVO.getCorpID());
						qy.setUserid(XGR);
						qy.setQymc(corpName);
						qy.setProvince(detailVO.getProvince());
						qy.setZcdd(detailVO.getZcdd());
						qy.setJjxz(detailVO.getJjxz());
						qy.setXxdd(detailVO.getJjxz());
						qy.setFddbr(detailVO.getFddbr());
						qy.setTag(TAG);
						qy.setXgr(XGR);
						qy.setXgrqsj(new Date());

						//qyjbxxMapper.insert(qy);
					}
				}

				// 企业资质
				List<CorpCaVO> caList = corpCaListReq(corpVO);
				
				/**
				//企业的所有从事业务类型
				QycsywExample example = new QycsywExample();
				example.createCriteria().andQyidEqualTo(zzjgdm) ;
				List<Qycsyw> csywlxList = qycsywMapper.selectByExample(example);
				List<String> savedList = new ArrayList<String>();
				
				//企业的所有证书
				QyzsExample zs = new QyzsExample();
				zs.createCriteria().andQyidEqualTo(zzjgdm);
				List<Qyzs> qyzsList = qyzsMapper.selectByExample(zs);
				List<String> zsbhList = new ArrayList<String>();
				
				//企业的所有资质明细
				QyzzmxExample zzmx = new QyzzmxExample();
				zzmx.createCriteria().andQyidEqualTo(zzjgdm);
				List<Qyzzmx> qyzzmxList = qyzzmxMapper
						.selectByExample(zzmx);
				*/
				
				
				//企业
				CorpCertExample zs = new CorpCertExample();
				zs.createCriteria().andCorpIdEqualTo(zzjgdm);
				List<CorpCert> certList = certMapper.selectByExample(zs);
			 
				
				if (caList != null && !caList.isEmpty()) {
					for (CorpCaVO ca : caList) {

						logger.info("企业证书:" + ca.toString());
						success ++;
						CorpCert toSaveCert = isCorpCertExist(certList, ca);
						if (toSaveCert == null) {
							CorpCert savedCert = new CorpCert(); 
							transferToCert(zzjgdm, ca, savedCert); 
							certMapper.insert(savedCert);
							logger.info("新增企业证书:" + savedCert.toString());
						} else {
							transferToCert(zzjgdm, ca, toSaveCert); 
							certMapper.updateByPrimaryKeySelective(toSaveCert);
							logger.info("更新企业证书:" + toSaveCert.toString());
						}
						
						
						/**
						// 更新企业从事业务类型
						if (!isCsywlxExist(csywlxList, ca.getCsywlx()) && !savedList.contains(ca.getCsywlx())) {
							savedList.add(ca.getCsywlx());
							Qycsyw qycsyw = new Qycsyw();
							qycsyw.setQyid(zzjgdm);
							qycsyw.setCsywlx(ca.getCsywlx());
							qycsyw.setTag(TAG);
							qycsyw.setXgr(XGR);
							qycsyw.setXgrqsj(new Date());
							//qycsywMapper.insert(qycsyw);
						}

						// 更新企业资质证书
						if (!isZsExist(qyzsList, ca.getZsbh()) && !zsbhList.contains(ca.getZsbh())) {
							zsbhList.add(ca.getZsbh());
							Qyzs qyzs = new Qyzs(); 
							qyzs.setZsjlid(qyzsMapper.queryQyzsID());
							qyzs.setQyid(zzjgdm);
							qyzs.setCsywlx(ca.getCsywlx());
							qyzs.setCsywlxid(transferInfoToCode(ca.getCsywlx(),
									"企业从事业务类型"));
							qyzs.setZsbh(ca.getZsbh());
							qyzs.setFzdw(ca.getFzdw());
							try {
								qyzs.setFzrq(DateUtils.parseDate(ca.getFzrq(),
										"yyyy-MM-dd"));
							} catch (ParseException e) {
								logger.error(e.getMessage());
								e.printStackTrace();
							}
							qyzs.setZslxid(0);
							qyzs.setZslx("");
							qyzs.setTag(TAG);
							qyzs.setXgr(XGR);
							qyzs.setXgrqsj(Calendar.getInstance().getTime());
							//qyzsMapper.insert(qyzs);
						}

						// 更新企业资质明细
						// TODO: 因为企业资质明细需要分解，以后在做
						*/
						
						
					}
				}
				 
				// 企业注册人员
				if(withStaffFlag){
					RegStaffs staffs = startProc.regStaffListReq(corpVO);
				}
				
			}
		}

		// List<CorpEntity> corps = corpMapper
		// .getCorpWithoutUnifiedSocialCreditCode();
		//
		// logger.info("计划爬取企业数:" + corps.size());
		// long startTime = System.currentTimeMillis();
		// int success = 0;
		// int total = corps.size();
		//
		// String corpCreditCode = null;
		// for (CorpEntity corp : corps) {
		//
		// logger.info("开始爬取企业:" + corp.getQymc());
		//
		//
		// corpCreditCode = searchUnifiedSocialCreditCodeFromMohurd(corp
		// .getQymc());
		//
		// if (corpCreditCode != null
		// && !StringUtils.isEmpty(corpCreditCode)
		// && corpCreditCode.trim().length() == 18
		// //&& isUnifiedSocialCreditCode(corpCreditCode, corp.getQyID())
		// ) {
		// corp.setTyshxydm(corpCreditCode.trim());
		// corp.setXgr("crawler");
		//
		// logger.info("成功爬取企业(" + corp.getQymc() + ")的统一社会信用代码:"
		// + corp.getTyshxydm());
		// corpMapper.updateUnifiedSocialCreditCode(corp);
		// success ++;
		// }
		//
		// }
		//
		// long endTime = System.currentTimeMillis();
		// logger.info("爬取" + success + "/" + total + " 企业，总耗时" + (endTime -
		// startTime) /1000l/60l + "分钟");
		//

	}

	private void transferToCert(String zzjgdm, CorpCaVO ca, CorpCert savedCert) {
		savedCert.setCorpId(zzjgdm);
		savedCert.setCertType(ca.getCsywlx());
		savedCert.setCertNo(ca.getZsbh());
		savedCert.setCertName(ca.getZzmc());
		try {
			savedCert.setIssueDate(DateUtils.parseDate(
					ca.getFzrq(), CERT_DATE_FORMAT));
			savedCert.setValidDate(DateUtils.parseDate(
					ca.getZsyxzrq(), CERT_DATE_FORMAT));
		} catch (ParseException e) {
			logger.info("证书日期转换错误:" + e.getMessage());
			e.printStackTrace();
		}
		savedCert.setIssueAuthority(ca.getFzdw());
		if(savedCert.getCreateTime() == null){
			savedCert.setCreateTime(Calendar.getInstance().getTime());
		}
		savedCert.setUpdateTime(Calendar.getInstance().getTime());
		savedCert.setTag(XGR);
		
		if(savedCert.getCertName() != null){
			int pos = savedCert.getCertName().trim().length();
			if(pos > 2){
				String level = savedCert.getCertName().trim().substring(pos - 2, pos);
				if(level.contains("级"))  {
					savedCert.setCertLevel(level);
				}else{
					savedCert.setCertLevel("");
				}
				
			}
		}

		CorpCertMapping matched = null;
		if(corpCertList != null && !corpCertList.isEmpty()){
			for(CorpCertMapping cc : corpCertList){
				if(savedCert.getCertName().trim().contains(cc.getCertname().trim()) ){
					matched = cc;
					logger.info("find :" + savedCert.getCertName() + "- " + matched.toString());
					break;
				}
			}
		}
		if(matched != null){
			savedCert.setTradeType(matched.getTradetypename());
			
			if(StringUtils.isEmpty(matched.getTradetypeno())){
				if(!StringUtils.isEmpty(matched.getMajortypeno())){
					savedCert.setTradeTypeId(Integer.parseInt(matched.getMajortypeno().substring(0, 6)));
				}
			}else {
				savedCert.setTradeTypeId(Integer.parseInt(matched.getTradetypeno()));
			}
			
			if(!StringUtils.isEmpty(matched.getCerttypeno())){
				savedCert.setCertTypeId(Integer.parseInt(matched.getCerttypeno()));
			}
			
			savedCert.setMajorType(matched.getMajortypename());
			
			if(!StringUtils.isEmpty(matched.getMajortypeno())){
				savedCert.setMajorTypeId(Integer.parseInt(matched.getMajortypeno()));
			}
			
		}
		
		
		
		
	}

	
	/**
	 * 判断一个企业的资质是否存在
	 * @param certList
	 * @param ca
	 * @return
	 */
	private CorpCert isCorpCertExist(List<CorpCert> certList, CorpCaVO ca) {
		CorpCert result = null;
		if (certList != null && !certList.isEmpty()) {
			for (CorpCert cert : certList) {
				if (cert.getCertType().equals(ca.getCsywlx())
						&& cert.getCertNo().equals(ca.getZsbh())
						&& cert.getCertName().equals(ca.getZzmc())) {
					result = cert;
					break;
				}
			}
		}
		return result;
	}

	/**
	 * 同一企业里，判断某个证书编号是否存在
	 * @param qyzsList
	 * @param zsbh
	 * @return
	 */
	private boolean isZsExist(List<Qyzs> qyzsList, String zsbh) {
		boolean result = false;
		if (qyzsList != null && !qyzsList.isEmpty()) {
			for (Qyzs qyzs : qyzsList) {
				if (qyzs.getZsbh().equals(zsbh)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}

	/**
	 * 同一企业里，判断某个从事业务类型是否存在
	 * @param csywlxList
	 * @param csywlx
	 * @return
	 */
	private boolean isCsywlxExist(List<Qycsyw> csywlxList, String csywlx) {
		boolean result = false;
		if (csywlxList != null && !csywlxList.isEmpty()) {
			for (Qycsyw qycsyw : csywlxList) {
				if (qycsyw.getCsywlx().equals(csywlx)) {
					result = true;
					break;
				}
			}
		}
		return result;
	}



	private Integer transferInfoToCode(String codeInfo, String codeType) {
		Integer csywlxid = null;
		UeppCodeExample example = new UeppCodeExample();
		example.createCriteria().andCodetypeEqualTo(codeType);
		List<UeppCode> codes = codeMapper.selectByExample(example);
		if (codes != null && !codes.isEmpty()) {
			for (UeppCode c : codes) {
				if (c.getCodeinfo().equals(codeInfo)) {
					csywlxid = Integer.parseInt(c.getCode());
				}
			}
		}
		return csywlxid;
	}



	/**
	 * 企业证书列表页面处理
	 * 
	 * @param corpVO
	 * @return
	 */
	private List<CorpCaVO> corpCaListReq(BaseCorpVO corpVO) {
		List<CorpCaVO> result = null;

		CloseableHttpResponse httpResponse = null;
		HttpGet httpget = new HttpGet(CORP_CA_LIST_URL + corpVO.getCorpPageID()
				+ "?_" + System.currentTimeMillis());

		try {
			httpResponse = closeHttpClient.execute(httpget);
			String html = EntityUtils.toString(httpResponse.getEntity(),
					"UTF-8");

			if (html != null) {
				result = corpCaListResult(html);
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

		}

		return result;

	}

	private List<CorpCaVO> corpCaListResult(String html) {

		List<CorpCaVO> result = new ArrayList<CorpCaVO>();
		Document doc = Jsoup.parse(html);

		try {
			Elements caTrs = doc.select("#catabled tr.row");

			for (Element caTr : caTrs) {
				CorpCaVO ca = new CorpCaVO();
				Elements tds = caTr.getElementsByTag("td");

				ca.setCsywlx(tds.get(1).html());
				ca.setZsbh(tds.get(2).html());
				ca.setZzmc(tds.get(3).html());
				ca.setFzrq(tds.get(4).html());
				ca.setZsyxzrq(tds.get(5).html());
				ca.setFzdw(tds.get(6).html());
				result.add(ca);
			}

		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}

		if (result.isEmpty()) {
			logger.info("no result");

		} else {
			for (CorpCaVO vo : result) {
				logger.info("ca " + vo.toString());
			}
		}

		return result;

	}

	/**
	 * 企业详细页面处理
	 * 
	 * @param corpVO
	 * @return
	 */
	private CorpDetailVO corpDetailReq(BaseCorpVO corpVO) {

		CorpDetailVO result = null;

		CloseableHttpResponse httpResponse = null;
		HttpGet httpget = new HttpGet(MOHURD_HOME_URL + corpVO.getCorpLink());
		try {
			httpResponse = closeHttpClient.execute(httpget);
			String html = EntityUtils.toString(httpResponse.getEntity(),
					"UTF-8");

			if (html != null) {
				result = corpDetailResult(html);
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

		}

		return result;

	}

	/**
	 * 从住建部网站按名称查询企业
	 * 
	 * @param corpName
	 * @return
	 */
	private BaseCorpVO searchCorpByNameReq(String corpName) {
		BaseCorpVO result = null;
		// 创建HttpClient对象

		CloseableHttpResponse httpResponse = null;
		// 发送Post请求
		HttpPost httpPost = new HttpPost(CORP_SEARCH_URL);

		// 设置Post参数
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		params.add(new BasicNameValuePair("complexname", corpName));

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
	private BaseCorpVO searchCorpResult(String corpName, String html) {
		BaseCorpVO result = null;
		Document doc = Jsoup.parse(html);
		Elements tds = doc.select("table tr td.complist-num");

		String coprID = null;
		String searchedCorpName = null;
		String corpLink = null;
		String corpPageID = null;
		for (Element td : tds) {
			coprID = td.html().trim();
			Element nextTd = td.nextElementSibling();
			corpLink = nextTd.selectFirst("a").attr("href").trim();
			searchedCorpName = nextTd.selectFirst("a em").html();

			if (corpName.equals(searchedCorpName)) {
				corpPageID = corpLink.substring(corpLink.lastIndexOf("/"));
				// logger.info("corpPageID：" + corpPageID);
				result = new BaseCorpVO(coprID, corpLink, corpPageID);
				break;
			}
		}
		if (result != null) {
			logger.info(result.toString());
		} else {
			logger.info("no result");
		}

		return result;
	}

	/**
	 * 处理企业详细页面结果
	 * 
	 * @param corpName
	 * @param html
	 * @return
	 */
	private CorpDetailVO corpDetailResult(String html) {
		CorpDetailVO result = null;
		Document doc = Jsoup.parse(html);
		try {
			
			Element zzjgdmEl = doc.select(
					"div.query_info_box table.datas_table tr").get(0);
			
			Element fddbrEl = doc.select(
					"div.query_info_box table.datas_table tr").get(1);

			if (fddbrEl != null && fddbrEl.html() != null
					&& !StringUtils.isEmpty(fddbrEl.html())) {
				result = new CorpDetailVO();

				result.setFddbr(fddbrEl.getElementsByTag("td").get(0).html());
				result.setJjxz(fddbrEl.getElementsByTag("td").get(1).html());

				Element provinceEl = doc.select(
						"div.query_info_box table.datas_table tr").get(2);
				result.setProvince(provinceEl.getElementsByTag("td").get(0)
						.html());

				Element addressEl = doc.select(
						"div.query_info_box table.datas_table tr").get(3);

				String address = addressEl.getElementsByTag("td").get(0).html();
				result.setXxdd(address);
				result.setZcdd(address);
				
				if (zzjgdmEl != null && zzjgdmEl.html() != null
						&& !StringUtils.isEmpty(zzjgdmEl)) {
					String zzjgdmHtml =  zzjgdmEl.getElementsByTag("td").get(0).html();
					if(!StringUtils.isEmpty(zzjgdmHtml) ){
						result.setZzjgdm(zzjgdmHtml.substring(0, 10));
					}
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getLocalizedMessage());
		}

		if (result != null) {
			logger.info("detail:" + result.toString());
		} else {
			logger.info("no result");
		}

		return result;
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
