/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQycsyw;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQycsywDao;

/**
 * 企业从事业务类型Service
 * @author aaronhuang
 * @version 2019-07-17
 */
@Service
@Transactional(readOnly = true)
public class UeppQycsywService extends CrudService<UeppQycsywDao, UeppQycsyw> {

	public UeppQycsyw get(String id) {
		return super.get(id);
	}
	
	public List<UeppQycsyw> findList(UeppQycsyw ueppQycsyw) {
		return super.findList(ueppQycsyw);
	}
	
	public Page<UeppQycsyw> findPage(Page<UeppQycsyw> page, UeppQycsyw ueppQycsyw) {
		return super.findPage(page, ueppQycsyw);
	}
	
	@Transactional(readOnly = false)
	public void saveWithCheck(UeppQycsyw ueppQycsyw) {
		List<UeppQycsyw> list = this.findList(ueppQycsyw);
		if(list == null || list.isEmpty()){
			save(ueppQycsyw);
		}
	}

	@Transactional(readOnly = false)
	public void save(UeppQycsyw ueppQycsyw) {
		super.save(ueppQycsyw);
	}
	
	@Transactional(readOnly = false)
	public void delete(UeppQycsyw ueppQycsyw) {
		super.delete(ueppQycsyw);
	}
	
}