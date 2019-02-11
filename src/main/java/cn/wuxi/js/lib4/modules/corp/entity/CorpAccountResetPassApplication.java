/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业密码找回申请Entity
 * @author aaronhuang
 * @version 2019-02-11
 */
public class CorpAccountResetPassApplication extends DataEntity<CorpAccountResetPassApplication> {
	
	private static final long serialVersionUID = 1L;
	private String tyshxydm;		// 统一社会信用代码
	private String zzjgdm;		// 组织机构代码
	private String name;		// 企业名称
	private String cellphone;		// 联系人手机号码
	private String url;		// 附件URL
	private String procInsId;		// proc_ins_id
	
	public CorpAccountResetPassApplication() {
		super();
	}

	public CorpAccountResetPassApplication(String id){
		super(id);
	}

	@Length(min=0, max=50, message="统一社会信用代码长度必须介于 0 和 50 之间")
	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	
	@Length(min=0, max=50, message="组织机构代码长度必须介于 0 和 50 之间")
	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}
	
	@Length(min=0, max=100, message="企业名称长度必须介于 0 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=100, message="联系人手机号码长度必须介于 0 和 100 之间")
	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	
	@Length(min=0, max=1000, message="附件URL长度必须介于 0 和 1000 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Length(min=0, max=50, message="proc_ins_id长度必须介于 0 和 50 之间")
	public String getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}
	
}