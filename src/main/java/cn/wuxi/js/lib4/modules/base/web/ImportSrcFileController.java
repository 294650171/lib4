/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.web;

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
import cn.wuxi.js.lib4.modules.base.entity.ImportSrcFile;
import cn.wuxi.js.lib4.modules.base.service.ImportSrcFileService;

/**
 * 文件导入Controller
 * @author aaronhuang
 * @version 2019-06-27
 */
@Controller
@RequestMapping(value = "${adminPath}/base/importSrcFile")
public class ImportSrcFileController extends BaseController {

	@Autowired
	private ImportSrcFileService importSrcFileService;
	
	@ModelAttribute
	public ImportSrcFile get(@RequestParam(required=false) String id) {
		ImportSrcFile entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = importSrcFileService.get(id);
		}
		if (entity == null){
			entity = new ImportSrcFile();
		}
		return entity;
	}
	
	@RequiresPermissions("base:importSrcFile:view")
	@RequestMapping(value = {"list", ""})
	public String list(ImportSrcFile importSrcFile, HttpServletRequest request, HttpServletResponse response, Model model) {
		Page<ImportSrcFile> page = importSrcFileService.findPage(new Page<ImportSrcFile>(request, response), importSrcFile); 
		model.addAttribute("page", page);
		return "modules/base/importSrcFileList";
	}

	@RequiresPermissions("base:importSrcFile:view")
	@RequestMapping(value = "form")
	public String form(ImportSrcFile importSrcFile, Model model) {
		model.addAttribute("importSrcFile", importSrcFile);
		return "modules/base/importSrcFileForm";
	}

	@RequiresPermissions("base:importSrcFile:edit")
	@RequestMapping(value = "save")
	public String save(ImportSrcFile importSrcFile, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, importSrcFile)){
			return form(importSrcFile, model);
		}
		importSrcFileService.save(importSrcFile);
		addMessage(redirectAttributes, "保存文件导入成功");
		return "redirect:"+Global.getAdminPath()+"/base/importSrcFile/?repage";
	}
	
	@RequiresPermissions("base:importSrcFile:edit")
	@RequestMapping(value = "delete")
	public String delete(ImportSrcFile importSrcFile, RedirectAttributes redirectAttributes) {
		importSrcFileService.delete(importSrcFile);
		addMessage(redirectAttributes, "删除文件导入成功");
		return "redirect:"+Global.getAdminPath()+"/base/importSrcFile/?repage";
	}

}