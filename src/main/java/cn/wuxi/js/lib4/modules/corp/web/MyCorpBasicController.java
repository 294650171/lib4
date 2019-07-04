
package cn.wuxi.js.lib4.modules.corp.web;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.utils.UserAgentUtils;
import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.service.CorpBasicInfoApplicationService;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyjbxxService;
import cn.wuxi.js.lib4.modules.sys.entity.User;
import cn.wuxi.js.lib4.modules.sys.utils.UserUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.List;

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
	@Autowired
	private CorpBasicInfoApplicationService applyService;
	
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

	@RequestMapping(value = "info")
	public String info(UeppQyjbxx ueppQyjbxx, Model model) {

        CorpBasicInfoApplication corpBasicInfoApplication = new CorpBasicInfoApplication();
        corpBasicInfoApplication.setQyid(ueppQyjbxx.getQyid());
        //查找是否有待审核的
        corpBasicInfoApplication.setDatastate(CorpBasicInfoApplication.DATASTATE_TODO);
        List<CorpBasicInfoApplication> todoList =  applyService.findList(corpBasicInfoApplication);

		CorpBasicInfoApplication todoBean = null;
        if(todoList != null && !todoList.isEmpty()){
            model.addAttribute("canSubmit",false );
            model.addAttribute("procInsId", todoList.get(0).getProcInsId());
			todoBean = todoList.get(0);
			todoBean.setAct(ueppQyjbxx.getAct());
        }else {
            model.addAttribute("canSubmit",true);
        }

		model.addAttribute("bean", ueppQyjbxx);
		return "modules/corp/myCorpBasicForm";
	}

	@RequestMapping(value = "form")
	public String form(CorpBasicInfoApplication corpBasicInfoApplication, Model model) {

//		CorpBasicInfoApplication corpBasicInfoApplication = new CorpBasicInfoApplication();
//		corpBasicInfoApplication.setQyid(ueppQyjbxx.getQyid());

		CorpBasicInfoApplication todoBean = applyService.get(corpBasicInfoApplication.getId());

		logger.debug("ueppQyjbxx.getAct().isFinishTask() : " + corpBasicInfoApplication.getAct().isFinishTask());
		String taskDefKey = corpBasicInfoApplication.getAct().getTaskDefKey();
		logger.debug("taskDefKey : " + taskDefKey);
		todoBean.setAct(corpBasicInfoApplication.getAct());
		model.addAttribute("bean", todoBean);

		if(corpBasicInfoApplication.getAct().isFinishTask()){
			return "modules/corp/myCorpBasicFormView";
		}else if("verificationTask".equals(taskDefKey)){
			return "modules/corp/myCorpBasicFormAudit";
		}else {
			return "modules/corp/myCorpBasicFormView";
		}
	}

	@RequestMapping(value = "history")
    public String history(UeppQyjbxx ueppQyjbxx, Model model) {
        model.addAttribute("bean", ueppQyjbxx);

		CorpBasicInfoApplication corpBasicInfoApplication = new CorpBasicInfoApplication();
		corpBasicInfoApplication.setQyid(ueppQyjbxx.getQyid());
		List<CorpBasicInfoApplication> result = applyService.findList(corpBasicInfoApplication);

		model.addAttribute("list", result);

        return "modules/corp/myCorpBasicHistory";
    }

	@RequestMapping(value = "save")
	public String save(UeppQyjbxx ueppQyjbxx, Model model, RedirectAttributes redirectAttributes) {
//		if (!beanValidator(model, ueppQyjbxx)){
//			return form(ueppQyjbxx, model);
//		}

		User user = UserUtils.getUser();
		logger.debug("isCorpAccount:" + user.isCorpAccount());

		CorpBasicInfoApplication applyBean = new CorpBasicInfoApplication();
		BeanUtils.copyProperties(ueppQyjbxx, applyBean);
		applyBean.setXgrqsj(new Date());

        applyService.save(applyBean);

		applyService.corpInfoChangeApply(applyBean);
		addMessage(redirectAttributes, "企业基本信息修改申请提交成功");
		return "redirect:"+Global.getAdminPath()+"/mycorp/basicinfo/info?repage";
	}

	@RequestMapping(value = "audit")
	public String audit(CorpBasicInfoApplication applyBean, Model model, RedirectAttributes redirectAttributes) {

		applyService.corpInfoChangeApprove(applyBean);

		return "redirect:" + adminPath + "/act/task/todo/";
	}

	@RequestMapping(value = "delete")
	public String delete(UeppQyjbxx ueppQyjbxx, RedirectAttributes redirectAttributes, HttpServletRequest request) {
//		ueppQyjbxxService.delete(ueppQyjbxx);
//		addMessage(redirectAttributes, "删除企业基本信息成功");

		String qyid = request.getParameter("qyid");
		String procInsId = request.getParameter("procInsId");

		applyService.deleteByQyid(qyid, procInsId);
		addMessage(redirectAttributes, "撤销成功");
		return "redirect:"+Global.getAdminPath()+"/mycorp/basicinfo/form?repage";
	}

}