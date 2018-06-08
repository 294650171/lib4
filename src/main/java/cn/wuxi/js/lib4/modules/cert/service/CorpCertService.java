/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.cert.dao.CorpCertDao;

/**
 * corp_certService
 * @author GLQ
 * @version 2018-04-24
 */
@Service
@Transactional(readOnly = true)
public class CorpCertService extends CrudService<CorpCertDao, CorpCert> {

	public CorpCert get(String id) {
		return super.get(id);
	}
	
	public List<CorpCert> findList(CorpCert corpCert) {
		return super.findList(corpCert);
	}
	
	public Page<CorpCert> findPage(Page<CorpCert> page, CorpCert corpCert) {
		return super.findPage(page, corpCert);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpCert corpCert) {
		super.save(corpCert);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpCert corpCert) {
		super.delete(corpCert);
	}
	
}