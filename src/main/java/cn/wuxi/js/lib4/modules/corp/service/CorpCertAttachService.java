
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.CorpCertAttach;
import cn.wuxi.js.lib4.modules.corp.dao.CorpCertAttachDao;

/**
 * 企业证照Service
 * @author aaronhuang
 * @version 2019-01-24
 */
@Service
@Transactional(readOnly = true)
public class CorpCertAttachService extends CrudService<CorpCertAttachDao, CorpCertAttach> {

	public CorpCertAttach get(String id) {
		return super.get(id);
	}
	
	public List<CorpCertAttach> findList(CorpCertAttach corpCertAttach) {
		return super.findList(corpCertAttach);
	}
	
	public Page<CorpCertAttach> findPage(Page<CorpCertAttach> page, CorpCertAttach corpCertAttach) {
		return super.findPage(page, corpCertAttach);
	}
	
	@Transactional(readOnly = false)
	public void save(CorpCertAttach corpCertAttach) {
		super.save(corpCertAttach);
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpCertAttach corpCertAttach) {
		super.delete(corpCertAttach);
	}
	
}