/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
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
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccount;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicAccountService;

/**
 * 企业基本帐号Controller
 * @author huang.zhengyu
 * @version 2019-01-17
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/corpBasicAccount")
public class CorpBasicAccountController extends BaseController {

	@Autowired
	private CorpBasicAccountService corpBasicAccountService;
	
	@ModelAttribute
	public CorpBasicAccount get(@RequestParam(required=false) String id) {
		CorpBasicAccount entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpBasicAccountService.get(id);
		}
		if (entity == null){
			entity = new CorpBasicAccount();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:corpBasicAccount:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpBasicAccount corpBasicAccount, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpBasicAccount> page = corpBasicAccountService.findPage(new Page<CorpBasicAccount>(request, response), corpBasicAccount);
		model.addAttribute("page", page);
		return "modules/corp/corpBasicAccountList";
	}

	@RequiresPermissions("corp:corpBasicAccount:view")
	@RequestMapping(value = "form")
	public String form(CorpBasicAccount corpBasicAccount, Model model) {
		model.addAttribute("corpBasicAccount", corpBasicAccount);
		return "modules/corp/corpBasicAccountForm";
	}

	@RequiresPermissions("corp:corpBasicAccount:edit")
	@RequestMapping(value = "save")
	public String save(CorpBasicAccount corpBasicAccount, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpBasicAccount)){
			return form(corpBasicAccount, model);
		}
		corpBasicAccountService.save(corpBasicAccount);
		addMessage(redirectAttributes, "保存企业基本帐号成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpBasicAccount/?repage";
	}
	
	@RequiresPermissions("corp:corpBasicAccount:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpBasicAccount corpBasicAccount, RedirectAttributes redirectAttributes) {
		corpBasicAccountService.delete(corpBasicAccount);
		addMessage(redirectAttributes, "删除企业基本帐号成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpBasicAccount/?repage";
	}

}