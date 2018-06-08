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
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.cert.service.CorpCertService;

/**
 * corp_certController
 * @author GLQ
 * @version 2018-04-24
 */
@Controller
@RequestMapping(value = "${adminPath}/cert/corpCert")
public class CorpCertController extends BaseController {

	@Autowired
	private CorpCertService corpCertService;
	
	@ModelAttribute
	public CorpCert get(@RequestParam(required=false) String id) {
		CorpCert entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpCertService.get(id);
		}
		if (entity == null){
			entity = new CorpCert();
		}
		return entity;
	}
	
	@RequiresPermissions("cert:corpCert:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpCert corpCert, HttpServletRequest request, HttpServletResponse response, Model model) {
		
		final String sessionCorpId = "sessionCorpId";
		
		String corpId = corpCert.getCorpId();
		Page<CorpCert> page = null;
		if(StringUtils.isIdEmpty(corpId)){
			corpId = (String) request.getSession().getAttribute(sessionCorpId);
		}
		
		if(!StringUtils.isIdEmpty(corpId)){
			corpCert.setCorpId(corpId);
			page = corpCertService.findPage(new Page<CorpCert>(request, response), corpCert); 
			model.addAttribute("page", page);	
			
			request.getSession().setAttribute(sessionCorpId, corpId);
		}

		return "modules/cert/corpCertList";
	}

	@RequiresPermissions("cert:corpCert:view")
	@RequestMapping(value = "form")
	public String form(CorpCert corpCert, Model model) {
		model.addAttribute("corpCert", corpCert);
		return "modules/cert/corpCertForm";
	}

	@RequiresPermissions("cert:corpCert:edit")
	@RequestMapping(value = "save")
	public String save(CorpCert corpCert, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpCert)){
			return form(corpCert, model);
		}
		corpCertService.save(corpCert);
		addMessage(redirectAttributes, "保存corp_cert成功");
		return "redirect:"+Global.getAdminPath()+"/cert/corpCert/?repage";
	}
	
	@RequiresPermissions("cert:corpCert:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpCert corpCert, RedirectAttributes redirectAttributes) {
		corpCertService.delete(corpCert);
		addMessage(redirectAttributes, "删除corp_cert成功");
		return "redirect:"+Global.getAdminPath()+"/cert/corpCert/?repage";
	}

}