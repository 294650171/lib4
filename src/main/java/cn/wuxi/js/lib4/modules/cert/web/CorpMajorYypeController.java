/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.web;

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
import cn.wuxi.js.lib4.modules.cert.entity.CorpMajorYype;
import cn.wuxi.js.lib4.modules.cert.service.CorpMajorYypeService;

/**
 * corpmajortypeController
 * @author GLQ
 * @version 2018-04-24
 */
@Controller
@RequestMapping(value = "${adminPath}/cert/corpMajorYype")
public class CorpMajorYypeController extends BaseController {

	@Autowired
	private CorpMajorYypeService corpMajorYypeService;
	
	@ModelAttribute
	public CorpMajorYype get(@RequestParam(required=false) String id) {
		CorpMajorYype entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpMajorYypeService.get(id);
		}
		if (entity == null){
			entity = new CorpMajorYype();
		}
		return entity;
	}
	
	@RequiresPermissions("cert:corpMajorYype:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpMajorYype corpMajorYype, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpMajorYype> page = corpMajorYypeService.findPage(new Page<CorpMajorYype>(request, response), corpMajorYype); 
		model.addAttribute("page", page);
		return "modules/cert/corpMajorYypeList";
	}

	@RequiresPermissions("cert:corpMajorYype:view")
	@RequestMapping(value = "form")
	public String form(CorpMajorYype corpMajorYype, Model model) {
		model.addAttribute("corpMajorYype", corpMajorYype);
		return "modules/cert/corpMajorYypeForm";
	}

	@RequiresPermissions("cert:corpMajorYype:edit")
	@RequestMapping(value = "save")
	public String save(CorpMajorYype corpMajorYype, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpMajorYype)){
			return form(corpMajorYype, model);
		}
		corpMajorYypeService.save(corpMajorYype);
		addMessage(redirectAttributes, "保存corpmajortype成功");
		return "redirect:"+Global.getAdminPath()+"/cert/corpMajorYype/?repage";
	}
	
	@RequiresPermissions("cert:corpMajorYype:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpMajorYype corpMajorYype, RedirectAttributes redirectAttributes) {
		corpMajorYypeService.delete(corpMajorYype);
		addMessage(redirectAttributes, "删除corpmajortype成功");
		return "redirect:"+Global.getAdminPath()+"/cert/corpMajorYype/?repage";
	}

}