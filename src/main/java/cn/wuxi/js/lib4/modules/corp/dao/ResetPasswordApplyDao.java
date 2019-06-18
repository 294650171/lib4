/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.corp.entity.ResetPasswordApply;

/**
 * 密码重置申请DAO接口
 * @author GLQ
 * @version 2019-06-15
 */
@MyBatisDao
public interface ResetPasswordApplyDao extends CrudDao<ResetPasswordApply> {
	
	public void approve(ResetPasswordApply entity);
	
}