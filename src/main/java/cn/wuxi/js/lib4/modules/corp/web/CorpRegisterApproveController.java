/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicInfoApplicationService;

/**
 * 企业注册审核Controller
 * @author GLQ
 * @version 2019-01-31
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/corpRegisterApprove")
public class CorpRegisterApproveController extends BaseController {

	@Autowired
	private CorpBasicInfoApplicationService corpBasicInfoApplicationService;
	
	@ModelAttribute
	public CorpBasicInfoApplication get(@RequestParam(required=false) String id) {
		CorpBasicInfoApplication entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpBasicInfoApplicationService.get(id);
		}
		if (entity == null){
			entity = new CorpBasicInfoApplication();
		}
		return entity;
	}
	
	@RequestMapping(value = {"list", ""})
	public String list(CorpBasicInfoApplication corpBasicInfoApplication, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpBasicInfoApplication> page = corpBasicInfoApplicationService.findPage(new Page<CorpBasicInfoApplication>(request, response), corpBasicInfoApplication); 
		model.addAttribute("page", page);
		return "modules/corp/corpBasicInfoApplicationList";
	}

	@RequestMapping(value = "form")
	public String form(CorpBasicInfoApplication entity, Model model) {
		
		logger.debug("act:", entity.getAct().toString());
		
		model.addAttribute("corpBasicInfoApplication", entity);
		return "modules/corp/corpRegisterApproveForm";
	}

	@RequestMapping(value = "approve")
	public String approve(CorpBasicInfoApplication corpBasicInfoApplication, Model model, RedirectAttributes redirectAttributes) {
		
		corpBasicInfoApplicationService.corpRegisterApprove(corpBasicInfoApplication);
		
		addMessage(redirectAttributes, "注册申请处理成功");

		return "redirect:" + adminPath + "/act/task/todo/";
	}
	
	@RequestMapping(value = "delete")
	public String delete(CorpBasicInfoApplication corpBasicInfoApplication, RedirectAttributes redirectAttributes) {
		corpBasicInfoApplicationService.delete(corpBasicInfoApplication);
		addMessage(redirectAttributes, "删除企业基本信息修改申请表成功");
		return "redirect:"+Global.getFrontPath()+"/corp/corpBasicInfoApplication/?repage";
	}

}