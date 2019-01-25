
package cn.wuxi.js.lib4.modules.corp.web;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.utils.UserAgentUtils;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyjbxxService;
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
 * 我的企业基本信息Controller
 * @author huangzhengyu
 * @version 2019-01-22
 */
@Controller
@RequestMapping(value = "${adminPath}/mycorp/basicinfo")
public class MyCorpBasicController extends BaseController {

	@Autowired
	private UeppQyjbxxService ueppQyjbxxService;
	
	@ModelAttribute
	public UeppQyjbxx get(@RequestParam(required=false) String qyid) {
		UeppQyjbxx entity = null;
		User user = UserUtils.getUser();

		if (StringUtils.isNotBlank(user.getLoginName())){
			qyid = CorpUtils.getZzjgdm(user.getLoginName());
			entity = ueppQyjbxxService.get(qyid);
//			entity.setTyshxydm(user.getLoginName());
		}
		if (entity == null){
			entity = new UeppQyjbxx();
		}
		return entity;
	}

	@RequestMapping(value = "form")
	public String form(UeppQyjbxx ueppQyjbxx, Model model) {
		model.addAttribute("bean", ueppQyjbxx);
		return "modules/corp/myCorpBasicForm";
	}

	@RequestMapping(value = "save")
	public String save(UeppQyjbxx ueppQyjbxx, Model model, RedirectAttributes redirectAttributes) {
//		if (!beanValidator(model, ueppQyjbxx)){
//			return form(ueppQyjbxx, model);
//		}
		ueppQyjbxxService.selfSave(ueppQyjbxx);
		addMessage(redirectAttributes, "保存企业基本信息成功");
		return "redirect:"+Global.getAdminPath()+"/mycorp/basicinfo/form?repage";
	}
	
	@RequiresPermissions("corp:ueppQyjbxx:edit")
	@RequestMapping(value = "delete")
	public String delete(UeppQyjbxx ueppQyjbxx, RedirectAttributes redirectAttributes) {
		ueppQyjbxxService.delete(ueppQyjbxx);
		addMessage(redirectAttributes, "删除企业基本信息成功");
		return "redirect:"+Global.getAdminPath()+"/corp/ueppQyjbxx/?repage";
	}

}