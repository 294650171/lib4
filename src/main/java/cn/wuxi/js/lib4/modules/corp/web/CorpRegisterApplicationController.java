/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import java.io.File;
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
import cn.wuxi.js.lib4.common.utils.Util;
import cn.wuxi.js.lib4.modules.base.utils.CorpCodeUtils;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicInfoApplicationService;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyjbxxService;
import cn.wuxi.js.lib4.modules.sys.dao.GUserDao;
import cn.wuxi.js.lib4.modules.sys.entity.GUser;

/**
 * 企业基本信息修改申请表Controller
 * @author aaronhuang
 * @version 2019-01-31
 */
@Controller
@RequestMapping(value = "${frontPath}/corp/corpRegisterApplication")
public class CorpRegisterApplicationController extends BaseController {

	@Autowired
	private CorpBasicInfoApplicationService corpBasicInfoApplicationService;
	
	@Autowired
	private UeppQyjbxxService ueppQyjbxxService;
	
	@Autowired
	private GUserDao guserDao;
	
	@ModelAttribute
	public CorpBasicInfoApplication get(@RequestParam(required=false) String id) {
		CorpBasicInfoApplication entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpBasicInfoApplicationService.get(id);
		}
		if (entity == null){
			entity = new CorpBasicInfoApplication();
		}
		return entity;
	}
	
	@RequestMapping(value = {"list", ""})
	public String list(CorpBasicInfoApplication corpBasicInfoApplication, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<CorpBasicInfoApplication> page = corpBasicInfoApplicationService.findPage(new Page<CorpBasicInfoApplication>(request, response), corpBasicInfoApplication); 
		model.addAttribute("page", page);
		return "modules/corp/corpBasicInfoApplicationList";
	}

	@RequestMapping(value = "form")
	public String form(CorpBasicInfoApplication corpBasicInfoApplication, Model model) {
		
		if(corpBasicInfoApplication.getIsNewRecord()){
			//corpBasicInfoApplication.setProvinceid("320000");
			//corpBasicInfoApplication.setCityid("320200");
		}
		
		model.addAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
		return "modules/corp/corpRegisterForm";
	}

	@RequestMapping(value = "save")
	public String save(CorpBasicInfoApplication corpBasicInfoApplication, Model model,
			RedirectAttributes redirectAttributes) {
		/*
		if (!beanValidator(model, corpBasicInfoApplication)) {
			return form(corpBasicInfoApplication, model);
		}*/
		
		final String destPage = "redirect:"+Global.getFrontPath()+"/corp/corpRegisterApplication/form";
		
		if(!Util.isMobile(corpBasicInfoApplication.getLxdh())){
			addMessage(redirectAttributes, "注册失败，无效的手机号。");
			model.addAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;
		}
		
		if(!Util.isEmail(corpBasicInfoApplication.getEmail())){
			addMessage(redirectAttributes, "注册失败，无效的电子邮箱。");
			model.addAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;
		}
		
		String rootDirectory = Global.getConfig("userfiles.basedir");
		
		if (StringUtils.isEmpty(corpBasicInfoApplication.getType())) {
			corpBasicInfoApplication.setType(CorpBasicInfoApplication.TYPE_REGISTER);
		}
		
		String corpCode = CorpCodeUtils.parseOrgCode(corpBasicInfoApplication.getTyshxydm());
		
		corpBasicInfoApplication.setQyid(corpCode);
		corpBasicInfoApplication.setZzjgdm(corpCode);

		// 检查统一社会信用代码
		String code = corpBasicInfoApplication.getTyshxydm();
		GUser guser = new GUser();	
		guser.setLoginname(code);
		
		List<GUser> list = guserDao.findList(guser);

		if (list.size() > 0) {
			addMessage(redirectAttributes, "注册失败，统一社会信用代码已存在。");
			model.addAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;
		}

		try {
			CommonsMultipartFile file = corpBasicInfoApplication.getAttachmentFile();
			if (file != null) {
				FileItem fi = file.getFileItem();

				logger.debug("fi.getName(): " + fi.getName() + ", fi.getSize(): " + fi.getSize());
				if (StringUtils.isNoneEmpty(fi.getName()) && fi.getSize() > 0) {
					String dir = rootDirectory + Global.USERFILES_BASE_URL + "register/"
							+ corpBasicInfoApplication.getTyshxydm() + "/";
					String fileUri = "/lib4" + Global.USERFILES_BASE_URL + "register/"
							+ corpBasicInfoApplication.getTyshxydm() + "/" + fi.getName();

					String fullPath = dir + fi.getName();

					FileUtils.prepareDir(dir);

					corpBasicInfoApplication.setPhoto(fileUri);

					File target = new File(fullPath);
					fi.write(target);
				}
			}
		} catch (Exception ex) {
			logger.error("", ex);
		}

		corpBasicInfoApplication.setDatastate(CorpBasicInfoApplication.DATASTATE_TODO);
		corpBasicInfoApplicationService.corpRegisterApply(corpBasicInfoApplication);
		addMessage(redirectAttributes, "注册申请提交成功");
		return "redirect:" + Global.getFrontPath() + "/corp/corpRegisterApplication/form?repage";
	}
	
	@RequestMapping(value = "delete")
	public String delete(CorpBasicInfoApplication corpBasicInfoApplication, RedirectAttributes redirectAttributes) {
		corpBasicInfoApplicationService.delete(corpBasicInfoApplication);
		addMessage(redirectAttributes, "删除企业基本信息修改申请表成功");
		return "redirect:"+Global.getFrontPath()+"/corp/corpBasicInfoApplication/?repage";
	}

}