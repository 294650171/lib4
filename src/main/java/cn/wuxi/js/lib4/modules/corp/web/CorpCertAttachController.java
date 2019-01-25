/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.sys.entity.User;
import cn.wuxi.js.lib4.modules.sys.utils.UserUtils;
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
import cn.wuxi.js.lib4.modules.corp.entity.CorpCertAttach;
import cn.wuxi.js.lib4.modules.corp.service.CorpCertAttachService;

/**
 * 企业证照Controller
 * @author aaronhuang
 * @version 2019-01-24
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/corpCertAttach")
public class CorpCertAttachController extends BaseController {

	@Autowired
	private CorpCertAttachService corpCertAttachService;
	
	@ModelAttribute
	public CorpCertAttach get(@RequestParam(required=false) String id) {
		CorpCertAttach entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpCertAttachService.get(id);
		}
		if (entity == null){
			User user = UserUtils.getUser();
			if (StringUtils.isNotBlank(user.getLoginName())){
				String qyid = CorpUtils.getZzjgdm(user.getLoginName());
				entity = new CorpCertAttach();
				entity.setZzjgdm(qyid);
			}else {
				entity = new CorpCertAttach();
			}
		}
		return entity;
	}
	
	@RequiresPermissions("corp:corpCertAttach:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpCertAttach corpCertAttach, HttpServletRequest request, HttpServletResponse response, Model model) {

		String qyid = null;
		User user = UserUtils.getUser();
		if (StringUtils.isNotBlank(user.getLoginName())){
			qyid = CorpUtils.getZzjgdm(user.getLoginName());
			corpCertAttach.setZzjgdm(qyid);
		}

		Page<CorpCertAttach> page = corpCertAttachService.findPage(new Page<CorpCertAttach>(request, response), corpCertAttach); 
		model.addAttribute("page", page);
		return "modules/corp/corpCertAttachList";
	}

	@RequiresPermissions("corp:corpCertAttach:view")
	@RequestMapping(value = "form")
	public String form(CorpCertAttach corpCertAttach, Model model) {
		model.addAttribute("corpCertAttach", corpCertAttach);
		return "modules/corp/corpCertAttachForm";
	}

	@RequiresPermissions("corp:corpCertAttach:view")
	@RequestMapping(value = "photoView")
	public String photoView(CorpCertAttach corpCertAttach, HttpServletRequest request, HttpServletResponse response, Model model) {

		String qyid = null;
		User user = UserUtils.getUser();
		if (StringUtils.isNotBlank(user.getLoginName())){
			qyid = CorpUtils.getZzjgdm(user.getLoginName());
			corpCertAttach.setZzjgdm(qyid);
		}

		Page<CorpCertAttach> page = corpCertAttachService.findPage(new Page<CorpCertAttach>(request, response), corpCertAttach);
		model.addAttribute("page", page);
		return "modules/corp/corpCertAttachPhotoView";
	}

	@RequiresPermissions("corp:corpCertAttach:edit")
	@RequestMapping(value = "save")
	public String save(CorpCertAttach corpCertAttach, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpCertAttach)){
			return form(corpCertAttach, model);
		}
		corpCertAttachService.save(corpCertAttach);
		addMessage(redirectAttributes, "保存企业证照成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpCertAttach/?repage";
	}
	
	@RequiresPermissions("corp:corpCertAttach:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpCertAttach corpCertAttach, RedirectAttributes redirectAttributes) {
		corpCertAttachService.delete(corpCertAttach);
		addMessage(redirectAttributes, "删除企业证照成功");
		return "redirect:"+Global.getAdminPath()+"/corp/corpCertAttach/?repage";
	}

}