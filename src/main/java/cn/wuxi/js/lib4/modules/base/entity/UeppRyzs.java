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
public class UeppRyzs extends DataEntity<UeppRyzs> {
	
	private static final long serialVersionUID = 1L;
	private String zsjlid;		// zsjlid
	private UeppRyjbxx ry;		// ryid 父类
	private String ryzyzglxid;		// ryzyzglxid
	private String ryzyzglx;		// ryzyzglx
	private String ryzslxid;		// ryzslxid
	private String ryzslx;		// ryzslx
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
	private int datastate;		// datastate
	private String status;		// status
	private Date qualissuedate;		// qualissuedate
	private String stampno;		// stampno
	private String regno;		// regno
	private Date updatetime;		// updatetime

	public UeppRyzs() {
		super();
	}

	public UeppRyzs(String id){
		super(id);
	}

	public UeppRyzs(UeppRyjbxx ry){
		this.ry = ry;
	}

	@Length(min=1, max=100, message="zsjlid长度必须介于 1 和 100 之间")
	public String getZsjlid() {
		return zsjlid;
	}

	public void setZsjlid(String zsjlid) {
		this.zsjlid = zsjlid;
	}

	public UeppRyjbxx getRy() {
		return ry;
	}

	public void setRy(UeppRyjbxx ry) {
		this.ry = ry;
	}

	public String getRyzyzglxid() {
		return ryzyzglxid;
	}

	public void setRyzyzglxid(String ryzyzglxid) {
		this.ryzyzglxid = ryzyzglxid;
	}
	
	@Length(min=0, max=20, message="ryzyzglx长度必须介于 0 和 20 之间")
	public String getRyzyzglx() {
		return ryzyzglx;
	}

	public void setRyzyzglx(String ryzyzglx) {
		this.ryzyzglx = ryzyzglx;
	}
	
	public String getRyzslxid() {
		return ryzslxid;
	}

	public void setRyzslxid(String ryzslxid) {
		this.ryzslxid = ryzslxid;
	}
	
	@Length(min=0, max=20, message="ryzslx长度必须介于 0 和 20 之间")
	public String getRyzslx() {
		return ryzslx;
	}

	public void setRyzslx(String ryzslx) {
		this.ryzslx = ryzslx;
	}
	
	public String getSfzzz() {
		return sfzzz;
	}

	public void setSfzzz(String sfzzz) {
		this.sfzzz = sfzzz;
	}
	
	@Length(min=0, max=50, message="zsbh长度必须介于 0 和 50 之间")
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

	public int getDatastate() {
		return datastate;
	}

	public void setDatastate(int datastate) {
		this.datastate = datastate;
	}

	@Length(min=0, max=1, message="status长度必须介于 0 和 1 之间")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getQualissuedate() {
		return qualissuedate;
	}

	public void setQualissuedate(Date qualissuedate) {
		this.qualissuedate = qualissuedate;
	}
	
	@Length(min=0, max=20, message="stampno长度必须介于 0 和 20 之间")
	public String getStampno() {
		return stampno;
	}

	public void setStampno(String stampno) {
		this.stampno = stampno;
	}
	
	@Length(min=0, max=20, message="regno长度必须介于 0 和 20 之间")
	public String getRegno() {
		return regno;
	}

	public void setRegno(String regno) {
		this.regno = regno;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}
	
}