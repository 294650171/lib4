/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccount;
import cn.wuxi.js.lib4.modules.corp.dao.CorpBasicAccountDao;

/**
 * 企业基本帐号Service
 * @author huang.zhengyu
 * @version 2019-01-17
 */
@Service
@Transactional(readOnly = true)
public class CorpBasicAccountService extends CrudService<CorpBasicAccountDao, CorpBasicAccount> {

	public CorpBasicAccount get(String id) {
		return super.get(id);
	}
	
	public List<CorpBasicAccount> findList(CorpBasicAccount CorpBasicAccount) {
		return super.findList(CorpBasicAccount);
	}

	public CorpBasicAccount findByTyshxydm(String tyshxydm ){
		return this.dao.findByTyshxydm(tyshxydm);
	}
	
	public Page<CorpBasicAccount> findPage(Page<CorpBasicAccount> page, CorpBasicAccount CorpBasicAccount) {
		return super.findPage(page, CorpBasicAccount);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpBasicAccount CorpAccountResetPassApplication) {
		super.save(CorpAccountResetPassApplication);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpBasicAccount CorpAccountResetPassApplication) {
		super.delete(CorpAccountResetPassApplication);
	}
	
}