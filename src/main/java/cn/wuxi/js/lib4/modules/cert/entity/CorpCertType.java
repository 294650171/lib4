/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * corpcerttypeEntity
 * @author GLQ
 * @version 2018-04-24
 */
public class CorpCertType extends DataEntity<CorpCertType> {
	
	private static final long serialVersionUID = 1L;
	private String code;		// code
	private String certtype;		// certtype
	
	public CorpCertType() {
		super();
	}

	public CorpCertType(String id){
		super(id);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	@Length(min=0, max=255, message="certtype长度必须介于 0 和 255 之间")
	public String getCerttype() {
		return certtype;
	}

	public void setCerttype(String certtype) {
		this.certtype = certtype;
	}
	
}