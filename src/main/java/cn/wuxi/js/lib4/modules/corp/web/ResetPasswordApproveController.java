/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.corp.entity.ResetPasswordApply;
import cn.wuxi.js.lib4.modules.corp.service.ResetPasswordApplyService;

/**
 * 密码重置申请Controller
 * @author GLQ
 * @version 2019-06-15
 */
@Controller
@RequestMapping(value = "${adminPath}/corp/resetPasswordApprove")
public class ResetPasswordApproveController extends BaseController {

	@Autowired
	private ResetPasswordApplyService resetPasswordApplyService;
	
	@ModelAttribute
	public ResetPasswordApply get(@RequestParam(required=false) String id) {
		ResetPasswordApply entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = resetPasswordApplyService.get(id);
		}
		if (entity == null){
			entity = new ResetPasswordApply();
		}
		return entity;
	}
	
	@RequiresPermissions("corp:resetPasswordApply:view")
	@RequestMapping(value = {"approveList"})
	public String approveList(ResetPasswordApply resetPasswordApply, HttpServletRequest request, HttpServletResponse response, Model model) {
		if(StringUtils.isEmpty(resetPasswordApply.getStatus())){
			resetPasswordApply.setStatus("1");
		}
		Page<ResetPasswordApply> page = resetPasswordApplyService.findPage(new Page<ResetPasswordApply>(request, response), resetPasswordApply); 
		model.addAttribute("page", page);
		return "modules/corp/resetPasswordApproveList";
	}

	@RequiresPermissions("corp:resetPasswordApply:view")
	@RequestMapping(value = "approveForm")
	public String approveForm(ResetPasswordApply resetPasswordApply, Model model) {
		model.addAttribute("resetPasswordApply", resetPasswordApply);
		return "modules/corp/resetPasswordApproveForm";
	}
	
	@RequiresPermissions("corp:resetPasswordApply:view")
	@RequestMapping(value = "approve")
	public String approve(ResetPasswordApply resetPasswordApply, Model model) {
		resetPasswordApply.setApproveDate(new Date());
		resetPasswordApplyService.approve(resetPasswordApply);
		return "redirect:"+Global.getAdminPath()+"/corp/resetPasswordApprove/approveList?repage";
	}

}