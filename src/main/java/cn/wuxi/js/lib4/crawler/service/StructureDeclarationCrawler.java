package cn.wuxi.js.lib4.crawler.service;

import cn.wuxi.js.lib4.common.utils.DateUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.crawler.mohurd.bean.PublicityItem;
import cn.wuxi.js.lib4.modules.crawler.entity.QualitySuperPub;
import cn.wuxi.js.lib4.modules.crawler.service.QualitySuperPubService;
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

/**
 * 优质结构申报
 */
@Service
public class StructureDeclarationCrawler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public static final String FIRST_PAGE_URL = "http://js.wuxi.gov.cn/zfxxgk/gggs/zjgs/index.shtml";
    public static final String PAGED_URL = "http://js.wuxi.gov.cn/zfxxgk/gggs/zjgs/index_{0}.shtml";
    public static final String SITE_URL = "http://js.wuxi.gov.cn";
    public static final String TAG = "qlmsoft";
    public static final String PUB_DATE_FORMAT = "yyyy/MM/dd";
    public static final String SPLIT = "：";

    public CloseableHttpClient closeHttpClient = HttpClients.createDefault();

    @Autowired
    public QualitySuperPubService service;


    private int success = 0;
    private int total = 0;


    /**
     * 爬取企业信息程序
     */
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
        logger.info("爬取总体信息：" + result.size() + "条，总耗时"
                + (endTime - startTime) / 1000l / 60l + "分钟");


        List<QualitySuperPub> detailResult = new ArrayList<QualitySuperPub>();
        for (PublicityItem item : result) {
            try {
                if(item.getTitle().startsWith("优质结构申报公示")){
                    QualitySuperPub detail = getDetail(item);

                    detail.setUrl(item.getUrl());
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


    private QualitySuperPub getDetail(PublicityItem input) {
        QualitySuperPub result = new QualitySuperPub();

        CloseableHttpResponse httpResponse = null;
        HttpGet httpget = new HttpGet(SITE_URL + input.getUrl());
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
    private QualitySuperPub getDetailData(String html) {

        QualitySuperPub item = new QualitySuperPub();
        Document doc = Jsoup.parse(html);

        try {
            Element span = doc.select("div#Zoom span#content").get(0);

            Elements pEls = span.getElementsByTag("p");

            String projectNameStr = pEls.get(0).html();
            if (projectNameStr.indexOf(SPLIT) != -1) {
                item.setProjectName(projectNameStr.substring(projectNameStr.indexOf(SPLIT) + 1));
            }

            String constructionCorpStr = pEls.get(1).html();
            if (constructionCorpStr.indexOf(SPLIT) != -1) {
                item.setConstructionCorp(constructionCorpStr.substring(constructionCorpStr.indexOf(SPLIT) + 1));
            }

            String supervisorCorpStr = pEls.get(2).html();
            if (supervisorCorpStr.indexOf(SPLIT) != -1) {
                item.setSupervisorCorp(supervisorCorpStr.substring(supervisorCorpStr.indexOf(SPLIT) + 1));
            }

            String projectManagerStr = pEls.get(3).html();
            if (projectManagerStr.indexOf(SPLIT) != -1) {
                item.setProjectManager(projectManagerStr.substring(projectManagerStr.indexOf(SPLIT) + 1));
            }

            String projectDirectorStr = pEls.get(4).html();
            if (projectDirectorStr.indexOf(SPLIT) != -1) {
                item.setProjectDirector(projectDirectorStr.substring(projectDirectorStr.indexOf(SPLIT) + 1));
            }

            String qualitySuperDeptStr = pEls.get(5).html();
            if (qualitySuperDeptStr.indexOf(SPLIT) != -1) {
                item.setQualitySuperDept(qualitySuperDeptStr.substring(qualitySuperDeptStr.indexOf(SPLIT) + 1));
            }

            String regDateStr = pEls.get(6).html();
            if (regDateStr.indexOf(SPLIT) != -1) {
                String regDate = regDateStr.substring(regDateStr.indexOf(SPLIT) + 1);
                item.setRegDate(DateUtils.parseDate(regDate, "yyyy-MM-dd"));
            }

            String startDateStr = pEls.get(7).html();
            if (startDateStr.indexOf(SPLIT) != -1) {
                String regDate = startDateStr.substring(startDateStr.indexOf(SPLIT) + 1);
                item.setStartDate(DateUtils.parseDate(regDate, PUB_DATE_FORMAT));
            }

            String finishDateStr = pEls.get(8).html();
            if (finishDateStr.indexOf(SPLIT) != -1) {
                String finishDate = finishDateStr.substring(finishDateStr.indexOf(SPLIT) + 1);
                item.setFinishDate(DateUtils.parseDate(finishDate, PUB_DATE_FORMAT));
            }

            String acceptDateStr = pEls.get(9).html();
            if (acceptDateStr.indexOf(SPLIT) != -1) {
                String acceptDate = acceptDateStr.substring(acceptDateStr.indexOf(SPLIT) + 1);
                item.setAcceptDate(DateUtils.parseDate(acceptDate, PUB_DATE_FORMAT));
            }

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
        return item;

    }


}
