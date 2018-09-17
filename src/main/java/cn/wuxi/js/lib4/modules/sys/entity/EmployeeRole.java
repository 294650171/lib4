/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.sys.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 员工角色映射表Entity
 * @author huangzhengyu
 * @version 2018-07-06
 */
public class EmployeeRole extends DataEntity<EmployeeRole> {
	
	private static final long serialVersionUID = 1L;
	private String employeeId;		// employee_id
	private String roleId;		// role_id
	
	public EmployeeRole() {
		super();
	}

	public EmployeeRole(String id){
		super(id);
	}

	@Length(min=0, max=50, message="employee_id长度必须介于 0 和 50 之间")
	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	@Length(min=0, max=50, message="role_id长度必须介于 0 和 50 之间")
	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	
}