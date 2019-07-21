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
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyzs;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyzsService;

/**
 * 企业证书Controller
 * @author aaronhuang
 * @version 2019-07-18
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/ueppQyzs")
public class UeppQyzsController extends BaseController {

	@Autowired
	private UeppQyzsService ueppQyzsService;
	
	@ModelAttribute
	public UeppQyzs get(@RequestParam(required=false) String id) {
		UeppQyzs entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = ueppQyzsService.get(id);
		}
		if (entity == null){
			entity = new UeppQyzs();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:ueppQyzs:view")
	@RequestMapping(value = {"list", ""})
	public String list(UeppQyzs ueppQyzs, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<UeppQyzs> page = ueppQyzsService.findPage(new Page<UeppQyzs>(request, response), ueppQyzs); 
		model.addAttribute("page", page);
		return "modules/corp/ueppQyzsList";
	}

	@RequiresPermissions("corp:ueppQyzs:view")
	@RequestMapping(value = "form")
	public String form(UeppQyzs ueppQyzs, Model model) {
		model.addAttribute("ueppQyzs", ueppQyzs);
		return "modules/corp/ueppQyzsForm";
	}

	@RequiresPermissions("corp:ueppQyzs:edit")
	@RequestMapping(value = "save")
	public String save(UeppQyzs ueppQyzs, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, ueppQyzs)){
			return form(ueppQyzs, model);
		}
		ueppQyzsService.save(ueppQyzs);
		addMessage(redirectAttributes, "保存企业证书成功");
		return "redirect:"+Global.getAdminPath()+"/corp/ueppQyzs/?repage";
	}
	
	@RequiresPermissions("corp:ueppQyzs:edit")
	@RequestMapping(value = "delete")
	public String delete(UeppQyzs ueppQyzs, RedirectAttributes redirectAttributes) {
		ueppQyzsService.delete(ueppQyzs);
		addMessage(redirectAttributes, "删除企业证书成功");
		return "redirect:"+Global.getAdminPath()+"/corp/ueppQyzs/?repage";
	}

}