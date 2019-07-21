/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.List;
import com.google.common.collect.Lists;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 企业人员Entity
 * @author aaronhuang
 * @version 2019-06-28
 */
public class UeppRyjbxx extends DataEntity<UeppRyjbxx> {
	
	private static final long serialVersionUID = 1L;
	private String ryid;		// ryid
	private String userid;		// userid
	private String xm;		// xm
	private String zjlxid;		// zjlxid
	private String zjlx;		// zjlx
	private String zjhm;		// zjhm
	private String xb;		// xb
	private Date csrq;		// csrq
	private String mz;		// mz
	private String xlid;		// xlid
	private String xl;		// xl
	private String sxzy;		// sxzy
	private String byyx;		// byyx
	private Date byny;		// byny
	private String zcid;		// zcid
	private String zc;		// zc
	private String zczh;		// zczh
	private String zcjbid;		// zcjbid
	private String zcjb;		// zcjb
	private String zczyid;		// zczyid
	private String zczy;		// zczy
	private String zwid;		// zwid
	private String zw;		// zw
	private String csgzjsnx;		// csgzjsnx
	private String lxdh;		// lxdh
	private String yddh;		// yddh
	private String gzjl;		// gzjl
	private String bz;		// bz
	private int datastate;		// datastate
	private String tag;		// tag
	private String xgr;		// xgr
	private Date xgrqsj;		// xgrqsj
	private String sfzsmj;		// sfzsmj
	private String ryzz;		// ryzz
	private String fzjg;		// fzjg
	private Date sfzyxqs;		// sfzyxqs
	private Date sfzyxqz;		// sfzyxqz
	private String ajIsrefuse;		// aj_isrefuse
	private String ajExistinidcards;		// aj_existinidcards
	private Date updatetime;		// updatetime

	private List<UeppRyzs> ueppRyzsList = Lists.newArrayList();		// 子表列表
	private List<UeppRyzyzg> ueppRyzyzgList = Lists.newArrayList();		// 子表列表
	
	public UeppRyjbxx() {
		super();
	}

	public UeppRyjbxx(String id){
		super(id);
	}

	@Length(min=1, max=100, message="ryid长度必须介于 1 和 100 之间")
	public String getRyid() {
		return ryid;
	}

	public void setRyid(String ryid) {
		this.ryid = ryid;
	}
	
	@Length(min=0, max=100, message="userid长度必须介于 0 和 100 之间")
	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	@Length(min=1, max=50, message="xm长度必须介于 1 和 50 之间")
	public String getXm() {
		return xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}
	
	public String getZjlxid() {
		return zjlxid;
	}

	public void setZjlxid(String zjlxid) {
		this.zjlxid = zjlxid;
	}
	
	@Length(min=0, max=10, message="zjlx长度必须介于 0 和 10 之间")
	public String getZjlx() {
		return zjlx;
	}

	public void setZjlx(String zjlx) {
		this.zjlx = zjlx;
	}
	
	@Length(min=0, max=50, message="zjhm长度必须介于 0 和 50 之间")
	public String getZjhm() {
		return zjhm;
	}

	public void setZjhm(String zjhm) {
		this.zjhm = zjhm;
	}
	
	@Length(min=0, max=1, message="xb长度必须介于 0 和 1 之间")
	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCsrq() {
		return csrq;
	}

	public void setCsrq(Date csrq) {
		this.csrq = csrq;
	}
	
	@Length(min=0, max=10, message="mz长度必须介于 0 和 10 之间")
	public String getMz() {
		return mz;
	}

	public void setMz(String mz) {
		this.mz = mz;
	}
	
	public String getXlid() {
		return xlid;
	}

	public void setXlid(String xlid) {
		this.xlid = xlid;
	}
	
	@Length(min=0, max=10, message="xl长度必须介于 0 和 10 之间")
	public String getXl() {
		return xl;
	}

	public void setXl(String xl) {
		this.xl = xl;
	}
	
	@Length(min=0, max=50, message="sxzy长度必须介于 0 和 50 之间")
	public String getSxzy() {
		return sxzy;
	}

	public void setSxzy(String sxzy) {
		this.sxzy = sxzy;
	}
	
	@Length(min=0, max=50, message="byyx长度必须介于 0 和 50 之间")
	public String getByyx() {
		return byyx;
	}

