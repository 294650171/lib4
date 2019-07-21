/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.common.utils.EmailUtil;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.utils.Util;
import cn.wuxi.js.lib4.modules.act.service.ActTaskService;
import cn.wuxi.js.lib4.modules.act.utils.ActUtils;
import cn.wuxi.js.lib4.modules.corp.dao.CorpBasicInfoApplicationDao;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyjbxxDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import cn.wuxi.js.lib4.modules.corp.entity.ResetPasswordApply;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.notify.DbMessageSender;
import cn.wuxi.js.lib4.modules.notify.MessageSender;
import cn.wuxi.js.lib4.modules.sys.dao.GUserDao;
import cn.wuxi.js.lib4.modules.sys.entity.GUser;

import com.google.common.collect.Maps;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 企业基本信息修改申请表Service
 * @author aaronhuang
 * @version 2019-01-31
 */
@Service
@Transactional(readOnly = true)
public class CorpBasicInfoApplicationService extends CrudService<CorpBasicInfoApplicationDao, CorpBasicInfoApplication> {


	public static final String APPROVE_USER_KEY = "userid";
	public static final String INITIATOR_USER_KEY = "applyuserid";

	@Autowired
	private ActTaskService actTaskService;

	@Autowired
	RuntimeService runService;

	@Autowired
	UeppQyjbxxDao qyjbxxDao;
	
	@Autowired
	GUserDao guserDao;

	public CorpBasicInfoApplication get(String id) {
		return super.get(id);
	}
	
	public List<CorpBasicInfoApplication> findList(CorpBasicInfoApplication corpBasicInfoApplication) {
		return super.findList(corpBasicInfoApplication);
	}
	
	public Page<CorpBasicInfoApplication> findPage(Page<CorpBasicInfoApplication> page, CorpBasicInfoApplication corpBasicInfoApplication) {
		return super.findPage(page, corpBasicInfoApplication);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpBasicInfoApplication corpBasicInfoApplication) {
		super.save(corpBasicInfoApplication);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpBasicInfoApplication corpBasicInfoApplication) {
		super.delete(corpBasicInfoApplication);
	}

	@Transactional(readOnly = false)
	public void deleteByQyid(String qyid , String procInsId) {

		List<Execution> executions = runService.createExecutionQuery()
				.processInstanceId(procInsId).list();
		logger.debug("executions : " + executions.size());
		if (executions != null && !executions.isEmpty()) {
			runService.deleteProcessInstance(procInsId,
					"reason");
		}

		this.dao.deleteByProcInsId(qyid, procInsId);
	}


	@Transactional(readOnly = false)
	public void corpInfoChangeApply(CorpBasicInfoApplication bean) {

		// 启动流程
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put(APPROVE_USER_KEY, Global.getConfig("admin.account"));
		variables.put(INITIATOR_USER_KEY, bean.getTyshxydm());

		String title = "企业信息修改申请，"+bean.getQymc() + "(" + bean.getTyshxydm() + ")";

		actTaskService.startProcess(ActUtils.PD_CORPINFO_APPLICATION[0], ActUtils.PD_CORPINFO_APPLICATION[1], bean.getId(), title,variables);

	}

	@Transactional(readOnly = false)
	public void corpInfoChangeApprove(CorpBasicInfoApplication bean) {

		String status = ("true".equals(bean.getAct().getFlag()) ? CorpBasicInfoApplication.DATASTATE_PASS : CorpBasicInfoApplication.DATASTATE_REJECT );

		bean.getAct().setComment(("true".equals(bean.getAct().getFlag()) ? "[同意] " : "[驳回] ") + bean.getAct().getComment());
		bean.preUpdate();


		Map<String, Object> vars = Maps.newHashMap();
		vars.put("pass", bean.getAct().getFlag());
		actTaskService.complete(bean.getAct().getTaskId(), bean.getAct().getProcInsId(), bean.getAct().getComment(), vars);

		CorpBasicInfoApplication changedBean = this.get(bean.getId());

		this.dao.updateStatus(bean.getId(),status);

		UeppQyjbxx qyjbxx = qyjbxxDao.get(changedBean.getQyid());

		if(StringUtils.isEmpty(qyjbxx.getQymc()) || !qyjbxx.getQymc().equals(changedBean.getQymc())){
			qyjbxx.setQymc(changedBean.getQymc());
		}
		if(StringUtils.isEmpty(qyjbxx.getProvince()) || !qyjbxx.getProvince().equals(changedBean.getProvince())){
			qyjbxx.setProvince(changedBean.getProvince());
		}
		if(StringUtils.isEmpty(qyjbxx.getCity()) || !qyjbxx.getCity().equals(changedBean.getCity())){
			qyjbxx.setCity(changedBean.getCity());
		}
		if(StringUtils.isEmpty(qyjbxx.getCounty()) || !qyjbxx.getCounty().equals(changedBean.getCounty())){
			qyjbxx.setCounty(changedBean.getCounty());
		}
		
		qyjbxx.setPhoto(changedBean.getPhoto());

		qyjbxxDao.selfSave(qyjbxx);

	}
	
