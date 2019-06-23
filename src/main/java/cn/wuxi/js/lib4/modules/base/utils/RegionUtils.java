package cn.wuxi.js.lib4.modules.base.utils;

import java.util.List;

import cn.wuxi.js.lib4.common.utils.SpringContextHolder;
import cn.wuxi.js.lib4.modules.base.dao.RegionDao;
import cn.wuxi.js.lib4.modules.base.entity.Region;

public class RegionUtils {
	
	private static RegionDao regionDao = SpringContextHolder.getBean(RegionDao.class);

	public RegionUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Region> getRegionList(String level, String parentId){
		Region entity = new Region();
		entity.setLevel(level);
		entity.setParent(new Region(parentId));
		
		return regionDao.findList(entity);
	}

}
