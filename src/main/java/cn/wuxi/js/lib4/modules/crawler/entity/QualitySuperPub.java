/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 网站数据Entity
 * @author huangzhengyu
 * @version 2018-09-15
 */
public class QualitySuperPub extends DataEntity<QualitySuperPub> {
	
	private static final long serialVersionUID = 1L;
	private String projectName;		// 工程名称
	private String constructionCorp;		// 施工单位
	private String supervisorCorp;		// 监理单位
	private String projectManager;		// 项目经理
	private String projectDirector;		// 项目总监
	private String qualitySuperDept;		// 质量监督部门
	private Date regDate;		// 注册日期
	private Date startDate;		// 开工日期
	private Date finishDate;		// 主体分部计划完工日期
	private Date acceptDate;		// 竣工验收日期
	private String url;		// 链接地址
	
	public QualitySuperPub() {
		super();
	}

	public QualitySuperPub(String id){
		super(id);
	}

	@Length(min=0, max=64, message="工程名称长度必须介于 0 和 64 之间")
	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	@Length(min=0, max=64, message="施工单位长度必须介于 0 和 64 之间")
	public String getConstructionCorp() {
		return constructionCorp;
	}

	public void setConstructionCorp(String constructionCorp) {
		this.constructionCorp = constructionCorp;
	}
	
	@Length(min=0, max=64, message="监理单位长度必须介于 0 和 64 之间")
	public String getSupervisorCorp() {
		return supervisorCorp;
	}

	public void setSupervisorCorp(String supervisorCorp) {
		this.supervisorCorp = supervisorCorp;
	}
	
	@Length(min=0, max=64, message="项目经理长度必须介于 0 和 64 之间")
	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	
	@Length(min=0, max=64, message="项目总监长度必须介于 0 和 64 之间")
	public String getProjectDirector() {
		return projectDirector;
	}

	public void setProjectDirector(String projectDirector) {
		this.projectDirector = projectDirector;
	}
	
	@Length(min=0, max=64, message="质量监督部门长度必须介于 0 和 64 之间")
	public String getQualitySuperDept() {
		return qualitySuperDept;
	}

	public void setQualitySuperDept(String qualitySuperDept) {
		this.qualitySuperDept = qualitySuperDept;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getFinishDate() {
		return finishDate;
	}

	public void setFinishDate(Date finishDate) {
		this.finishDate = finishDate;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}
	
	@Length(min=0, max=200, message="链接地址长度必须介于 0 和 200 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}