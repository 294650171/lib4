/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.cert.entity.CorpMajorYype;
import cn.wuxi.js.lib4.modules.cert.dao.CorpMajorYypeDao;

/**
 * corpmajortypeService
 * @author GLQ
 * @version 2018-04-24
 */
@Service
@Transactional(readOnly = true)
public class CorpMajorYypeService extends CrudService<CorpMajorYypeDao, CorpMajorYype> {

	public CorpMajorYype get(String id) {
		return super.get(id);
	}
	
	public List<CorpMajorYype> findList(CorpMajorYype corpMajorYype) {
		return super.findList(corpMajorYype);
	}
	
	public Page<CorpMajorYype> findPage(Page<CorpMajorYype> page, CorpMajorYype corpMajorYype) {
		return super.findPage(page, corpMajorYype);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpMajorYype corpMajorYype) {
		super.save(corpMajorYype);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpMajorYype corpMajorYype) {
		super.delete(corpMajorYype);
	}
	
}