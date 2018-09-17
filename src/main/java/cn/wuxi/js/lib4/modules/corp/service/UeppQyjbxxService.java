/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyjbxxDao;

/**
 * 企业基本信息Service
 * @author huangzhengyu
 * @version 2018-07-06
 */
@Service
@Transactional(readOnly = true)
public class UeppQyjbxxService extends CrudService<UeppQyjbxxDao, UeppQyjbxx> {

	public UeppQyjbxx get(String id) {
		return super.get(id);
	}
	
	public List<UeppQyjbxx> findList(UeppQyjbxx ueppQyjbxx) {
		return super.findList(ueppQyjbxx);
	}
	
	public Page<UeppQyjbxx> findPage(Page<UeppQyjbxx> page, UeppQyjbxx ueppQyjbxx) {
		return super.findPage(page, ueppQyjbxx);
	}
	
	@Transactional(readOnly = false)
	public void save(UeppQyjbxx ueppQyjbxx) {
		super.save(ueppQyjbxx);
	}
	
	@Transactional(readOnly = false)
	public void delete(UeppQyjbxx ueppQyjbxx) {
		super.delete(ueppQyjbxx);
	}
	
}