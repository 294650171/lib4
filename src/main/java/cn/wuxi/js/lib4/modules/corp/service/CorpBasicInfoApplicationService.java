/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.act.service.ActTaskService;
import cn.wuxi.js.lib4.modules.act.utils.ActUtils;
import cn.wuxi.js.lib4.modules.corp.dao.CorpBasicInfoApplicationDao;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyjbxxDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import com.google.common.collect.Maps;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
		variables.put(APPROVE_USER_KEY, "wangxp");
		variables.put(INITIATOR_USER_KEY, bean.getTyshxydm());

		String title = bean.getQymc() + "(" + bean.getTyshxydm() + ")";

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

		if(!qyjbxx.getQymc().equals(changedBean.getQymc())){
			qyjbxx.setQymc(changedBean.getQymc());
		}
		if(!qyjbxx.getProvince().equals(changedBean.getProvince())){
			qyjbxx.setProvince(changedBean.getProvince());
		}
		if(!qyjbxx.getCity().equals(changedBean.getCity())){
			qyjbxx.setCity(changedBean.getCity());
		}
		if(!qyjbxx.getCounty().equals(changedBean.getCounty())){
			qyjbxx.setCounty(changedBean.getCounty());
		}

		qyjbxxDao.selfSave(qyjbxx);




	}

}