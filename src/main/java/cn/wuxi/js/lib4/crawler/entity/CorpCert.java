package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class CorpCert implements Serializable {
	private Integer id;

	private String corpId;

	private Integer certTypeId;

	private String certType;

	private String certNo;

	private String certName;

	private Date issueDate;

	private Date validDate;

	private String issueAuthority;

	private String certLevel;

	private Integer status;

	private Integer tradeTypeId;

	private String tradeType;

	private Integer majorTypeId;

	private String majorType;

	private String statuslabel;

	private Date createTime;

	private Date updateTime;

	private String tag;

	private static final long serialVersionUID = 1L;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId == null ? null : corpId.trim();
	}

	public Integer getCertTypeId() {
		return certTypeId;
	}

	public void setCertTypeId(Integer certTypeId) {
		this.certTypeId = certTypeId;
	}

	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType == null ? null : certType.trim();
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo == null ? null : certNo.trim();
	}

	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName == null ? null : certName.trim();
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}

	public String getIssueAuthority() {
		return issueAuthority;
	}

	public void setIssueAuthority(String issueAuthority) {
		this.issueAuthority = issueAuthority == null ? null : issueAuthority
				.trim();
	}

	public String getCertLevel() {
		return certLevel;
	}

	public void setCertLevel(String certLevel) {
		this.certLevel = certLevel == null ? null : certLevel.trim();
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getTradeTypeId() {
		return tradeTypeId;
	}

	public void setTradeTypeId(Integer tradeTypeId) {
		this.tradeTypeId = tradeTypeId;
	}

	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType == null ? null : tradeType.trim();
	}

	public Integer getMajorTypeId() {
		return majorTypeId;
	}

	public void setMajorTypeId(Integer majorTypeId) {
		this.majorTypeId = majorTypeId;
	}

	public String getMajorType() {
		return majorType;
	}

	public void setMajorType(String majorType) {
		this.majorType = majorType == null ? null : majorType.trim();
	}

	public String getStatuslabel() {
		return statuslabel;
	}

	public void setStatuslabel(String statuslabel) {
		this.statuslabel = statuslabel == null ? null : statuslabel.trim();
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

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag == null ? null : tag.trim();
	}

	@Override
	public String toString() {
		return "CorpCert [id=" + id + ", corpId=" + corpId + ", certTypeId="
				+ certTypeId + ", certType=" + certType + ", certNo=" + certNo
				+ ", certName=" + certName + ", issueDate=" + issueDate
				+ ", validDate=" + validDate + ", issueAuthority="
				+ issueAuthority + ", certLevel=" + certLevel + ", status="
				+ status + ", tradeTypeId=" + tradeTypeId + ", tradeType="
				+ tradeType + ", majorTypeId=" + majorTypeId + ", majorType="
				+ majorType + ", statuslabel=" + statuslabel + ", createTime="
				+ createTime + ", updateTime=" + updateTime + ", tag=" + tag
				+ "]";
	}

}