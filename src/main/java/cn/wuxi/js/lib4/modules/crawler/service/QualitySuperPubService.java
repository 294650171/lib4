/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.crawler.entity.QualitySuperPub;
import cn.wuxi.js.lib4.modules.crawler.dao.QualitySuperPubDao;

/**
 * 网站数据Service
 * @author huangzhengyu
 * @version 2018-09-15
 */
@Service
@Transactional(readOnly = true)
public class QualitySuperPubService extends CrudService<QualitySuperPubDao, QualitySuperPub> {

	public QualitySuperPub get(String id) {
		return super.get(id);
	}
	
	public List<QualitySuperPub> findList(QualitySuperPub qualitySuperPub) {
		return super.findList(qualitySuperPub);
	}
	
	public Page<QualitySuperPub> findPage(Page<QualitySuperPub> page, QualitySuperPub qualitySuperPub) {
		return super.findPage(page, qualitySuperPub);
	}
	
	@Transactional(readOnly = false)
	public void save(QualitySuperPub qualitySuperPub) {
		super.save(qualitySuperPub);
	}
	
	@Transactional(readOnly = false)
	public void delete(QualitySuperPub qualitySuperPub) {
		super.delete(qualitySuperPub);
	}
	
}