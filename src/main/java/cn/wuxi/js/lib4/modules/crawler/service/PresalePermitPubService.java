/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.crawler.entity.PresalePermitPub;
import cn.wuxi.js.lib4.modules.crawler.dao.PresalePermitPubDao;

/**
 * 商品房预售许可证Service
 * @author huangzhengyu
 * @version 2018-09-16
 */
@Service
@Transactional(readOnly = true)
public class PresalePermitPubService extends CrudService<PresalePermitPubDao, PresalePermitPub> {

	public PresalePermitPub get(String id) {
		return super.get(id);
	}
	
	public List<PresalePermitPub> findList(PresalePermitPub presalePermitPub) {
		return super.findList(presalePermitPub);
	}
	
	public Page<PresalePermitPub> findPage(Page<PresalePermitPub> page, PresalePermitPub presalePermitPub) {
		return super.findPage(page, presalePermitPub);
	}
	
	@Transactional(readOnly = false)
	public void save(PresalePermitPub presalePermitPub) {

		PresalePermitPub existed = this.dao.getByLicenseNoAndNameURL(presalePermitPub);
		if(existed != null){
			presalePermitPub.setId(existed.getId());
		}
		super.save(presalePermitPub);

	}
	
	@Transactional(readOnly = false)
	public void delete(PresalePermitPub presalePermitPub) {
		super.delete(presalePermitPub);
	}
	
}