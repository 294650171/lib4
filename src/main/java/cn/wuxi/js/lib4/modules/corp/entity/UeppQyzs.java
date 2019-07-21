/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import cn.wuxi.js.lib4.common.Constants;
import org.hibernate.validator.constraints.Length;
import java.util.Date;
import java.util.logging.ConsoleHandler;

import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业证书Entity
 * @author aaronhuang
 * @version 2019-07-18
 */
public class UeppQyzs extends DataEntity<UeppQyzs> {
	
	private static final long serialVersionUID = 1L;
	private String zsjlid;		// zsjlid
	private String qyid;		// qyid
	private String csywlxid;		// csywlxid
	private String csywlx;		// csywlx
	private String zslxid;		// zslxid
	private String zslx;		// zslx
	private String sfzzz;		// sfzzz
	private String zsbh;		// zsbh
	private Date zsyxqrq;		// zsyxqrq
	private Date zsyxzrq;		// zsyxzrq
	private String fzdw;		// fzdw
	private Date fzrq;		// fzrq
	private String bz;		// bz
	private String tag;		// tag
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	private String datastate;		// datastate
	private String printno;		// printno
	
	public UeppQyzs() {
		super();
	}

	public UeppQyzs(String id){
		super(id);
	}

	@Length(min=1, max=100, message="zsjlid长度必须介于 1 和 100 之间")
	public String getZsjlid() {
		return zsjlid;
	}

	public void setZsjlid(String zsjlid) {
		this.zsjlid = zsjlid;
	}
	
	@Length(min=1, max=100, message="qyid长度必须介于 1 和 100 之间")
	public String getQyid() {
		return qyid;
	}

	public void setQyid(String qyid) {
		this.qyid = qyid;
	}
	
	public String getCsywlxid() {
		return csywlxid;
	}

	public void setCsywlxid(String csywlxid) {
		this.csywlxid = csywlxid;
	}
	
	@Length(min=0, max=20, message="csywlx长度必须介于 0 和 20 之间")
	public String getCsywlx() {
		return csywlx;
	}

	public void setCsywlx(String csywlx) {
		this.csywlx = csywlx;
	}
	
	public String getZslxid() {
		return zslxid;
	}

	public void setZslxid(String zslxid) {
		this.zslxid = zslxid;
	}
	
	@Length(min=1, max=20, message="zslx长度必须介于 1 和 20 之间")
	public String getZslx() {
		return zslx;
	}

	public void setZslx(String zslx) {
		this.zslx = zslx;
	}
	
	public String getSfzzz() {
		return sfzzz;
	}

	public void setSfzzz(String sfzzz) {
		this.sfzzz = sfzzz;
	}
	
	@Length(min=0, max=100, message="zsbh长度必须介于 0 和 100 之间")
	public String getZsbh() {
		return zsbh;
	}

	public void setZsbh(String zsbh) {
		this.zsbh = zsbh;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getZsyxqrq() {
		return zsyxqrq;
	}

	public void setZsyxqrq(Date zsyxqrq) {
		this.zsyxqrq = zsyxqrq;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getZsyxzrq() {
		return zsyxzrq;
	}

	public void setZsyxzrq(Date zsyxzrq) {
		this.zsyxzrq = zsyxzrq;
	}
	
	@Length(min=0, max=100, message="fzdw长度必须介于 0 和 100 之间")
	public String getFzdw() {
		return fzdw;
	}

	public void setFzdw(String fzdw) {
		this.fzdw = fzdw;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getFzrq() {
		return fzrq;
	}

	public void setFzrq(Date fzrq) {
		this.fzrq = fzrq;
	}
	
	@Length(min=0, max=-1, message="bz长度必须介于 0 和 -1 之间")
	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
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
	
	public String getDatastate() {
		return datastate;
	}

	public void setDatastate(String datastate) {
		this.datastate = datastate;
	}
	
	@Length(min=0, max=100, message="printno长度必须介于 0 和 100 之间")
	public String getPrintno() {
		return printno;
	}

	public void setPrintno(String printno) {
		this.printno = printno;
	}

	public void setDefaultDataByType(String certType){
		if(Constants.AQSCXKZ.equals(certType)){
			this.setCsywlxid(Constants.CSYWLXID_AQSCXKZ);
			this.setCsywlx(Constants.CSYWLX_AQSCXKZ);
			this.setZslxid(Constants.ZSLXID_AQSCXKZ);
			this.setZslx(Constants.ZSLX_AQSCXKZ);
		}
	}
	
}