package cn.wuxi.js.lib4.task;

import cn.wuxi.js.lib4.common.utils.JedisQueueUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.crawler.service.MohurdCorpCrawler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by aaronhuang on 2018/12/17.
 */

@Component("corpSynchTask")
public class CorpSynchTask {
    protected Logger logger = LoggerFactory.getLogger(CorpSynchTask.class);
    private final static String QUEUE_KEY = "synch_corp_queue";
    @Autowired
    private MohurdCorpCrawler mohurdCorpCrawler;

    public void execute(){
        logger.info("CorpSynchTask.execute start");
        long start = System.currentTimeMillis();

        String qymc = JedisQueueUtils.rpop(QUEUE_KEY);

        if(StringUtils.isNotEmpty(qymc)){
            try {
                logger.info("begin to synch " + qymc );
                mohurdCorpCrawler.start(false , qymc);
            } catch (Exception e) {
                logger.error(e.getMessage());
            }
        }


        long end = System.currentTimeMillis();
        logger.info("CorpSynchTask.execute:" + (end - start) + " secs");
    }

}
