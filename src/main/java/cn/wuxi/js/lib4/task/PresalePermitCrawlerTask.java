package cn.wuxi.js.lib4.task;

import cn.wuxi.js.lib4.crawler.service.PresalePermitCrawler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aaronhuang on 2018/12/17.
 */

@Component("presalePermitCrawlerTask")
public class PresalePermitCrawlerTask {
    protected Logger logger = LoggerFactory.getLogger(PresalePermitCrawlerTask.class);

    @Autowired
    PresalePermitCrawler presalePermitCrawler;

    public void execute(){
        logger.info("PresalePermitCrawlerTask.execute start");
        long start = System.currentTimeMillis();

        try {
            presalePermitCrawler.start();
            Thread.sleep(30*1000l);
        } catch (Exception e) {
            logger.error(e.getMessage());

        }

        long end = System.currentTimeMillis();
        logger.info("PresalePermitCrawlerTask.execute:" + (end - start) + " secs");
    }

}
