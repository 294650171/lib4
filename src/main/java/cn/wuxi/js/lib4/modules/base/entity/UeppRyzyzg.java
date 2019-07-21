/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业人员Entity
 * @author aaronhuang
 * @version 2019-06-28
 */
public class UeppRyzyzg extends DataEntity<UeppRyzyzg> {
	
	private static final long serialVersionUID = 1L;
	private UeppRyjbxx ryid;		// ryid 父类
	private String ryzyzglxid;		// ryzyzglxid
	private String ryzyzglx;		// ryzyzglx
	private String balxid;		// balxid
	private String balx;		// balx
	private String datastate;		// datastate
	private String tag;		// tag
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	private Date updatetime;		// updatetime
	
	public UeppRyzyzg() {
		super();
	}

	public UeppRyzyzg(String id){
		super(id);
	}

	public UeppRyzyzg(UeppRyjbxx ryid){
		this.ryid = ryid;
	}

	@Length(min=1, max=100, message="ryid长度必须介于 1 和 100 之间")
	public UeppRyjbxx getRyid() {
		return ryid;
	}

	public void setRyid(UeppRyjbxx ryid) {
		this.ryid = ryid;
	}
	
	public String getRyzyzglxid() {
		return ryzyzglxid;
	}

	public void setRyzyzglxid(String ryzyzglxid) {
		this.ryzyzglxid = ryzyzglxid;
	}
	
	@Length(min=1, max=20, message="ryzyzglx长度必须介于 1 和 20 之间")
	public String getRyzyzglx() {
		return ryzyzglx;
	}

	public void setRyzyzglx(String ryzyzglx) {
		this.ryzyzglx = ryzyzglx;
	}
	
	public String getBalxid() {
		return balxid;
	}

	public void setBalxid(String balxid) {
		this.balxid = balxid;
	}
	
	@Length(min=0, max=4, message="balx长度必须介于 0 和 4 之间")
	public String getBalx() {
		return balx;
	}

	public void setBalx(String balx) {
		this.balx = balx;
	}
	
	public String getDatastate() {
		return datastate;
	}

	public void setDatastate(String datastate) {
		this.datastate = datastate;
	}
	
	@Length(min=0, max=50, message="tag长度必须介于 0 和 50 之间")
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	@Length(min=0, max=100, message="xgr长度必须介于 0 和 100 之间")
	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getXgrqsj() {
		return xgrqsj;
	}

	public void setXgrqsj(Date xgrqsj) {
		this.xgrqsj = xgrqsj;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}