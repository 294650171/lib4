/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.modules.base.entity.UeppRyjbxx;
import cn.wuxi.js.lib4.modules.base.dao.UeppRyjbxxDao;
import cn.wuxi.js.lib4.modules.base.entity.UeppQyry;
import cn.wuxi.js.lib4.modules.base.dao.UeppQyryDao;
import cn.wuxi.js.lib4.modules.base.entity.UeppRyzs;
import cn.wuxi.js.lib4.modules.base.dao.UeppRyzsDao;
import cn.wuxi.js.lib4.modules.base.entity.UeppRyzyzg;
import cn.wuxi.js.lib4.modules.base.dao.UeppRyzyzgDao;

/**
 * 企业人员Service
 * @author aaronhuang
 * @version 2019-06-28
 */
@Service
@Transactional(readOnly = true)
public class UeppRyjbxxService extends CrudService<UeppRyjbxxDao, UeppRyjbxx> {

	@Autowired
	private UeppRyzsDao ueppRyzsDao;
	@Autowired
	private UeppRyzyzgDao ueppRyzyzgDao;
	
	public UeppRyjbxx get(String id) {
		UeppRyjbxx ueppRyjbxx = super.get(id);
		ueppRyjbxx.setUeppRyzsList(ueppRyzsDao.findList(new UeppRyzs(ueppRyjbxx)));
		ueppRyjbxx.setUeppRyzyzgList(ueppRyzyzgDao.findList(new UeppRyzyzg(ueppRyjbxx)));
		return ueppRyjbxx;
	}
	
	public List<UeppRyjbxx> findList(UeppRyjbxx ueppRyjbxx) {
		return super.findList(ueppRyjbxx);
	}
	
	public Page<UeppRyjbxx> findPage(Page<UeppRyjbxx> page, UeppRyjbxx ueppRyjbxx) {
		return super.findPage(page, ueppRyjbxx);
	}
	
	@Transactional(readOnly = false)
	public void save(UeppRyjbxx ueppRyjbxx) {
		super.save(ueppRyjbxx);

		for (UeppRyzs ueppRyzs : ueppRyjbxx.getUeppRyzsList()){
			if (ueppRyzs.getId() == null){
				continue;
			}
			if (UeppRyzs.DEL_FLAG_NORMAL.equals(ueppRyzs.getDelFlag())){
				if (StringUtils.isBlank(ueppRyzs.getId())){
					ueppRyzs.setRy(ueppRyjbxx);
					ueppRyzs.preInsert();
					ueppRyzsDao.insert(ueppRyzs);
				}else{
					ueppRyzs.preUpdate();
					ueppRyzsDao.update(ueppRyzs);
				}
			}else{
				ueppRyzsDao.delete(ueppRyzs);
			}
		}
		for (UeppRyzyzg ueppRyzyzg : ueppRyjbxx.getUeppRyzyzgList()){
			if (ueppRyzyzg.getId() == null){
				continue;
			}
			if (UeppRyzyzg.DEL_FLAG_NORMAL.equals(ueppRyzyzg.getDelFlag())){
				if (StringUtils.isBlank(ueppRyzyzg.getId())){
					ueppRyzyzg.setRyid(ueppRyjbxx);
					ueppRyzyzg.preInsert();
					ueppRyzyzgDao.insert(ueppRyzyzg);
				}else{
					ueppRyzyzg.preUpdate();
					ueppRyzyzgDao.update(ueppRyzyzg);
				}
			}else{
				ueppRyzyzgDao.delete(ueppRyzyzg);
			}
		}
	}
	
	@Transactional(readOnly = false)
	public void delete(UeppRyjbxx ueppRyjbxx) {
		super.delete(ueppRyjbxx);
		ueppRyzsDao.delete(new UeppRyzs(ueppRyjbxx));
		ueppRyzyzgDao.delete(new UeppRyzyzg(ueppRyjbxx));
	}
	
}