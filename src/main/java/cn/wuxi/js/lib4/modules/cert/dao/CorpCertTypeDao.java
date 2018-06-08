/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCertType;

/**
 * corpcerttypeDAO接口
 * @author GLQ
 * @version 2018-04-24
 */
@MyBatisDao
public interface CorpCertTypeDao extends CrudDao<CorpCertType> {
	
}