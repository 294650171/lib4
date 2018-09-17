package cn.wuxi.js.lib4.crawler.mohurd.bean;

import java.io.Serializable;

import org.springframework.util.StringUtils;

public class BaseCorpVO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String corpID;
	private String corpLink;
	private String corpPageID;

	
	public BaseCorpVO(String corpID, String corpLink, String corpPageID) {
		super();
		this.corpID = corpID;
		this.corpLink = corpLink;
		this.corpPageID = corpPageID;
	}

	public String getCorpID() {
		return corpID;
	}

	public void setCorpID(String corpID) {
		this.corpID = corpID;
	}

	public String getCorpLink() {
		return corpLink;
	}

	public void setCorpLink(String corpLink) {
		this.corpLink = corpLink;
	}

	public String getCorpPageID() {
		return corpPageID;
	}

	public void setCorpPageID(String corpPageID) {
		this.corpPageID = corpPageID;
	}

	@Override
	public String toString() {
		return "BaseCorpVO [corpID=" + corpID + ", corpLink=" + corpLink
				+ ", corpPageID=" + corpPageID + "]";
	}
	
	public String getZzjgdm() {
		if (this.corpID == null || StringUtils.isEmpty(this.corpID)) {
			return null;
		} else {
			if(this.corpID.length() > 16){
				return this.corpID.substring(8, 16) + "-"
						+ this.corpID.substring(16, 17);
			}else{
				return this.corpID;
			}
			
		}
	}

}
