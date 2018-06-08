/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * corpmajortypeEntity
 * @author GLQ
 * @version 2018-04-24
 */
public class CorpMajorYype extends DataEntity<CorpMajorYype> {
	
	private static final long serialVersionUID = 1L;
	private String certtypename;		// certtypename
	private String tradetypename;		// tradetypename
	private String majortypename;		// majortypename
	private String majortypeno;		// majortypeno
	
	public CorpMajorYype() {
		super();
	}

	public CorpMajorYype(String id){
		super(id);
	}

	@Length(min=0, max=255, message="certtypename长度必须介于 0 和 255 之间")
	public String getCerttypename() {
		return certtypename;
	}

	public void setCerttypename(String certtypename) {
		this.certtypename = certtypename;
	}
	
	@Length(min=0, max=255, message="tradetypename长度必须介于 0 和 255 之间")
	public String getTradetypename() {
		return tradetypename;
	}

	public void setTradetypename(String tradetypename) {
		this.tradetypename = tradetypename;
	}
	
	@Length(min=0, max=255, message="majortypename长度必须介于 0 和 255 之间")
	public String getMajortypename() {
		return majortypename;
	}

	public void setMajortypename(String majortypename) {
		this.majortypename = majortypename;
	}
	
	@Length(min=0, max=255, message="majortypeno长度必须介于 0 和 255 之间")
	public String getMajortypeno() {
		return majortypeno;
	}

	public void setMajortypeno(String majortypeno) {
		this.majortypeno = majortypeno;
	}
	
}