/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.entity;

import org.hibernate.validator.constraints.Length;

import cn.wuxi.js.lib4.common.persistence.DataEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件导入Entity
 * @author aaronhuang
 * @version 2019-06-27
 */
public class ImportSrcFile extends DataEntity<ImportSrcFile> {
	
	private static final long serialVersionUID = 1L;

	public static final String FILE_TYPE_1 = "见证取样员";

	private String name;		// 文件名称
	private String url;		// URL
	private String type;		// 类型


	private MultipartFile file;
	
	public ImportSrcFile() {
		super();
	}

	public ImportSrcFile(String id){
		super(id);
	}

	@Length(min=0, max=100, message="文件名称长度必须介于 0 和 100 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Length(min=0, max=1000, message="URL长度必须介于 0 和 1000 之间")
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	@Length(min=0, max=32, message="类型长度必须介于 0 和 32 之间")
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}
}