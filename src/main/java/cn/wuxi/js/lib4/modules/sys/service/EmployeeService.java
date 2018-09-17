/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.sys.entity.Employee;
import cn.wuxi.js.lib4.modules.sys.dao.EmployeeDao;

/**
 * 员工Service
 * @author huangzhengyu
 * @version 2018-07-06
 */
@Service
@Transactional(readOnly = true)
public class EmployeeService extends CrudService<EmployeeDao, Employee> {

	public Employee get(String id) {
		return super.get(id);
	}
	
	public List<Employee> findList(Employee employee) {
		return super.findList(employee);
	}
	
	public Page<Employee> findPage(Page<Employee> page, Employee employee) {
		return super.findPage(page, employee);
	}
	
	@Transactional(readOnly = false)
	public void save(Employee employee) {
		super.save(employee);
	}
	
	@Transactional(readOnly = false)
	public void delete(Employee employee) {
		super.delete(employee);
	}
	
}