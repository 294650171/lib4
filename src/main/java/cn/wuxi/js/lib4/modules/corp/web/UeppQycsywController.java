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
import cn.wuxi.js.lib4.modules.corp.entity.UeppQycsyw;
import cn.wuxi.js.lib4.modules.corp.service.UeppQycsywService;

/**
 * 企业从事业务类型Controller
 * @author aaronhuang
 * @version 2019-07-17
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/ueppQycsyw")
public class UeppQycsywController extends BaseController {

	@Autowired
	private UeppQycsywService ueppQycsywService;
	
	@ModelAttribute
	public UeppQycsyw get(@RequestParam(required=false) String id) {
		UeppQycsyw entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = ueppQycsywService.get(id);
		}
		if (entity == null){
			entity = new UeppQycsyw();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:ueppQycsyw:view")
	@RequestMapping(value = {"list", ""})
	public String list(UeppQycsyw ueppQycsyw, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<UeppQycsyw> page = ueppQycsywService.findPage(new Page<UeppQycsyw>(request, response), ueppQycsyw); 
		model.addAttribute("page", page);
		return "modules/corp/ueppQycsywList";
	}

	@RequiresPermissions("corp:ueppQycsyw:view")
	@RequestMapping(value = "form")
	public String form(UeppQycsyw ueppQycsyw, Model model) {
		model.addAttribute("ueppQycsyw", ueppQycsyw);
		return "modules/corp/ueppQycsywForm";
	}

	@RequiresPermissions("corp:ueppQycsyw:edit")
	@RequestMapping(value = "save")
	public String save(UeppQycsyw ueppQycsyw, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, ueppQycsyw)){
			return form(ueppQycsyw, model);
		}
		ueppQycsywService.save(ueppQycsyw);
		addMessage(redirectAttributes, "保存企业从事业务类型成功");
		return "redirect:"+Global.getAdminPath()+"/corp/ueppQycsyw/?repage";
	}
	
	@RequiresPermissions("corp:ueppQycsyw:edit")
	@RequestMapping(value = "delete")
	public String delete(UeppQycsyw ueppQycsyw, RedirectAttributes redirectAttributes) {
		ueppQycsywService.delete(ueppQycsyw);
		addMessage(redirectAttributes, "删除企业从事业务类型成功");
		return "redirect:"+Global.getAdminPath()+"/corp/ueppQycsyw/?repage";
	}

}