/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.CorpAccountResetPassApplication;
import cn.wuxi.js.lib4.modules.corp.dao.CorpAccountResetPassApplicationDao;

/**
 * 企业密码找回申请Service
 * @author aaronhuang
 * @version 2019-02-11
 */
@Service
@Transactional(readOnly = true)
public class CorpAccountResetPassApplicationService extends CrudService<CorpAccountResetPassApplicationDao, CorpAccountResetPassApplication> {

	public CorpAccountResetPassApplication get(String id) {
		return super.get(id);
	}
	
	public List<CorpAccountResetPassApplication> findList(CorpAccountResetPassApplication corpAccountResetPassApplication) {
		return super.findList(corpAccountResetPassApplication);
	}
	
	public Page<CorpAccountResetPassApplication> findPage(Page<CorpAccountResetPassApplication> page, CorpAccountResetPassApplication corpAccountResetPassApplication) {
		return super.findPage(page, corpAccountResetPassApplication);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpAccountResetPassApplication corpAccountResetPassApplication) {
		super.save(corpAccountResetPassApplication);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpAccountResetPassApplication corpAccountResetPassApplication) {
		super.delete(corpAccountResetPassApplication);
	}
	
}