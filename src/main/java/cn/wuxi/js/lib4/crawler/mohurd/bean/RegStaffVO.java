package cn.wuxi.js.lib4.crawler.mohurd.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import cn.wuxi.js.lib4.crawler.entity.CorpRegStaffCert;

public class RegStaffVO implements java.io.Serializable {

	private static final long serialVersionUID = 1L;

	private String corpID;

	private String gender;

	private String name;

	private String idType;

	// 完整身份证号码
	private String idCard;

	// 带*的身份证号码
	private String idCard2;

	// 注册类别-人员执业资格类型
	private String regType;

	// 执业印章号-注册号
	private String regNo;

	// 注册专业-人员资格类别
	private String regMajor;

	// 证书编号
	private String certNo;

	// 有效期
	private String validDate;

	private Date valid;

	// 存取人员详情URL
	private String staffDetailUrl;

	private List<CorpRegStaffCert> certs = new ArrayList<CorpRegStaffCert>();

	public String getCorpID() {
		return corpID;
	}

	public void setCorpID(String corpID) {
		this.corpID = corpID;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getRegMajor() {
		return regMajor;
	}

	public void setRegMajor(String regMajor) {
		this.regMajor = regMajor;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

	public String getIdCard2() {
		return idCard2;
	}

	public void setIdCard2(String idCard2) {
		this.idCard2 = idCard2;
	}

	public Date getValid() {
		return valid;
	}

	public void setValid(Date valid) {
		this.valid = valid;
	}

	public List<CorpRegStaffCert> getCerts() {
		return certs;
	}

	public void setCerts(List<CorpRegStaffCert> certs) {
		this.certs = certs;
	}

	public String getStaffDetailUrl() {
		return staffDetailUrl;
	}

	public void setStaffDetailUrl(String staffDetailUrl) {
		this.staffDetailUrl = staffDetailUrl;
	}

	@Override
	public String toString() {
		return "RegStaffVO [corpID=" + corpID + ", gender=" + gender
				+ ", name=" + name + ", idType=" + idType + ", idCard="
				+ idCard + ", idCard2=" + idCard2 + ", regType=" + regType
				+ ", regNo=" + regNo + ", regMajor=" + regMajor + ", certNo="
				+ certNo + ", validDate=" + validDate + ", valid=" + valid
				+ ", staffDetailUrl=" + staffDetailUrl + ", certs=" + certs
				+ "]";
	}

}
