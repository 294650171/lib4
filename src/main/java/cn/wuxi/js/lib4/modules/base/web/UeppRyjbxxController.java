/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.web;

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
import cn.wuxi.js.lib4.modules.base.entity.UeppRyjbxx;
import cn.wuxi.js.lib4.modules.base.service.UeppRyjbxxService;

/**
 * 企业人员Controller
 * @author aaronhuang
 * @version 2019-06-28
 */
@Controller
@RequestMapping(value = "${adminPath}/base/ueppRyjbxx")
public class UeppRyjbxxController extends BaseController {

	@Autowired
	private UeppRyjbxxService ueppRyjbxxService;
	
	@ModelAttribute
	public UeppRyjbxx get(@RequestParam(required=false) String id) {
		UeppRyjbxx entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = ueppRyjbxxService.get(id);
		}
		if (entity == null){
			entity = new UeppRyjbxx();
		}
		return entity;
	}
	
	@RequiresPermissions("base:ueppRyjbxx:view")
	@RequestMapping(value = {"list", ""})
	public String list(UeppRyjbxx ueppRyjbxx, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<UeppRyjbxx> page = ueppRyjbxxService.findPage(new Page<UeppRyjbxx>(request, response), ueppRyjbxx); 
		model.addAttribute("page", page);
		return "modules/base/ueppRyjbxxList";
	}

	@RequiresPermissions("base:ueppRyjbxx:view")
	@RequestMapping(value = "form")
	public String form(UeppRyjbxx ueppRyjbxx, Model model) {
		model.addAttribute("ueppRyjbxx", ueppRyjbxx);
		return "modules/base/ueppRyjbxxForm";
	}

	@RequiresPermissions("base:ueppRyjbxx:edit")
	@RequestMapping(value = "save")
	public String save(UeppRyjbxx ueppRyjbxx, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, ueppRyjbxx)){
			return form(ueppRyjbxx, model);
		}
		ueppRyjbxxService.save(ueppRyjbxx);
		addMessage(redirectAttributes, "保存企业人员成功");
		return "redirect:"+Global.getAdminPath()+"/base/ueppRyjbxx/?repage";
	}
	
	@RequiresPermissions("base:ueppRyjbxx:edit")
	@RequestMapping(value = "delete")
	public String delete(UeppRyjbxx ueppRyjbxx, RedirectAttributes redirectAttributes) {
		ueppRyjbxxService.delete(ueppRyjbxx);
		addMessage(redirectAttributes, "删除企业人员成功");
		return "redirect:"+Global.getAdminPath()+"/base/ueppRyjbxx/?repage";
	}

}