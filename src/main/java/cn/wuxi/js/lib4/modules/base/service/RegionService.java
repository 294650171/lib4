package cn.wuxi.js.lib4.modules.base.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.base.dao.RegionDao;
import cn.wuxi.js.lib4.modules.base.entity.Region;

@Service
@Transactional(readOnly = true)
public class RegionService extends CrudService<RegionDao, Region>  {

	public RegionService() {

	}
	
	public Region get(String id) {
		return super.get(id);
	}
	
	public List<Region> findList(Region region) {
		return super.findList(region);
	}

}
