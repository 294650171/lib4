package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class CorpRegStaffCert implements Serializable {
	private Integer id;

	private Integer staffId;

	private String staffIdCard;

	private String regType;

	private Integer regTypeId;

	private String regMajor;

	private Integer regMajorId;

	private String certNo;

	private String regNo;

	private Date validDate;

	private Date createTime;

	private Date updateTime;

	private Integer status;

	private String staffIdCard2;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getStaffId() {
		return staffId;
	}

	public void setStaffId(Integer staffId) {
		this.staffId = staffId;
	}

	public String getStaffIdCard() {
		return staffIdCard;
	}

	public void setStaffIdCard(String staffIdCard) {
		this.staffIdCard = staffIdCard == null ? null : staffIdCard.trim();
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType == null ? null : regType.trim();
	}

	public Integer getRegTypeId() {
		return regTypeId;
	}

	public void setRegTypeId(Integer regTypeId) {
		this.regTypeId = regTypeId;
	}

	public String getRegMajor() {
		return regMajor;
	}

	public void setRegMajor(String regMajor) {
		this.regMajor = regMajor == null ? null : regMajor.trim();
	}

	public Integer getRegMajorId() {
		return regMajorId;
	}

	public void setRegMajorId(Integer regMajorId) {
		this.regMajorId = regMajorId;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo == null ? null : certNo.trim();
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo == null ? null : regNo.trim();
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getStaffIdCard2() {
		return staffIdCard2;
	}

	public void setStaffIdCard2(String staffIdCard2) {
		this.staffIdCard2 = staffIdCard2 == null ? null : staffIdCard2.trim();
	}

	@Override
	public String toString() {
		return "CorpRegStaffCert [id=" + id + ", staffId=" + staffId
				+ ", staffIdCard=" + staffIdCard + ", regType=" + regType
				+ ", regTypeId=" + regTypeId + ", regMajor=" + regMajor
				+ ", regMajorId=" + regMajorId + ", certNo=" + certNo
				+ ", regNo=" + regNo + ", validDate=" + validDate
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ ", status=" + status + ", staffIdCard2=" + staffIdCard2 + "]";
	}

}