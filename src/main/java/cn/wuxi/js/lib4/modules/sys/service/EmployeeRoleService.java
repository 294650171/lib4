/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.sys.entity.EmployeeRole;
import cn.wuxi.js.lib4.modules.sys.dao.EmployeeRoleDao;

/**
 * 员工角色映射表Service
 * @author huangzhengyu
 * @version 2018-07-06
 */
@Service
@Transactional(readOnly = true)
public class EmployeeRoleService extends CrudService<EmployeeRoleDao, EmployeeRole> {

	public EmployeeRole get(String id) {
		return super.get(id);
	}
	
	public List<EmployeeRole> findList(EmployeeRole employeeRole) {
		return super.findList(employeeRole);
	}
	
	public Page<EmployeeRole> findPage(Page<EmployeeRole> page, EmployeeRole employeeRole) {
		return super.findPage(page, employeeRole);
	}
	
	@Transactional(readOnly = false)
	public void save(EmployeeRole employeeRole) {
		super.save(employeeRole);
	}
	
	@Transactional(readOnly = false)
	public void delete(EmployeeRole employeeRole) {
		super.delete(employeeRole);
	}
	
}