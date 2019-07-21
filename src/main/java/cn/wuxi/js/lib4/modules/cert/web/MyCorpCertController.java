
package cn.wuxi.js.lib4.modules.cert.web;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.cert.service.CorpCertService;
import cn.wuxi.js.lib4.modules.cert.service.MyCorpCertService;
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

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  MyCorpCertController
 * @author huang.zhengyu
 * @version 2019-01-23
 */
@Controller
@RequestMapping(value = "${adminPath}/mycorp/cert")
public class MyCorpCertController extends BaseController {

	@Autowired
	private MyCorpCertService corpCertService;
	
	@ModelAttribute
	public CorpCert get(@RequestParam(required=false) String id) {
		CorpCert entity = null;
		if (StringUtils.isNotBlank(id)){
			entity = corpCertService.get(id);
		}
		if (entity == null){
			User user = UserUtils.getUser();
			if (StringUtils.isNotBlank(user.getLoginName())){
				String qyid = CorpUtils.getZzjgdm(user.getLoginName());
				entity = new CorpCert();
				entity.setCorpId(qyid);
				entity.setTyshxydm(user.getLoginName());
				entity.setQymc(user.getName());
			}
		}
		return entity;
	}
	
	@RequiresPermissions("mycorp:cert:view")
	@RequestMapping(value = {"list", ""})
	public String list(CorpCert corpCert, HttpServletRequest request, HttpServletResponse response, Model model) {

		String qyid = null;
		User user = UserUtils.getUser();
		if (StringUtils.isNotBlank(user.getLoginName())){
			qyid = CorpUtils.getZzjgdm(user.getLoginName());

		}
		Page<CorpCert> page = null;
		if(!StringUtils.isIdEmpty(qyid)){
			corpCert.setCorpId(qyid);
			page = corpCertService.findPage(new Page<CorpCert>(request, response), corpCert); 
			model.addAttribute("page", page);
		}

		return "modules/cert/myCorpCertList";
	}

	@RequiresPermissions("mycorp:cert:view")
	@RequestMapping(value = "form")
	public String form(CorpCert corpCert, Model model) {
		model.addAttribute("corpCert", corpCert);
		return "modules/cert/myCorpCertForm";
	}

	@RequiresPermissions("mycorp:cert:edit")
	@RequestMapping(value = "save")
	public String save(CorpCert corpCert, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpCert)){
			return form(corpCert, model);
		}
		String result = corpCertService.saveWithCheck(corpCert);
		addMessage(redirectAttributes, result);
		return "redirect:"+Global.getAdminPath()+"/mycorp/cert?repage";
	}
	
	@RequiresPermissions("mycorp:cert:edit")
	@RequestMapping(value = "upload")
	public String upload(CorpCert corpCert, Model model, RedirectAttributes redirectAttributes) {
		if (!beanValidator(model, corpCert)){
			return form(corpCert, model);
		}
		corpCertService.saveWithCheck(corpCert);
		addMessage(redirectAttributes, "保存附件成功");
		return "redirect:"+Global.getAdminPath()+"/mycorp/cert?repage";
	}
	
	@RequiresPermissions("mycorp:cert:edit")
	@RequestMapping(value = "delete")
	public String delete(CorpCert corpCert, RedirectAttributes redirectAttributes) {
		corpCertService.delete(corpCert);
		addMessage(redirectAttributes, "删除corp_cert成功");
		return "redirect:"+Global.getAdminPath()+"/mycorp/cert/?repage";
	}

}