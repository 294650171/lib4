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
import cn.wuxi.js.lib4.modules.crawler.entity.PresalePermitPub;
import cn.wuxi.js.lib4.modules.crawler.service.PresalePermitPubService;

/**
 * 商品房预售许可证Controller
 * @author huangzhengyu
 * @version 2018-09-16
 */
@Controller
@RequestMapping(value = "${adminPath}/crawler/presalePermitPub")
public class PresalePermitPubController extends BaseController {

	@Autowired
	private PresalePermitPubService presalePermitPubService;
	
	@ModelAttribute
	public PresalePermitPub get(@RequestParam(required=false) String id) {
		PresalePermitPub entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = presalePermitPubService.get(id);
		}
		if (entity == null){
			entity = new PresalePermitPub();
		}
		return entity;
	}
	
	@RequiresPermissions("crawler:presalePermitPub:view")
	@RequestMapping(value = {"list", ""})
	public String list(PresalePermitPub presalePermitPub, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<PresalePermitPub> page = presalePermitPubService.findPage(new Page<PresalePermitPub>(request, response), presalePermitPub); 
		model.addAttribute("page", page);
		return "modules/crawler/presalePermitPubList";
	}

	@RequiresPermissions("crawler:presalePermitPub:view")
	@RequestMapping(value = "form")
	public String form(PresalePermitPub presalePermitPub, Model model) {
		model.addAttribute("presalePermitPub", presalePermitPub);
		return "modules/crawler/presalePermitPubForm";
	}

	@RequiresPermissions("crawler:presalePermitPub:edit")
	@RequestMapping(value = "save")
	public String save(PresalePermitPub presalePermitPub, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, presalePermitPub)){
			return form(presalePermitPub, model);
		}
		presalePermitPubService.save(presalePermitPub);
		addMessage(redirectAttributes, "保存商品房预售许可证成功");
		return "redirect:"+Global.getAdminPath()+"/crawler/presalePermitPub/?repage";
	}
	
	@RequiresPermissions("crawler:presalePermitPub:edit")
	@RequestMapping(value = "delete")
	public String delete(PresalePermitPub presalePermitPub, RedirectAttributes redirectAttributes) {
		presalePermitPubService.delete(presalePermitPub);
		addMessage(redirectAttributes, "删除商品房预售许可证成功");
		return "redirect:"+Global.getAdminPath()+"/crawler/presalePermitPub/?repage";
	}

}