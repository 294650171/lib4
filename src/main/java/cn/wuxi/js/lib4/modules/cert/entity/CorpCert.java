/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.cert.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * corp_certEntity
 * @author GLQ
 * @version 2018-04-24
 */
public class CorpCert extends DataEntity<CorpCert> {
	
	private static final long serialVersionUID = 1L;
	private String corpId;		// corp_id
	private String certTypeId;		// cert_type_id
	private String certType;		// cert_type
	private String certNo;		// cert_no
	private String certName;		// cert_name
	private Date issueDate;		// issue_date
	private Date validDate;		// valid_date
	private String issueAuthority;		// issue_authority
	private String certLevel;		// cert_level
	private String status;		// status
	private String tradeTypeId;		// trade_type_id
	private String tradeType;		// trade_type
	private String majorTypeId;		// major_type_id
	private String majorType;		// major_type
	private String statuslabel;		// statuslabel
	private Date createTime;		// create_time
	private Date updateTime;		// update_time
	private String tag;		// tag
	
	public CorpCert() {
		super();
	}

	public CorpCert(String id){
		super(id);
	}

	@Length(min=1, max=100, message="corp_id长度必须介于 1 和 100 之间")
	public String getCorpId() {
		return corpId;
	}

	public void setCorpId(String corpId) {
		this.corpId = corpId;
	}
	
	public String getCertTypeId() {
		return certTypeId;
	}

	public void setCertTypeId(String certTypeId) {
		this.certTypeId = certTypeId;
	}
	
	@Length(min=0, max=50, message="cert_type长度必须介于 0 和 50 之间")
	public String getCertType() {
		return certType;
	}

	public void setCertType(String certType) {
		this.certType = certType;
	}
	
	@Length(min=0, max=50, message="cert_no长度必须介于 0 和 50 之间")
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	@Length(min=0, max=200, message="cert_name长度必须介于 0 和 200 之间")
	public String getCertName() {
		return certName;
	}

	public void setCertName(String certName) {
		this.certName = certName;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getValidDate() {
		return validDate;
	}

	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	
	@Length(min=0, max=100, message="issue_authority长度必须介于 0 和 100 之间")
	public String getIssueAuthority() {
		return issueAuthority;
	}

	public void setIssueAuthority(String issueAuthority) {
		this.issueAuthority = issueAuthority;
	}
	
	@Length(min=0, max=50, message="cert_level长度必须介于 0 和 50 之间")
	public String getCertLevel() {
		return certLevel;
	}

	public void setCertLevel(String certLevel) {
		this.certLevel = certLevel;
	}
	
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTradeTypeId() {
		return tradeTypeId;
	}

	public void setTradeTypeId(String tradeTypeId) {
		this.tradeTypeId = tradeTypeId;
	}
	
	@Length(min=0, max=50, message="trade_type长度必须介于 0 和 50 之间")
	public String getTradeType() {
		return tradeType;
	}

	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
	
	public String getMajorTypeId() {
		return majorTypeId;
	}

	public void setMajorTypeId(String majorTypeId) {
		this.majorTypeId = majorTypeId;
	}
	
	@Length(min=0, max=50, message="major_type长度必须介于 0 和 50 之间")
	public String getMajorType() {
		return majorType;
	}

	public void setMajorType(String majorType) {
		this.majorType = majorType;
	}
	
	@Length(min=0, max=50, message="statuslabel长度必须介于 0 和 50 之间")
	public String getStatuslabel() {
		return statuslabel;
	}

	public void setStatuslabel(String statuslabel) {
		this.statuslabel = statuslabel;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	@Length(min=0, max=20, message="tag长度必须介于 0 和 20 之间")
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
}