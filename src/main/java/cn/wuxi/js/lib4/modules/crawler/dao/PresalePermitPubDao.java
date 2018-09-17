/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.crawler.entity.PresalePermitPub;

/**
 * 商品房预售许可证DAO接口
 * @author huangzhengyu
 * @version 2018-09-16
 */
@MyBatisDao
public interface PresalePermitPubDao extends CrudDao<PresalePermitPub> {
	PresalePermitPub getByLicenseNoAndNameURL(PresalePermitPub bean);
}