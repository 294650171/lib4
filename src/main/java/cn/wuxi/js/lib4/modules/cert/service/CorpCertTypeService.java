/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCertType;
import cn.wuxi.js.lib4.modules.cert.dao.CorpCertTypeDao;

/**
 * corpcerttypeService
 * @author GLQ
 * @version 2018-04-24
 */
@Service
@Transactional(readOnly = true)
public class CorpCertTypeService extends CrudService<CorpCertTypeDao, CorpCertType> {

	public CorpCertType get(String id) {
		return super.get(id);
	}
	
	public List<CorpCertType> findList(CorpCertType corpCertType) {
		return super.findList(corpCertType);
	}
	
	public Page<CorpCertType> findPage(Page<CorpCertType> page, CorpCertType corpCertType) {
		return super.findPage(page, corpCertType);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpCertType corpCertType) {
		super.save(corpCertType);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpCertType corpCertType) {
		super.delete(corpCertType);
	}
	
}