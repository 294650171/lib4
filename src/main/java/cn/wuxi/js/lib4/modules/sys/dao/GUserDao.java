/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.sys.entity.GUser;

/**
 * 用户DAO接口
 * @author GLQ
 * @version 2019-06-15
 */
@MyBatisDao
public interface GUserDao extends CrudDao<GUser> {
	
	public int updatePass(GUser entity);
	
	public GUser getByLoginName(GUser entity);
	
	public int getMaxUserId();
	
}