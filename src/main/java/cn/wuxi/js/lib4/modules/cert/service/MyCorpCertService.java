
package cn.wuxi.js.lib4.modules.cert.service;

import cn.wuxi.js.lib4.common.Constants;
import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.common.utils.CorpUtils;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.cert.dao.CorpCertDao;
import cn.wuxi.js.lib4.modules.cert.dao.MyCorpCertDao;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;
import cn.wuxi.js.lib4.modules.corp.dao.CorpCertAttachDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpCertAttach;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyzs;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyzsService;
import cn.wuxi.js.lib4.modules.sys.utils.DictUtils;
import cn.wuxi.js.lib4.modules.sys.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * MyCorpCertService
 * @author huangzhengyu
 * @version 2019-01-23
 */
@Service
@Transactional(readOnly = true)
public class MyCorpCertService extends CrudService<MyCorpCertDao, CorpCert> {

	@Autowired
	private CorpCertAttachDao corpCertAttachDao;

	@Autowired
	private UeppQyzsService ueppQyzsService;

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
	public String saveWithCheck(CorpCert corpCert) {

		String result = null;

		corpCert.setCertType(DictUtils.getDictLabel(corpCert.getCertTypeId(),"corp_cert_type",""));
		super.save(corpCert);
		//处理营业执照
		if(StringUtils.isNotEmpty(corpCert.getPhoto())){
			CorpCertAttach entity = new CorpCertAttach();
			entity.setCertType(CorpCertAttach.CERT_TYPE_QUALIFICATION);
//			entity.setTyshxydm(corpCert.getTyshxydm());
			entity.setZzjgdm(corpCert.getCorpId());
			entity.setCertNo(corpCert.getCertNo());

			List<CorpCertAttach> attachList = this.corpCertAttachDao.findList(entity);
			CorpCertAttach certAttach = null;
			if(attachList != null && !attachList.isEmpty()){
				certAttach = attachList.get(0);
				certAttach.setUrl(corpCert.getPhoto());
				certAttach.setCertNo(corpCert.getCertNo());
				certAttach.setName(corpCert.getPhoto().substring(corpCert.getPhoto().lastIndexOf("/") + 1));
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.update(certAttach);
			}else {
				certAttach = new CorpCertAttach();
				certAttach.setCertType(CorpCertAttach.CERT_TYPE_QUALIFICATION);
				certAttach.setCertNo(corpCert.getCertNo());
				certAttach.setTyshxydm(corpCert.getTyshxydm());
				certAttach.setZzjgdm(corpCert.getCorpId());
				certAttach.setUrl(corpCert.getPhoto());
				certAttach.setName(corpCert.getPhoto().substring(corpCert.getPhoto().lastIndexOf("/") + 1));
				certAttach.setCreateDate(new Date());
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.insert(certAttach);
			}
		}

		//处理安全生产许可证
		if(Constants.AQSCXKZ.equals(corpCert.getCertTypeId())){
			UeppQyzs qyzs = new UeppQyzs();
			qyzs.setQyid(corpCert.getCorpId());
			qyzs.setDefaultDataByType(Constants.AQSCXKZ);
			qyzs.setSfzzz("1");
			qyzs.setZsbh(corpCert.getCertNo());
			qyzs.setZsyxqrq(corpCert.getValidDateStart());
			qyzs.setZsyxzrq(corpCert.getValidDate());
			qyzs.setFzdw(corpCert.getIssueAuthority());
			qyzs.setFzrq(corpCert.getIssueDate());
			qyzs.setXgrqsj(new Date());
			qyzs.setDatastate("0");
			qyzs.setTag(UserUtils.getUser().getLoginName());
			qyzs.setXgr(UserUtils.getUser().getLoginName());
			result = ueppQyzsService.saveWithDuplicateCheck(qyzs);
		}

		return result;

	}
	
	@Transactional(readOnly = false)
	public void updateAttach(CorpCert corpCert) {
		//处理营业执照
		CorpCertAttach entity = new CorpCertAttach();
		entity.setCertType(CorpCertAttach.CERT_TYPE_QUALIFICATION);
//		entity.setTyshxydm(corpCert.getTyshxydm());
		entity.setZzjgdm(corpCert.getCorpId());
		entity.setCertNo(corpCert.getCertNo());

		List<CorpCertAttach> result = this.corpCertAttachDao.findList(entity);
		CorpCertAttach certAttach = null;
		if(StringUtils.isNotEmpty(corpCert.getPhoto())){
			
			if(result != null && !result.isEmpty()){
				certAttach = result.get(0);
				certAttach.setUrl(corpCert.getPhoto());
				certAttach.setCertNo(corpCert.getCertNo());
				certAttach.setName(corpCert.getPhoto().substring(corpCert.getPhoto().lastIndexOf("/") + 1));
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.update(certAttach);
			}else {
				certAttach = new CorpCertAttach();
				certAttach.setCertType(CorpCertAttach.CERT_TYPE_QUALIFICATION);
				certAttach.setCertNo(corpCert.getCertNo());
				certAttach.setTyshxydm(corpCert.getTyshxydm());
				certAttach.setZzjgdm(corpCert.getCorpId());
				certAttach.setUrl(corpCert.getPhoto());
				certAttach.setName(corpCert.getPhoto().substring(corpCert.getPhoto().lastIndexOf("/") + 1));
				certAttach.setCreateDate(new Date());
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.insert(certAttach);
			}
		}else{
			if(result != null && !result.isEmpty()){
				certAttach = result.get(0);
				certAttach.setUrl("");
				certAttach.setCertNo(corpCert.getCertNo());
				certAttach.setName(corpCert.getPhoto().substring(corpCert.getPhoto().lastIndexOf("/") + 1));
				certAttach.setUpdateDate(new Date());
				this.corpCertAttachDao.update(certAttach);
			}			
		}
	}
	
	@Transactional(readOnly = false)
	public void delete(CorpCert corpCert) {
		super.delete(corpCert);
	}
	
}