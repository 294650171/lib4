/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.crawler.entity;

import org.hibernate.validator.constraints.Length;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 商品房预售许可证Entity
 * @author huangzhengyu
 * @version 2018-09-16
 */
public class PresalePermitPub extends DataEntity<PresalePermitPub> {
	
	private static final long serialVersionUID = 1L;
	private String corpName;		// 单位名称
	private String commondityHourseName;		// 商品房屋名称
	private String commondityHourseAddress;		// 商品房屋坐落
	private String commondityHourseType;		// 商品房屋使用性质
	private Double area;		// 上市预售建筑面积
	private String areaStr;		// 上市预售建筑面积文本
	private String licenseNo;		// 许可证号
	private String attachment;		// 附件记录
	private Date publicityDate;		// 公示日期
	private String url;		// url
	
	public PresalePermitPub() {
		super();
	}

	public PresalePermitPub(String id){
		super(id);
	}

	@Length(min=0, max=64, message="单位名称长度必须介于 0 和 64 之间")
	public String getCorpName() {
		return corpName;
	}

	public void setCorpName(String corpName) {
		this.corpName = corpName;
	}
	
	@Length(min=0, max=100, message="商品房屋名称长度必须介于 0 和 100 之间")
	public String getCommondityHourseName() {
		return commondityHourseName;
	}

	public void setCommondityHourseName(String commondityHourseName) {
		this.commondityHourseName = commondityHourseName;
	}
	
	@Length(min=0, max=200, message="商品房屋坐落长度必须介于 0 和 200 之间")
	public String getCommondityHourseAddress() {
		return commondityHourseAddress;
	}

	public void setCommondityHourseAddress(String commondityHourseAddress) {
		this.commondityHourseAddress = commondityHourseAddress;
	}
	
	@Length(min=0, max=32, message="商品房屋使用性质长度必须介于 0 和 32 之间")
	public String getCommondityHourseType() {
		return commondityHourseType;
	}

	public void setCommondityHourseType(String commondityHourseType) {
		this.commondityHourseType = commondityHourseType;
	}
	
	public Double getArea() {
		return area;
	}

	public void setArea(Double area) {
		this.area = area;
	}
	
	@Length(min=0, max=64, message="上市预售建筑面积文本长度必须介于 0 和 64 之间")
	public String getAreaStr() {
		return areaStr;
	}

	public void setAreaStr(String areaStr) {
		this.areaStr = areaStr;
	}
	
	@Length(min=0, max=64, message="许可证号长度必须介于 0 和 64 之间")
	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}
	
	@Length(min=0, max=200, message="附件记录长度必须介于 0 和 200 之间")
	public String getAttachment() {
		return attachment;
	}

	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	public Date getPublicityDate() {
		return publicityDate;
	}

	public void setPublicityDate(Date publicityDate) {
		this.publicityDate = publicityDate;
	}
	
	@Length(min=0, max=200, message="url长度必须介于 0 和 200 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
}