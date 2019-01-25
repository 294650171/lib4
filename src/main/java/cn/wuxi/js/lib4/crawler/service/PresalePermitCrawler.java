package cn.wuxi.js.lib4.crawler.service;

import cn.wuxi.js.lib4.common.utils.DateUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.crawler.mohurd.bean.PublicityItem;
import cn.wuxi.js.lib4.modules.crawler.entity.PresalePermitPub;
import cn.wuxi.js.lib4.modules.crawler.service.PresalePermitPubService;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 商品房预售许可证
 */
@Service
public class PresalePermitCrawler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String FIRST_PAGE_URL = "http://js.wuxi.gov.cn/zfxxgk/gggs/jgggs/index.shtml";
    public static final String PAGED_URL = "http://js.wuxi.gov.cn/zfxxgk/gggs/jgggs/index_{0}.shtml";
    public static final String SITE_URL = "http://js.wuxi.gov.cn";
    public static final String TAG = "qlmsoft";
    public static final String PUB_DATE_FORMAT = "yyyy/MM/dd";
    public static final String SPLIT = "：";

    public CloseableHttpClient closeHttpClient = HttpClients.createDefault();

    @Autowired
    public PresalePermitPubService service;


    private int success = 0;
    private int total = 0;

    public void start() {

//        int endPage = 20;
        int endPage = 1;

        long startTime = System.currentTimeMillis();

        String url = null;
        List<PublicityItem> result = new ArrayList<PublicityItem>();

        for (int i = 1; i <= endPage; i++) {
            if (i == 1) {
                url = FIRST_PAGE_URL;
            } else {
                url = MessageFormat.format(PAGED_URL, String.valueOf(i));
            }

            try {
                result.addAll(start(url));
                // 防止被防火墙阻挡，90秒获取一次
                Thread.sleep(20 * 1000l);
//				Thread.sleep(60000);
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("error : " + e.getMessage());
            }
        }

        long endTime = System.currentTimeMillis();
        logger.info("商品房预售许可证：" + result.size() + "条，总耗时"
                + (endTime - startTime) / 1000l / 60l + "分钟");


        List<PresalePermitPub> detailResult = new ArrayList<PresalePermitPub>();
        for (PublicityItem item : result) {
            try {
                if(item.getTitle().contains("预销准字")){
                    PresalePermitPub detail = getDetail(item);

                    detail.setUrl(item.getUrl());
                    detail.setPublicityDate(item.getPubDate());
                    service.save(detail);

                    detailResult.add(detail);
                    // 防止被防火墙阻挡，90秒获取一次
                    Thread.sleep(20 * 1000l);
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error("error : " + e.getMessage());
            }
        }

    }

    /**
     * 单个页面获取
     * @param url
     */
    public void crawlerSingle(String url) {
        try {
            PublicityItem item = new PublicityItem();
            item.setUrl(url);
            PresalePermitPub detail = getDetail(item);
            detail.setUrl(url);

            service.save(detail);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }



    private List<PublicityItem> start(String url) {
        List<PublicityItem> result = new ArrayList<PublicityItem>();


        CloseableHttpResponse httpResponse = null;
        HttpGet httpget = new HttpGet(url);
        try {
            httpResponse = closeHttpClient.execute(httpget);
            String html = EntityUtils.toString(httpResponse.getEntity(),
                    "UTF-8");
            if (html != null) {
                result = getListData(html);
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
     * 获取列表信息
     *
     * @param html
     * @return
     */
    private List<PublicityItem> getListData(String html) {

        List<PublicityItem> result = new ArrayList<PublicityItem>();
        Document doc = Jsoup.parse(html);

        try {
            Elements lis = doc.select("div.RightSide div.RightSide_con>ul>li");

            for (Element li : lis) {
                PublicityItem item = new PublicityItem();
                Element aEl = li.getElementsByTag("a").get(0);
                Element spanEl = li.getElementsByTag("span").get(0);

                item.setTitle(aEl.html());
                item.setUrl(aEl.attr("href"));

                String pubDateStr = spanEl.html();
                if (StringUtils.isNotEmpty(pubDateStr)) {
                    item.setPubDate(DateUtils.parseDate(pubDateStr.replace("(", "").replace(")", ""), PUB_DATE_FORMAT));
                }
                result.add(item);
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }

        if (result.isEmpty()) {
            logger.info("no result");

        } else {
            for (PublicityItem vo : result) {
                logger.info("-----" + vo.toString());
            }
        }

        return result;

    }


    public PresalePermitPub getDetail(PublicityItem input) {
        PresalePermitPub result = new PresalePermitPub();

        CloseableHttpResponse httpResponse = null;
        String usingUrl = null;
        if(input.getUrl().startsWith("http://js.wuxi.gov.cn")){
            usingUrl = input.getUrl();
        }else {
            usingUrl = SITE_URL + input.getUrl();
        }
        HttpGet httpget = new HttpGet(usingUrl);
        try {
            httpResponse = closeHttpClient.execute(httpget);
            String html = EntityUtils.toString(httpResponse.getEntity(),
                    "UTF-8");
            if (html != null) {
                result = getDetailData(html);
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
     * 获取详细信息
     *
     * @param html
     * @return
     */
    private PresalePermitPub getDetailData(String html) {

        PresalePermitPub item = new PresalePermitPub();
        Document doc = Jsoup.parse(html);

        try {
            Elements pEls = doc.select("div#Zoom p");

            if(pEls == null || pEls.isEmpty()){
                pEls = doc.select("div#Zoom div");
            }
            for(Element p: pEls){
                String str = p.text().trim();
                logger.info("----" + str);
                if(str.startsWith("单位名称：")){
                    item.setCorpName(str.substring(str.indexOf(SPLIT) + 1));
                }else if(str.startsWith("商品房屋名称：")){
                    item.setCommondityHourseName(str.substring(str.indexOf(SPLIT) + 1));
                }else if(str.startsWith("商品房屋坐落：")){
                    item.setCommondityHourseAddress(str.substring(str.indexOf(SPLIT) + 1));
                }else if(str.startsWith("商品房屋使用性质：")){
                    item.setCommondityHourseType(str.substring(str.indexOf(SPLIT) + 1));
                }else if(str.startsWith("上市预售建筑面积：") || str.startsWith("上市预（销）售建筑面积：")
                        || str.startsWith("许可预售建筑面积：")){
                    item.setAreaStr(str.substring(str.indexOf(SPLIT) + 1));
                    item.setArea(extract_area(item.getAreaStr()));
                }else if(str.startsWith("许可证号：")){
                    item.setLicenseNo(str.substring(str.indexOf(SPLIT) + 1));
                }else if(str.startsWith("附件记录：")){
                    item.setAttachment(str.substring(str.indexOf(SPLIT) + 1));
                }

            }

            Element pubDateEl = doc.select("div.ConBox div.mainCont p > em").get(0);
            if(pubDateEl != null){
                String pubDateStr = pubDateEl.text();
                item.setPublicityDate(DateUtils.parseDate(pubDateStr,"yyyy-MM-dd"));
            }


        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return item;

    }


    /**
     * 提取金额,规则为只提取数字和点号,必须有点号
     * 格式可以为0.0或者，11
     * @param areaStr
     * @return
     */
    public Double extract_area(String areaStr) {
        Pattern compile = Pattern.compile("(\\d+\\.\\d+)|(\\d+)");
        Matcher matcher = compile.matcher(areaStr);
        matcher.find();
        return Double.valueOf(matcher.group());
    }


}
