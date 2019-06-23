/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.ActEntity;
import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 密码重置申请Entity
 * @author GLQ
 * @version 2019-06-15
 */
public class ResetPasswordApply extends ActEntity<ResetPasswordApply> {
	
	private static final long serialVersionUID = 1L;
	private String entityCode;		// entity_code
	private String entityName;		// entity_name
	private String attach;		// attach
	private String mobile;		// mobile
	private String email;		// email
	private Date applyDate;		// apply_date
	private Date approveDate;		// approve_date
	private String approveOpinion;		// approve_opinion
	private String status;		// approve_status
	
	private CommonsMultipartFile attachmentFile;
	
	private String procInsId;		// proc_ins_id
	
	public ResetPasswordApply() {
		super();
	}

	public ResetPasswordApply(String id){
		super(id);
	}

	@Length(min=0, max=64, message="entity_code长度必须介于 0 和 64 之间")
	public String getEntityCode() {
		return entityCode;
	}

	public void setEntityCode(String entityCode) {
		this.entityCode = entityCode;
	}
	
	@Length(min=0, max=64, message="entity_name长度必须介于 0 和 64 之间")
	public String getEntityName() {
		return entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}
	
	@Length(min=0, max=200, message="attach长度必须介于 0 和 200 之间")
	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}
	
	@Length(min=0, max=64, message="mobile长度必须介于 0 和 64 之间")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Length(min=0, max=64, message="email长度必须介于 0 和 64 之间")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getApproveDate() {
		return approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}
	
	@Length(min=0, max=100, message="approve_opinion长度必须介于 0 和 100 之间")
	public String getApproveOpinion() {
		return approveOpinion;
	}

	public void setApproveOpinion(String approveOpinion) {
		this.approveOpinion = approveOpinion;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public CommonsMultipartFile getAttachmentFile() {
		return attachmentFile;
	}

	public void setAttachmentFile(CommonsMultipartFile attachmentFile) {
		this.attachmentFile = attachmentFile;
	}

	public String getProcInsId() {
		return procInsId;
	}

	public void setProcInsId(String procInsId) {
		this.procInsId = procInsId;
	}
	
	
	
}