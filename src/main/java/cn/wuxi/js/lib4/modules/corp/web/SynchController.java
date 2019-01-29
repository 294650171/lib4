/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wuxi.js.lib4.common.utils.JedisQueueUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wuxi.js.lib4.common.mapper.JsonMapper;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.crawler.service.MohurdCorpCrawler;
import cn.wuxi.js.lib4.modules.sys.entity.Result;

/**
 * 同步Controller
 * 
 * @author huangzhengyu
 * @version 2018-07-06
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/synch")
public class SynchController extends BaseController {

	public static final String QUEUE_KEY = "synch_corp_queue";

	@Autowired
	private MohurdCorpCrawler mohurdCorpCrawler;
	
	@RequestMapping(value = "")
	@ResponseBody
	public String synch(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String qymc = request.getParameter("qymc");
		logger.debug("begin to add synch corp :" + qymc + " to queue");

		Result result = new Result();
		String msg = null;

		try {
//			mohurdCorpCrawler.start(false, qymc);
			// add qymc to task queue
			boolean isInQueue = JedisQueueUtils.isInQueue(QUEUE_KEY,qymc);
			if(isInQueue){
				msg = "您的企业资质同步已在队列中，请勿重复同步";
			}else {
				long size = JedisQueueUtils.lpush(QUEUE_KEY,qymc);
				logger.debug("queue size is " + size + " now");
				msg = "已加入同步队列，请于" + size*2 +  "分钟后重新查看同步结果。";
			}
			result.setMsg(msg);
		} catch (Exception e) {
			result.setMsg(e.getMessage());
		}

		return JsonMapper.getInstance().toJson(result);
	}

}