package cn.wuxi.js.lib4.task;

import cn.wuxi.js.lib4.crawler.service.PresalePermitCrawler;
import cn.wuxi.js.lib4.crawler.service.StructureDeclarationCrawler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aaronhuang on 2018/12/17.
 */

@Component("structureDeclarationCrawlerTask")
public class StructureDeclarationCrawlerTask {
    protected Logger logger = LoggerFactory.getLogger(StructureDeclarationCrawlerTask.class);

    @Autowired
    StructureDeclarationCrawler structureDeclarationCrawler;

    public void execute(){
        logger.info("StructureDeclarationCrawlerTask.execute start");
        long start = System.currentTimeMillis();

        try {
            structureDeclarationCrawler.start();
            Thread.sleep(30*1000l);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }

        long end = System.currentTimeMillis();
        logger.info("StructureDeclarationCrawlerTask.execute:" + (end - start) + " secs");
    }

}
