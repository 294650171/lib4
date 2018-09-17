package cn.wuxi.js.lib4.crawler.entity;

import java.io.Serializable;
import java.util.Date;

public class CorpRegStaff implements Serializable {
	private Integer id;

	private String corpId;

	private String name;

	private Integer gender;

	private String idType;

	private String idCard;

	private Date createTime;

	private Date updateTime;

	private Integer status;

	private String idCard2;

	private String regType;
	private Integer regTypeId;

	private String regMajor;
	private Integer regMajorId;

	private String regNo;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType == null ? null : idType.trim();
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard == null ? null : idCard.trim();
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

	public String getIdCard2() {
		return idCard2;
	}

	public void setIdCard2(String idCard2) {
		this.idCard2 = idCard2 == null ? null : idCard2.trim();
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
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
		this.regMajor = regMajor;
	}

	public Integer getRegMajorId() {
		return regMajorId;
	}

	public void setRegMajorId(Integer regMajorId) {
		this.regMajorId = regMajorId;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

}