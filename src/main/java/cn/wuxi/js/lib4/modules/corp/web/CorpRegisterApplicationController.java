/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.web;

import java.io.File;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.wuxi.js.lib4.common.utils.*;
import cn.wuxi.js.lib4.modules.corp.entity.CorpCertType;
import cn.wuxi.js.lib4.modules.corp.entity.CorpType;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.fileupload.FileItem;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.web.BaseController;

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
	public String form(CorpBasicInfoApplication corpBasicInfoApplication, HttpServletRequest request, Model model) {
		
		if(corpBasicInfoApplication.getIsNewRecord()){
			//corpBasicInfoApplication.setProvinceid("320000");
			//corpBasicInfoApplication.setCityid("320200");
		}
		
		if(corpBasicInfoApplication == null || StringUtils.isEmpty(corpBasicInfoApplication.getTyshxydm())){
			if(request.getSession().getAttribute("corpBasicInfoApplication")!=null){
				corpBasicInfoApplication = (CorpBasicInfoApplication)request.getSession().getAttribute("corpBasicInfoApplication");
			}
		}
		
		model.addAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
		return "modules/corp/corpRegisterForm";
	}

	@RequestMapping(value = "save")
	public String save(CorpBasicInfoApplication corpBasicInfoApplication, HttpServletRequest request, Model model,
			RedirectAttributes redirectAttributes) {
		/*
		if (!beanValidator(model, corpBasicInfoApplication)) {
			return form(corpBasicInfoApplication, model);
		}*/
		
		final String destPage = "redirect:" + Global.getFrontPath() + "/corp/corpRegisterApplication/form";
		
		if(!Util.isMobile(corpBasicInfoApplication.getLxdh())){
			addMessage(redirectAttributes, "注册失败，无效的手机号。");
			request.getSession().setAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;
		}
		
		if(!Util.isEmail(corpBasicInfoApplication.getEmail())){
			addMessage(redirectAttributes, "注册失败，无效的电子邮箱。");
			request.getSession().setAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;
		}
		
		//检查是否存在待审核的申请
		CorpBasicInfoApplication param = new CorpBasicInfoApplication();
		param.setTyshxydm(corpBasicInfoApplication.getTyshxydm());
		param.setType(CorpBasicInfoApplication.TYPE_REGISTER);
		List<CorpBasicInfoApplication> list = corpBasicInfoApplicationService.findList(param);
		if(list.size()>0){
			addMessage(redirectAttributes, "注册失败，统一社会信用代码对应的注册信息已存在。");
			request.getSession().setAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
			return destPage;			
		}
		
		String rootDirectory = Global.getConfig("userfiles.basedir");
		
		if (StringUtils.isEmpty(corpBasicInfoApplication.getType())) {
			corpBasicInfoApplication.setType(CorpBasicInfoApplication.TYPE_REGISTER);
		}
		
		String corpCode = CorpUtils.getZzjgdm(corpBasicInfoApplication.getTyshxydm());
		
		corpBasicInfoApplication.setQyid(corpCode);
		corpBasicInfoApplication.setZzjgdm(corpCode);
		corpBasicInfoApplication.setCorpCertIds(Collections3.convertToString(corpBasicInfoApplication.getCorpCertIdList(),","));

		// 检查统一社会信用代码
		String code = corpBasicInfoApplication.getTyshxydm();
		GUser guser = new GUser();	
		guser.setLoginname(code);
		
		List<GUser> userlist = guserDao.findList(guser);

		if (userlist.size() > 0) {
			addMessage(redirectAttributes, "注册失败，统一社会信用代码已存在。");
			request.getSession().setAttribute("corpBasicInfoApplication", corpBasicInfoApplication);
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
		addMessage(redirectAttributes, "注册申请提交成功,审核结果会以短信、邮件通知，请注意查收。");
		return "redirect:" + Global.getFrontPath() + "/corp/corpRegisterApplication/form?repage";
	}
	
	@RequestMapping(value = "delete")
	public String delete(CorpBasicInfoApplication corpBasicInfoApplication, RedirectAttributes redirectAttributes) {
		corpBasicInfoApplicationService.delete(corpBasicInfoApplication);
		addMessage(redirectAttributes, "删除企业基本信息修改申请表成功");
		return "redirect:"+Global.getFrontPath()+"/corp/corpBasicInfoApplication/?repage";
	}

//	@ResponseBody
//	@RequestMapping(value = "treeData")
//	public List<Map<String, Object>> treeData(
//			@RequestParam(required=false) String workshopId,
//			HttpServletResponse response) {
//
//		String parentId = "0";
//
//		List<Map<String, Object>> mapList = Lists.newArrayList();
//		for(CorpType ct : CorpType.values()){
//			Map<String, Object> map = Maps.newHashMap();
//			map.put("id", ct.getValue());
//			map.put("pId", parentId);
//			map.put("name", ct.getName());
//			mapList.add(map);
//
//			if(CorpType.BUILD.equals(ct)){
//				mapList.add(generateMap(ct.getValue(), CorpCertType.FDCKF));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.JSDWQT));
//			} else if(CorpType.SURVEY.equals(ct)){
//				mapList.add(generateMap(ct.getValue(), CorpCertType.GCKC));
//			} else if(CorpType.DESIGN.equals(ct)){
//				mapList.add(generateMap(ct.getValue(), CorpCertType.YTH));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.GCSJ));
//			} else if(CorpType.CONSTRUCT.equals(ct)){
//				mapList.add(generateMap(ct.getValue(), CorpCertType.JZSG));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.YTH));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.YLLH));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.FWCQ));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.AQSCXKZ));
//			} else if(CorpType.AGENCY.equals(ct)){
//				mapList.add(generateMap(ct.getValue(), CorpCertType.GCJL));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.ZBDL));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.ZJZX));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.GCJC));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.SGTSC));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.FDCGJ));
//				mapList.add(generateMap(ct.getValue(), CorpCertType.WYFW));
//			} else if(CorpType.OTHERS.equals(ct)){
//				Map<String, Object> otherMap = Maps.newHashMap();
//				otherMap.put("id", "");
//				otherMap.put("pId", ct.getValue());
//				otherMap.put("name", "其他");
//				mapList.add(otherMap);
//			}
//
//		}
//
//		return mapList;
//	}
//
//	private Map<String,Object> generateMap(String pid, CorpCertType corpCertType) {
//		Map<String, Object> map = Maps.newHashMap();
//		map.put("id", corpCertType.getIndex());
//		map.put("pId", pid);
//		map.put("name", corpCertType.getName());
//		return map;
//	}

}