/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业基本帐号Entity
 * @author huang.zhengyu
 * @version 2019-01-17
 */
public class CorpBasicAccount extends DataEntity<CorpBasicAccount> {
	
	private static final long serialVersionUID = 1L;
	private String tyshxydm;		// tyshxydm
	private String zzjgdm;		// zzjgdm
	private String name;		// name
	private String cellphone;		// cellphone
	private String password;		// password
	
	public CorpBasicAccount() {
		super();
	}

	public CorpBasicAccount(String id){
		super(id);
	}

	@Length(min=0, max=50, message="tyshxydm长度必须介于 0 和 50 之间")
	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	
	@Length(min=0, max=50, message="zzjgdm长度必须介于 0 和 50 之间")
	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}
	
	@Length(min=0, max=50, message="name长度必须介于 0 和 50 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=100, message="cellphone长度必须介于 0 和 100 之间")
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	@Length(min=0, max=100, message="password长度必须介于 0 和 100 之间")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}