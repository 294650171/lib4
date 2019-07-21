/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业从事业务类型Entity
 * @author aaronhuang
 * @version 2019-07-17
 */
public class UeppQycsyw extends DataEntity<UeppQycsyw> {
	
	private static final long serialVersionUID = 1L;
	private UeppQyjbxx qyjbxx;		// 企业基本信息
	private Integer csywlxid;		// csywlxid
	private String csywlx;		// csywlx
	private Integer balxid;		// balxid
	private String balx;		// balx
	private Integer datastate;		// datastate
	private String tag;		// tag
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	
	public UeppQycsyw() {
		super();
	}

	public UeppQycsyw(String id){
		super(id);
	}

	public UeppQyjbxx getQyjbxx() {
		return qyjbxx;
	}

	public void setQyjbxx(UeppQyjbxx qyjbxx) {
		this.qyjbxx = qyjbxx;
	}

	public Integer getCsywlxid() {
		return csywlxid;
	}

	public void setCsywlxid(Integer csywlxid) {
		this.csywlxid = csywlxid;
	}
	
	@Length(min=0, max=20, message="csywlx长度必须介于 0 和 20 之间")
	public String getCsywlx() {
		return csywlx;
	}

	public void setCsywlx(String csywlx) {
		this.csywlx = csywlx;
	}
	
	public Integer getBalxid() {
		return balxid;
	}

	public void setBalxid(Integer balxid) {
		this.balxid = balxid;
	}
	
	@Length(min=0, max=4, message="balx长度必须介于 0 和 4 之间")
	public String getBalx() {
		return balx;
	}

	public void setBalx(String balx) {
		this.balx = balx;
	}
	
	public Integer getDatastate() {
		return datastate;
	}

	public void setDatastate(Integer datastate) {
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
	
}