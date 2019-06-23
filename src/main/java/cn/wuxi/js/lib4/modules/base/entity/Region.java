/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.entity;

import org.hibernate.validator.constraints.Length;
import com.fasterxml.jackson.annotation.JsonBackReference;

import cn.wuxi.js.lib4.common.persistence.DataEntity;

/**
 * 地区Entity
 * @author GLQ
 * @version 2019-06-18
 */
public class Region extends DataEntity<Region> {
	
	private static final long serialVersionUID = 1L;
	private String name;		// name
	private String level;		// level
	private Region parent;		// parent_id
	
	public Region() {
		super();
	}

	public Region(String id){
		super(id);
	}

	@Length(min=0, max=32, message="name长度必须介于 0 和 32 之间")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}
	
	@JsonBackReference
	public Region getParent() {
		return parent;
	}

	public void setParent(Region parent) {
		this.parent = parent;
	}
	
}