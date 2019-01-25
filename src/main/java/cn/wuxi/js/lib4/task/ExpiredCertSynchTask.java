package cn.wuxi.js.lib4.task;

import cn.wuxi.js.lib4.crawler.service.MohurdCorpCrawler;
import cn.wuxi.js.lib4.crawler.service.PresalePermitCrawler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aaronhuang on 2018/12/17.
 */

@Component("expiredCertSynchTask")
public class ExpiredCertSynchTask {
    protected Logger logger = LoggerFactory.getLogger(ExpiredCertSynchTask.class);

    @Autowired
    private MohurdCorpCrawler mohurdCorpCrawler;

    public void execute(){
        logger.info("ExpiredCertSynchTask.execute start");
        long start = System.currentTimeMillis();

        try {
            mohurdCorpCrawler.startCrawlerExpiredCert(false);
            Thread.sleep(30*1000l);
        } catch (Exception e) {
            logger.error(e.getMessage());

        }

        long end = System.currentTimeMillis();
        logger.info("ExpiredCertSynchTask.execute:" + (end - start) + " secs");
    }

}