	@Transactional(readOnly = false)
	public void corpRegisterApply(CorpBasicInfoApplication bean) {
		
		dao.insert(bean);

		// 启动流程
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put(APPROVE_USER_KEY, Global.getConfig("admin.account"));
		variables.put(INITIATOR_USER_KEY, bean.getTyshxydm());

		String title = "企业注册申请，"+bean.getQymc() + "(" + bean.getTyshxydm() + ")";

		String procInsId = actTaskService.startProcess(ActUtils.PD_REGISTER_CORP_APPLICATION[0], ActUtils.PD_REGISTER_CORP_APPLICATION[1], bean.getId(), title,variables);
		
		//bean.setProcInsId(procInsId);
		
		//dao.updateProcInsId(bean);

	}

	@Transactional(readOnly = false)
	public void corpRegisterApprove(CorpBasicInfoApplication bean) {
		
		String approveFlag = bean.getAct().getFlag();

		String status = ("true".equals(bean.getAct().getFlag()) ? CorpBasicInfoApplication.DATASTATE_PASS : CorpBasicInfoApplication.DATASTATE_REJECT );

		bean.getAct().setComment(("true".equals(bean.getAct().getFlag()) ? "[同意] " : "[驳回] ") + bean.getAct().getComment());
		bean.preUpdate();


		Map<String, Object> vars = Maps.newHashMap();
		
		logger.debug("act:{}", bean.getAct().toString());
	
		actTaskService.complete(bean.getAct().getTaskId(), bean.getAct().getProcInsId(), bean.getAct().getComment(), vars);

		//CorpBasicInfoApplication entity = this.get(bean.getId());
		
		bean.setApproveOpinion(bean.getAct().getComment());

		this.dao.updateStatus(bean.getId(),status);
		
		this.dao.updateOpinion(bean);
		
		String temp = "";
		MessageFormat mf;
		String msg = "";
		
		if("true".equals(approveFlag)){
			//保存基本信息
			UeppQyjbxx qyjbxx = new UeppQyjbxx();
			BeanUtils.copyProperties(bean, qyjbxx);

			qyjbxxDao.insert(qyjbxx);

			//保存账户信息
			
			int maxUserId = guserDao.getMaxUserId();
			
			GUser guser = new GUser();
			//TODO is id auto increased
			guser.setUserid((maxUserId+1)+"");
			
			guser.setLoginname(bean.getTyshxydm());

			guser.setLoginpassword(bean.getPassword());
			guser.setUsername(bean.getQymc());
			guser.setUserregtime(new Date());
			guser.setUsertype("");
			guser.setOrgname(bean.getQymc());
			guser.setUserstate("正常用户");
			
			guserDao.insert(guser);		
			
			//msg
			temp = Global.getConfig("registerSuccessMsgNotify");
			mf = new MessageFormat(temp);
			String[] msgParams = {
					bean.getPassword()
			};
			msg = mf.format(msgParams);
			this.messageNotify(bean, msg);
			
			//mail
			temp = Global.getConfig("registerSuccessMailNotify");
			mf = new MessageFormat(temp);
			String[] mailParams = {
					bean.getQymc(),
					bean.getPassword()
			};
			msg = mf.format(mailParams);
			this.mailNotify(bean, msg);
		}else{
			String link = Global.getConfig("registerFormLink")+bean.getId();
			//msg
			temp = Global.getConfig("registerFailMsgNotify");
			mf = new MessageFormat(temp);
			String[] msgParams = {
					bean.getApproveOpinion(),
					link
			};
			msg = mf.format(msgParams);
			this.messageNotify(bean, msg);
			
			//mail
			temp = Global.getConfig("registerFailMailNotify");
			mf = new MessageFormat(temp);
			String[] mailParams = {
					bean.getQymc(),
					bean.getApproveOpinion(),
					link
			};
			msg = mf.format(mailParams);
			this.mailNotify(bean, msg);			
		}

	}
	
	private void messageNotify(CorpBasicInfoApplication bean, String msg){
		//message
		String phone = bean.getLxdh();
		MessageSender sender = new DbMessageSender();
		
		try {
			sender.send(phone, msg);
		} catch (SQLException e) {
			 logger.error("send message error", e);
		}
		
	}
	
	private void mailNotify(CorpBasicInfoApplication bean, String msg){
		//email
		String email = bean.getEmail();
		if(StringUtils.isNotEmpty(email)){
			try {
				EmailUtil.sendEmail(email, "企业注册提示", msg);
			} catch (Exception e) {
				logger.error("send mail error", e);
			}
		}
		
	}

}