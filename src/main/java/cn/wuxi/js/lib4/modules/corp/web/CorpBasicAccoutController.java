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
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccout;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicAccoutService;

/**
 * 企业基本帐号Controller
 * @author huang.zhengyu
 * @version 2019-01-17
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/corpBasicAccout")
public class CorpBasicAccoutController extends BaseController {

	@Autowired
	private CorpBasicAccoutService corpBasicAccoutService;
	
	@ModelAttribute
	public CorpBasicAccout get(@RequestParam(required=false) String id) {
		CorpBasicAccout entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpBasicAccoutService.get(id);
		}
		if (entity == null){
			entity = new CorpBasicAccout();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:corpBasicAccout:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpBasicAccout corpBasicAccout, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpBasicAccout> page = corpBasicAccoutService.findPage(new Page<CorpBasicAccout>(request, response), corpBasicAccout); 
		model.addAttribute("page", page);
		return "modules/corp/corpBasicAccoutList";
	}

	@RequiresPermissions("corp:corpBasicAccout:view")
	@RequestMapping(value = "form")
	public String form(CorpBasicAccout corpBasicAccout, Model model) {
		model.addAttribute("corpBasicAccout", corpBasicAccout);
		return "modules/corp/corpBasicAccoutForm";
	}

	@RequiresPermissions("corp:corpBasicAccout:edit")
	@RequestMapping(value = "save")
	public String save(CorpBasicAccout corpBasicAccout, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpBasicAccout)){
			return form(corpBasicAccout, model);
		}
		corpBasicAccoutService.save(corpBasicAccout);
		addMessage(redirectAttributes, "保存企业基本帐号成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpBasicAccout/?repage";
	}
	
	@RequiresPermissions("corp:corpBasicAccout:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpBasicAccout corpBasicAccout, RedirectAttributes redirectAttributes) {
		corpBasicAccoutService.delete(corpBasicAccout);
		addMessage(redirectAttributes, "删除企业基本帐号成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpBasicAccout/?repage";
	}

}