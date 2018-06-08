/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.cert.entity.CorpTradeType;
import cn.wuxi.js.lib4.modules.cert.dao.CorpTradeTypeDao;

/**
 * corptradetypeService
 * @author GLQ
 * @version 2018-04-24
 */
@Service
@Transactional(readOnly = true)
public class CorpTradeTypeService extends CrudService<CorpTradeTypeDao, CorpTradeType> {

	public CorpTradeType get(String id) {
		return super.get(id);
	}
	
	public List<CorpTradeType> findList(CorpTradeType corpTradeType) {
		return super.findList(corpTradeType);
	}
	
	public Page<CorpTradeType> findPage(Page<CorpTradeType> page, CorpTradeType corpTradeType) {
		return super.findPage(page, corpTradeType);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpTradeType corpTradeType) {
		super.save(corpTradeType);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpTradeType corpTradeType) {
		super.delete(corpTradeType);
	}
	
}