	public void setByyx(String byyx) {
		this.byyx = byyx;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getByny() {
		return byny;
	}

	public void setByny(Date byny) {
		this.byny = byny;
	}
	
	public String getZcid() {
		return zcid;
	}

	public void setZcid(String zcid) {
		this.zcid = zcid;
	}
	
	@Length(min=0, max=30, message="zc长度必须介于 0 和 30 之间")
	public String getZc() {
		return zc;
	}

	public void setZc(String zc) {
		this.zc = zc;
	}
	
	@Length(min=0, max=30, message="zczh长度必须介于 0 和 30 之间")
	public String getZczh() {
		return zczh;
	}

	public void setZczh(String zczh) {
		this.zczh = zczh;
	}
	
	public String getZcjbid() {
		return zcjbid;
	}

	public void setZcjbid(String zcjbid) {
		this.zcjbid = zcjbid;
	}
	
	@Length(min=0, max=10, message="zcjb长度必须介于 0 和 10 之间")
	public String getZcjb() {
		return zcjb;
	}

	public void setZcjb(String zcjb) {
		this.zcjb = zcjb;
	}
	
	public String getZczyid() {
		return zczyid;
	}

	public void setZczyid(String zczyid) {
		this.zczyid = zczyid;
	}
	
	@Length(min=0, max=20, message="zczy长度必须介于 0 和 20 之间")
	public String getZczy() {
		return zczy;
	}

	public void setZczy(String zczy) {
		this.zczy = zczy;
	}
	
	public String getZwid() {
		return zwid;
	}

	public void setZwid(String zwid) {
		this.zwid = zwid;
	}
	
	@Length(min=0, max=20, message="zw长度必须介于 0 和 20 之间")
	public String getZw() {
		return zw;
	}

	public void setZw(String zw) {
		this.zw = zw;
	}
	
	public String getCsgzjsnx() {
		return csgzjsnx;
	}

	public void setCsgzjsnx(String csgzjsnx) {
		this.csgzjsnx = csgzjsnx;
	}
	
	@Length(min=0, max=50, message="lxdh长度必须介于 0 和 50 之间")
	public String getLxdh() {
		return lxdh;
	}

	public void setLxdh(String lxdh) {
		this.lxdh = lxdh;
	}
	
	@Length(min=0, max=50, message="yddh长度必须介于 0 和 50 之间")
	public String getYddh() {
		return yddh;
	}

	public void setYddh(String yddh) {
		this.yddh = yddh;
	}
	
	@Length(min=0, max=-1, message="gzjl长度必须介于 0 和 -1 之间")
	public String getGzjl() {
		return gzjl;
	}

	public void setGzjl(String gzjl) {
		this.gzjl = gzjl;
	}
	
	@Length(min=0, max=-1, message="bz长度必须介于 0 和 -1 之间")
	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

	public int getDatastate() {
		return datastate;
	}

	public void setDatastate(int datastate) {
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
	
	public String getSfzsmj() {
		return sfzsmj;
	}

	public void setSfzsmj(String sfzsmj) {
		this.sfzsmj = sfzsmj;
	}
	
	@Length(min=0, max=200, message="ryzz长度必须介于 0 和 200 之间")
	public String getRyzz() {
		return ryzz;
	}

	public void setRyzz(String ryzz) {
		this.ryzz = ryzz;
	}
	
	@Length(min=0, max=100, message="fzjg长度必须介于 0 和 100 之间")
	public String getFzjg() {
		return fzjg;
	}

	public void setFzjg(String fzjg) {
		this.fzjg = fzjg;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSfzyxqs() {
		return sfzyxqs;
	}

	public void setSfzyxqs(Date sfzyxqs) {
		this.sfzyxqs = sfzyxqs;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getSfzyxqz() {
		return sfzyxqz;
	}

	public void setSfzyxqz(Date sfzyxqz) {
		this.sfzyxqz = sfzyxqz;
	}
	
	public String getAjIsrefuse() {
		return ajIsrefuse;
	}

	public void setAjIsrefuse(String ajIsrefuse) {
		this.ajIsrefuse = ajIsrefuse;
	}
	
	@Length(min=0, max=30, message="aj_existinidcards长度必须介于 0 和 30 之间")
	public String getAjExistinidcards() {
		return ajExistinidcards;
	}

	public void setAjExistinidcards(String ajExistinidcards) {
		this.ajExistinidcards = ajExistinidcards;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdatetime() {
		return updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public List<UeppRyzs> getUeppRyzsList() {
		return ueppRyzsList;
	}

	public void setUeppRyzsList(List<UeppRyzs> ueppRyzsList) {
		this.ueppRyzsList = ueppRyzsList;
	}
	public List<UeppRyzyzg> getUeppRyzyzgList() {
		return ueppRyzyzgList;
	}

	public void setUeppRyzyzgList(List<UeppRyzyzg> ueppRyzyzgList) {
		this.ueppRyzyzgList = ueppRyzyzgList;
	}
}