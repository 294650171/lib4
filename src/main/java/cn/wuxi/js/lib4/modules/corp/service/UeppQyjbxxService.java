
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.Date;
import java.util.List;

import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.corp.dao.CorpCertAttachDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpCertAttach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyjbxxDao;

/**
 * 企业基本信息Service
 * @author huangzhengyu
 * @version 2018-07-06
 */
@Service
@Transactional(readOnly = true)
public class UeppQyjbxxService extends CrudService<UeppQyjbxxDao, UeppQyjbxx> {

	@Autowired
	private CorpCertAttachDao corpCertAttachDao;

	public UeppQyjbxx get(String id) {
		return super.get(id);
	}
	
	public List<UeppQyjbxx> findList(UeppQyjbxx ueppQyjbxx) {
		return super.findList(ueppQyjbxx);
	}
	
	public Page<UeppQyjbxx> findPage(Page<UeppQyjbxx> page, UeppQyjbxx ueppQyjbxx) {
		return super.findPage(page, ueppQyjbxx);
	}
	
	@Transactional(readOnly = false)
	public void save(UeppQyjbxx ueppQyjbxx) {
		super.save(ueppQyjbxx);
	}

	@Transactional(readOnly = false)
	public void selfSave(UeppQyjbxx ueppQyjbxx) {
		this.dao.selfSave(ueppQyjbxx);

		//处理营业执照
		if(StringUtils.isNotEmpty(ueppQyjbxx.getPhoto())){
			CorpCertAttach entity = new CorpCertAttach();
			entity.setCertType(CorpCertAttach.CERT_TYPE_BUSYNESS_LICENSE);
			entity.setTyshxydm(ueppQyjbxx.getTyshxydm());
			entity.setZzjgdm(ueppQyjbxx.getQyid());

			List<CorpCertAttach> result = this.corpCertAttachDao.findList(entity);
			CorpCertAttach certAttach = null;
			if(result != null && !result.isEmpty()){
				certAttach = result.get(0);
				certAttach.setUrl(ueppQyjbxx.getPhoto());
				certAttach.setName(ueppQyjbxx.getPhoto().substring(ueppQyjbxx.getPhoto().lastIndexOf("/") + 1));
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.update(certAttach);
			}else {
				certAttach = new CorpCertAttach();
				certAttach.setCertType(CorpCertAttach.CERT_TYPE_BUSYNESS_LICENSE);
				certAttach.setTyshxydm(ueppQyjbxx.getTyshxydm());
				certAttach.setZzjgdm(CorpUtils.getZzjgdm(ueppQyjbxx.getTyshxydm()));
				certAttach.setUrl(ueppQyjbxx.getPhoto());
				certAttach.setName(ueppQyjbxx.getPhoto().substring(ueppQyjbxx.getPhoto().lastIndexOf("/") + 1));
				certAttach.setCreateDate(new Date());
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.insert(certAttach);
			}
		}

	}
	
	@Transactional(readOnly = false)
	public void delete(UeppQyjbxx ueppQyjbxx) {
		super.delete(ueppQyjbxx);
	}

	public CorpCertAttachDao getCorpCertAttachDao() {
		return corpCertAttachDao;
	}

	public void setCorpCertAttachDao(CorpCertAttachDao corpCertAttachDao) {
		this.corpCertAttachDao = corpCertAttachDao;
	}
}