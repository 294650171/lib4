
package cn.wuxi.js.lib4.modules.cert.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.cert.entity.CorpCert;

/**
 * MyCorpCertDao
 * @author huangzhengyu
 * @version 2019-01-23
 */
@MyBatisDao
public interface MyCorpCertDao extends CrudDao<CorpCert> {
	
}