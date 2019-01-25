/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccout;
import cn.wuxi.js.lib4.modules.corp.dao.CorpBasicAccoutDao;

/**
 * 企业基本帐号Service
 * @author huang.zhengyu
 * @version 2019-01-17
 */
@Service
@Transactional(readOnly = true)
public class CorpBasicAccoutService extends CrudService<CorpBasicAccoutDao, CorpBasicAccout> {

	public CorpBasicAccout get(String id) {
		return super.get(id);
	}
	
	public List<CorpBasicAccout> findList(CorpBasicAccout corpBasicAccout) {
		return super.findList(corpBasicAccout);
	}

	public CorpBasicAccout findByTyshxydm(String tyshxydm ){
		return this.dao.findByTyshxydm(tyshxydm);
	}
	
	public Page<CorpBasicAccout> findPage(Page<CorpBasicAccout> page, CorpBasicAccout corpBasicAccout) {
		return super.findPage(page, corpBasicAccout);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpBasicAccout corpBasicAccout) {
		super.save(corpBasicAccout);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpBasicAccout corpBasicAccout) {
		super.delete(corpBasicAccout);
	}
	
}