package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;

public class CorpEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	// 企业ID，跟组织机构代码一致
	private String qyID;

	// 企业名称
	private String qymc;

	// 组织机构代码
	private String zzjgdm;

	// 营业执照注册号
	private String yyzzzch;

	// 统一社会信用代码
	private String tyshxydm;

	// 修改人
	private String xgr;

	// 标识
	private String tag;

	private Integer dataState;

	public String getQyID() {
		return qyID;
	}

	public void setQyID(String qyID) {
		this.qyID = qyID;
	}

	public String getQymc() {
		return qymc;
	}

	public void setQymc(String qymc) {
		this.qymc = qymc;
	}

	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

	public String getYyzzzch() {
		return yyzzzch;
	}

	public void setYyzzzch(String yyzzzch) {
		this.yyzzzch = yyzzzch;
	}

	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}

	public String getXgr() {
		return xgr;
	}

	public void setXgr(String xgr) {
		this.xgr = xgr;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public Integer getDataState() {
		return dataState;
	}

	public void setDataState(Integer dataState) {
		this.dataState = dataState;
	}

	public CorpEntity() {
		super();
	}

}