/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.web;

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
import cn.wuxi.js.lib4.modules.crawler.entity.QualitySuperPub;
import cn.wuxi.js.lib4.modules.crawler.service.QualitySuperPubService;

/**
 * 网站数据Controller
 * @author huangzhengyu
 * @version 2018-09-15
 */
@Controller
@RequestMapping(value = "${adminPath}/crawler/qualitySuperPub")
public class QualitySuperPubController extends BaseController {

	@Autowired
	private QualitySuperPubService qualitySuperPubService;
	
	@ModelAttribute
	public QualitySuperPub get(@RequestParam(required=false) String id) {
		QualitySuperPub entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = qualitySuperPubService.get(id);
		}
		if (entity == null){
			entity = new QualitySuperPub();
		}
		return entity;
	}
	
	@RequiresPermissions("crawler:qualitySuperPub:view")
	@RequestMapping(value = {"list", ""})
	public String list(QualitySuperPub qualitySuperPub, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<QualitySuperPub> page = qualitySuperPubService.findPage(new Page<QualitySuperPub>(request, response), qualitySuperPub); 
		model.addAttribute("page", page);
		return "modules/crawler/qualitySuperPubList";
	}

	@RequiresPermissions("crawler:qualitySuperPub:view")
	@RequestMapping(value = "form")
	public String form(QualitySuperPub qualitySuperPub, Model model) {
		model.addAttribute("qualitySuperPub", qualitySuperPub);
		return "modules/crawler/qualitySuperPubForm";
	}

	@RequiresPermissions("crawler:qualitySuperPub:edit")
	@RequestMapping(value = "save")
	public String save(QualitySuperPub qualitySuperPub, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, qualitySuperPub)){
			return form(qualitySuperPub, model);
		}
		qualitySuperPubService.save(qualitySuperPub);
		addMessage(redirectAttributes, "保存网站数据成功");
		return "redirect:"+Global.getAdminPath()+"/crawler/qualitySuperPub/?repage";
	}
	
	@RequiresPermissions("crawler:qualitySuperPub:edit")
	@RequestMapping(value = "delete")
	public String delete(QualitySuperPub qualitySuperPub, RedirectAttributes redirectAttributes) {
		qualitySuperPubService.delete(qualitySuperPub);
		addMessage(redirectAttributes, "删除网站数据成功");
		return "redirect:"+Global.getAdminPath()+"/crawler/qualitySuperPub/?repage";
	}

}