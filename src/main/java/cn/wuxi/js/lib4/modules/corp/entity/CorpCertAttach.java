
package cn.wuxi.js.lib4.modules.corp.entity;

import cn.wuxi.js.lib4.common.utils.StringUtils;
import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * 企业证照Entity
 * @author aaronhuang
 * @version 2019-01-24
 */
public class CorpCertAttach extends DataEntity<CorpCertAttach> {
	
	private static final long serialVersionUID = 1L;
	public static final Integer CERT_TYPE_BUSYNESS_LICENSE = 1;
	public static final Integer CERT_TYPE_QUALIFICATION = 2;

	private String tyshxydm;		// 统一社会信用代码
	private String zzjgdm;		// 统一社会信用代码
	private Integer certType;		// 证照类型
	private String certNo;		// 证照号码
	private String name;		// 名称
	private String url;		// url
	private String suffix;		// 后缀
	
	public CorpCertAttach() {
		super();
	}

	public CorpCertAttach(String id){
		super(id);
	}

	@Length(min=0, max=50, message="统一社会信用代码长度必须介于 0 和 50 之间")
	public String getTyshxydm() {
		return tyshxydm;
	}

	public void setTyshxydm(String tyshxydm) {
		this.tyshxydm = tyshxydm;
	}
	
	public Integer getCertType() {
		return certType;
	}

	public void setCertType(Integer certType) {
		this.certType = certType;
	}
	
	@Length(min=0, max=50, message="证照号码长度必须介于 0 和 50 之间")
	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}
	
	@Length(min=0, max=200, message="名称长度必须介于 0 和 200 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=1000, message="url长度必须介于 0 和 1000 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getZzjgdm() {
		return zzjgdm;
	}

	public void setZzjgdm(String zzjgdm) {
		this.zzjgdm = zzjgdm;
	}

	public String getPhotoName(){
		String result = null;

		if(StringUtils.isNotEmpty(this.name)){
			try {
				result = URLDecoder.decode(this.name,"UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
		}

		return result;

	}
}