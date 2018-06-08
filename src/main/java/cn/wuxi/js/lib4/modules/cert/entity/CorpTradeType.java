/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * corptradetypeEntity
 * @author GLQ
 * @version 2018-04-24
 */
public class CorpTradeType extends DataEntity<CorpTradeType> {
	
	private static final long serialVersionUID = 1L;
	private String certtypename;		// certtypename
	private String tradetypeno;		// tradetypeno
	private String tradetypename;		// tradetypename
	
	public CorpTradeType() {
		super();
	}

	public CorpTradeType(String id){
		super(id);
	}

	@Length(min=0, max=255, message="certtypename长度必须介于 0 和 255 之间")
	public String getCerttypename() {
		return certtypename;
	}

	public void setCerttypename(String certtypename) {
		this.certtypename = certtypename;
	}
	
	@Length(min=1, max=255, message="tradetypeno长度必须介于 1 和 255 之间")
	public String getTradetypeno() {
		return tradetypeno;
	}

	public void setTradetypeno(String tradetypeno) {
		this.tradetypeno = tradetypeno;
	}
	
	@Length(min=0, max=255, message="tradetypename长度必须介于 0 和 255 之间")
	public String getTradetypename() {
		return tradetypename;
	}

	public void setTradetypename(String tradetypename) {
		this.tradetypename = tradetypename;
	}
	
}