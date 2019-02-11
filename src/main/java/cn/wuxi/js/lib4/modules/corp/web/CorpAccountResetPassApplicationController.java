/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import cn.wuxi.js.lib4.modules.corp.entity.CorpAccountResetPassApplication;
import cn.wuxi.js.lib4.modules.corp.service.CorpAccountResetPassApplicationService;

/**
 * 企业密码找回申请Controller
 * @author aaronhuang
 * @version 2019-02-11
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/corpAccountResetPassApplication")
public class CorpAccountResetPassApplicationController extends BaseController {

	@Autowired
	private CorpAccountResetPassApplicationService corpAccountResetPassApplicationService;
	
	@ModelAttribute
	public CorpAccountResetPassApplication get(@RequestParam(required=false) String id) {
		CorpAccountResetPassApplication entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpAccountResetPassApplicationService.get(id);
		}
		if (entity == null){
			entity = new CorpAccountResetPassApplication();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:corpAccountResetPassApplication:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpAccountResetPassApplication corpAccountResetPassApplication, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpAccountResetPassApplication> page = corpAccountResetPassApplicationService.findPage(new Page<CorpAccountResetPassApplication>(request, response), corpAccountResetPassApplication);
		model.addAttribute("page", page);
		return "modules/corp/corpAccountResetPassApplicationList";
	}

	@RequiresPermissions("corp:corpAccountResetPassApplication:view")
	@RequestMapping(value = "form")
	public String form(CorpAccountResetPassApplication corpAccountResetPassApplication, Model model) {
		model.addAttribute("corpAccountResetPassApplication", corpAccountResetPassApplication);
		return "modules/corp/corpAccountResetPassApplicationForm";
	}

	@RequiresPermissions("corp:corpAccountResetPassApplication:edit")
	@RequestMapping(value = "save")
	public String save(CorpAccountResetPassApplication corpAccountResetPassApplication, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpAccountResetPassApplication)){
			return form(corpAccountResetPassApplication, model);
		}
		corpAccountResetPassApplicationService.save(corpAccountResetPassApplication);
		addMessage(redirectAttributes, "保存企业密码找回申请成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpAccountResetPassApplication/?repage";
	}
	
	@RequiresPermissions("corp:corpAccountResetPassApplication:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpAccountResetPassApplication corpAccountResetPassApplication, RedirectAttributes redirectAttributes) {
		corpAccountResetPassApplicationService.delete(corpAccountResetPassApplication);
		addMessage(redirectAttributes, "删除企业密码找回申请成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpAccountResetPassApplication/?repage";
	}

}