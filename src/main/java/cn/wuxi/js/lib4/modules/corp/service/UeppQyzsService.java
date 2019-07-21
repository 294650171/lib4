/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyzs;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyzsDao;

/**
 * 企业证书Service
 * @author aaronhuang
 * @version 2019-07-18
 */
@Service
@Transactional(readOnly = true)
public class UeppQyzsService extends CrudService<UeppQyzsDao, UeppQyzs> {

	public UeppQyzs get(String id) {
		return super.get(id);
	}
	
	public List<UeppQyzs> findList(UeppQyzs ueppQyzs) {
		return super.findList(ueppQyzs);
	}
	
	public Page<UeppQyzs> findPage(Page<UeppQyzs> page, UeppQyzs ueppQyzs) {
		return super.findPage(page, ueppQyzs);
	}
	
	@Transactional(readOnly = false)
	public void save(UeppQyzs ueppQyzs) {
		super.save(ueppQyzs);
	}
	
	@Transactional(readOnly = false)
	public void delete(UeppQyzs ueppQyzs) {
		super.delete(ueppQyzs);
	}

	@Transactional(readOnly = false)
	public String saveWithDuplicateCheck(UeppQyzs ueppQyzs) {
		String result = null;
		List<UeppQyzs>  list = this.findList(ueppQyzs);
		if(list == null || list.isEmpty()){
			super.save(ueppQyzs);
			result = "保存成功";
		}else {
			UeppQyzs existed = list.get(0);
			BeanUtils.copyProperties(ueppQyzs , existed, "zsjlid","qyID");
		}


		return result;

	}
	
}