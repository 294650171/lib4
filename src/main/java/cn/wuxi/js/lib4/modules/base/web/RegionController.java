package cn.wuxi.js.lib4.modules.base.web;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wuxi.js.lib4.common.web.BaseController;
import cn.wuxi.js.lib4.modules.base.entity.Region;
import cn.wuxi.js.lib4.modules.base.service.RegionService;

@Controller
@RequestMapping(value = {"${adminPath}/base/region", "${frontPath}/base/region"})
public class RegionController  extends BaseController {
	
	@Autowired
	private RegionService regionService;

	public RegionController() {
		// TODO Auto-generated constructor stub
	}
	
	@ResponseBody
	@RequestMapping(value = "treeData")
	public List<Region> treeData(@RequestParam(required=false) String level, @RequestParam(required=false) String parentId){
		Region region = new Region();
		region.setLevel(level);
		region.setParent(new Region(parentId));
		List<Region> rst = regionService.findList(region);
		return rst;
		
	}

}
