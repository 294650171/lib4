/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.sys.entity.Employee;

/**
 * 员工DAO接口
 * @author huangzhengyu
 * @version 2018-07-06
 */
@MyBatisDao
public interface EmployeeDao extends CrudDao<Employee> {
	
}