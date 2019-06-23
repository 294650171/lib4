/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import java.io.File;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.common.utils.FileUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.corp.entity.ResetPasswordApply;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.service.ResetPasswordApplyService;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyjbxxService;

/**
 * 密码重置申请Controller
 * @author GLQ
 * @version 2019-06-15
 */
@Controller
@RequestMapping(value = "/b/corp/resetPasswordApply")
public class ResetPasswordApplyController extends BaseController {

	@Autowired
	private ResetPasswordApplyService resetPasswordApplyService;
	
	@Autowired
	private UeppQyjbxxService ueppQyjbxxService;
	
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
	
	@RequestMapping(value = {"list", ""})
	public String list(ResetPasswordApply resetPasswordApply, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ResetPasswordApply> page = resetPasswordApplyService.findPage(new Page<ResetPasswordApply>(request, response), resetPasswordApply); 
		model.addAttribute("page", page);
		return "modules/corp/resetPasswordApplyList";
	}

	@RequestMapping(value = "form")
	public String form(ResetPasswordApply resetPasswordApply, Model model) {
		model.addAttribute("resetPasswordApply", resetPasswordApply);
		return "modules/corp/resetPasswordApplyForm";
	}

	@RequestMapping(value = "save")
	public String save(ResetPasswordApply resetPasswordApply, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, resetPasswordApply)){
			return form(resetPasswordApply, model);
		}
		
		final String destPage = "redirect:"+"/b/corp/resetPasswordApply/form?repage";
		
		String rootDirectory = Global.getConfig("userfiles.basedir");
		
		//检查统一社会信用代码
		String code = resetPasswordApply.getEntityCode();
		UeppQyjbxx ueppQyjbxx = new UeppQyjbxx();
		ueppQyjbxx.setYyzzzch(code);
		List<UeppQyjbxx> list = ueppQyjbxxService.findList(ueppQyjbxx);
		if(list.size()==0){
			addMessage(redirectAttributes, "提交失败，统一社会信用代码不存在。可能原因：1、填写错误；2、企业未注册。");
			model.addAttribute("resetPasswordApply", resetPasswordApply);
			return destPage;
		}

		try{
			CommonsMultipartFile file = resetPasswordApply.getAttachmentFile();
			if(file!=null){
				FileItem fi = file.getFileItem();
				
				logger.debug("fi.getName(): "+fi.getName()+", fi.getSize(): "+fi.getSize());
				if(StringUtils.isNoneEmpty(fi.getName()) && fi.getSize()>0){
					String dir = rootDirectory + Global.USERFILES_BASE_URL + "resetpass/" + resetPasswordApply.getEntityCode() + "/";
					String fileUri = "/lib4" + Global.USERFILES_BASE_URL + "resetpass/" + resetPasswordApply.getEntityCode() + "/" +fi.getName();
					
					String fullPath = dir + fi.getName();
					
					FileUtils.prepareDir(dir);
					
					resetPasswordApply.setAttach(fileUri);
					
				    File target = new File(fullPath);
				    fi.write(target);					
				}				
			}
		}catch(Exception ex){
			logger.error("", ex);
		}
		
		resetPasswordApply.setApplyDate(new Date());
		resetPasswordApply.setStatus(ResetPasswordApply.STATUS_POST);
		resetPasswordApplyService.save(resetPasswordApply);
		addMessage(redirectAttributes, "密码重置申请成功,申请被审核后，重置后的随机密码会发送到指定的手机号码。");
		return destPage;
	}
	
	@RequiresPermissions("corp:resetPasswordApply:edit")
	@RequestMapping(value = "delete")
	public String delete(ResetPasswordApply resetPasswordApply, RedirectAttributes redirectAttributes) {
		resetPasswordApplyService.delete(resetPasswordApply);
		addMessage(redirectAttributes, "删除密码重置申请成功");
		return "redirect:"+"/b/corp/resetPasswordApply/?repage";
	}

}