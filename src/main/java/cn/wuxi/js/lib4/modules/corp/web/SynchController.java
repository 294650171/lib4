/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	@Autowired
	private MohurdCorpCrawler mohurdCorpCrawler;
	
	@RequestMapping(value = "")
	@ResponseBody
	public String synch(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String qymc = request.getParameter("qymc");
		logger.debug("begin to synch corp :" + qymc);

		Result result = new Result();

		try {
			mohurdCorpCrawler.start(false, qymc);
		} catch (Exception e) {
			result.setMsg(e.getMessage());
		}

		return JsonMapper.getInstance().toJson(result);
	}

}