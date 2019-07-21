/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.collect.Maps;

import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.common.utils.EmailUtil;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.utils.Util;
import cn.wuxi.js.lib4.modules.corp.entity.ResetPasswordApply;
import cn.wuxi.js.lib4.modules.notify.AliyunMessageSender;
import cn.wuxi.js.lib4.modules.notify.DbMessageSender;
import cn.wuxi.js.lib4.modules.notify.MessageSender;
import cn.wuxi.js.lib4.modules.sys.dao.GUserDao;
import cn.wuxi.js.lib4.modules.sys.entity.GUser;
import cn.wuxi.js.lib4.modules.act.service.ActTaskService;
import cn.wuxi.js.lib4.modules.act.utils.ActUtils;
import cn.wuxi.js.lib4.modules.corp.dao.ResetPasswordApplyDao;

/**
 * 密码重置申请Service
 * @author GLQ
 * @version 2019-06-15
 */
@Service
@Transactional(readOnly = true)
public class ResetPasswordApplyService extends CrudService<ResetPasswordApplyDao, ResetPasswordApply> {
	
	public static final String APPROVE_USER_KEY = "userid";
	public static final String INITIATOR_USER_KEY = "applyuserid";
	
	@Autowired
	private ActTaskService actTaskService;
	
	@Autowired
	private GUserDao gUserDao;

	public ResetPasswordApply get(String id) {
		return super.get(id);
	}
	
	public List<ResetPasswordApply> findList(ResetPasswordApply resetPasswordApply) {
		return super.findList(resetPasswordApply);
	}
	
	public Page<ResetPasswordApply> findPage(Page<ResetPasswordApply> page, ResetPasswordApply resetPasswordApply) {
		return super.findPage(page, resetPasswordApply);
	}
	
	@Transactional(readOnly = false)
	public void save(ResetPasswordApply resetPasswordApply) {
		
		super.save(resetPasswordApply);
		
		// 启动流程
		Map<String, Object> variables = new HashMap<String, Object>();
		variables.put(APPROVE_USER_KEY, Global.getConfig("admin.account"));
		variables.put(INITIATOR_USER_KEY, resetPasswordApply.getEntityCode());

		String title = "密码重置申请，"+resetPasswordApply.getEntityName() + "(" + resetPasswordApply.getEntityCode() + ")";

		String procInsId = actTaskService.startProcess(ActUtils.PD_RESET_PASS_APPLY[0], ActUtils.PD_RESET_PASS_APPLY[1], resetPasswordApply.getId(), title,variables);
		
		//resetPasswordApply.setProcInsId(procInsId);
		
		//dao.updateProcInsId(resetPasswordApply);
	}
	
	@Transactional(readOnly = false)
	public void delete(ResetPasswordApply resetPasswordApply) {
		super.delete(resetPasswordApply);
	}
	
	@Transactional(readOnly = false)
	public void approve(ResetPasswordApply resetPasswordApply) {
		String approveFlag = resetPasswordApply.getAct().getFlag();

		String status = ("true".equals(approveFlag) ? Global.STATUS_APPROVED: Global.STATUS_REJECTED);

		resetPasswordApply.getAct().setComment(("true".equals(approveFlag) ? "[同意] " : "[驳回] ") + resetPasswordApply.getAct().getComment());
		resetPasswordApply.preUpdate();


		Map<String, Object> vars = Maps.newHashMap();
		
		logger.debug("act:{}", resetPasswordApply.getAct().toString());
	
		actTaskService.complete(resetPasswordApply.getAct().getTaskId(), resetPasswordApply.getAct().getProcInsId(), resetPasswordApply.getAct().getComment(), vars);

		//CorpBasicInfoApplication entity = this.get(bean.getId());
		
		resetPasswordApply.setApproveOpinion(resetPasswordApply.getAct().getComment());
		
		dao.approve(resetPasswordApply);
		
		String temp = "";
		MessageFormat mf;
		String msg = "";
		if(Global.STATUS_APPROVED.equals(resetPasswordApply.getStatus())){
			//reset password
			String randomnPass = Util.getRandomStr(6);
			GUser entity = new GUser();
			entity.setLoginname(resetPasswordApply.getEntityCode());
			entity.setLoginpassword(randomnPass);
			gUserDao.updatePass(entity);
			//msg
			temp = Global.getConfig("resetPassSuccessMsgNotify");
			mf = new MessageFormat(temp);
			String[] msgParams = {
					randomnPass
			};
			msg = mf.format(msgParams);
			this.messageNotify(resetPasswordApply, msg);
			
			//mail
			temp = Global.getConfig("resetPassSuccessMailNotify");
			mf = new MessageFormat(temp);
			String[] mailParams = {
					resetPasswordApply.getEntityName(),
					randomnPass
			};
			msg = mf.format(mailParams);
			this.mailNotify(resetPasswordApply, msg);
			
		}else if(Global.STATUS_REJECTED.equals(resetPasswordApply.getStatus())){
			String link = Global.getConfig("resetPassFormLink")+resetPasswordApply.getId();
			//msg
			temp = Global.getConfig("resetPassFailMsgNotify");
			mf = new MessageFormat(temp);
			String[] msgParams = {
					resetPasswordApply.getApproveOpinion(),
					link
			};
			msg = mf.format(msgParams);
			this.messageNotify(resetPasswordApply, msg);
			
			//mail
			temp = Global.getConfig("resetPassFailMailNotify");
			mf = new MessageFormat(temp);
			String[] mailParams = {
					resetPasswordApply.getEntityName(),
					resetPasswordApply.getApproveOpinion(),
					link
			};
			msg = mf.format(mailParams);
			this.mailNotify(resetPasswordApply, msg);			
		}
	}
	
	private void messageNotify(ResetPasswordApply resetPasswordApply, String msg){
		//message
		String phone = resetPasswordApply.getMobile();
		//MessageSender sender = new DbMessageSender();
		
		MessageSender sender = new AliyunMessageSender(); 
		
		try {
			sender.send(phone, msg);
		} catch (SQLException e) {
			 logger.error("send message error", e);
		}
		
	}
	
	private void mailNotify(ResetPasswordApply resetPasswordApply, String msg){
		//email
		String email = resetPasswordApply.getEmail();
		if(StringUtils.isNotEmpty(email)){
			try {
				EmailUtil.sendEmail(email, "密码重置提示", msg);
			} catch (Exception e) {
				logger.error("send mail error", e);
			}
		}
		
	}
	
}