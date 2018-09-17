/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.sys.entity.EmployeeRole;

/**
 * 员工角色映射表DAO接口
 * @author huangzhengyu
 * @version 2018-07-06
 */
@MyBatisDao
public interface EmployeeRoleDao extends CrudDao<EmployeeRole> {
	
}