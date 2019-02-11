/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import org.apache.ibatis.annotations.Param;

/**
 * 企业基本信息DAO接口
 * @author huangzhengyu
 * @version 2018-07-06
 */
@MyBatisDao
public interface UeppQyjbxxDao extends CrudDao<UeppQyjbxx> {
	void selfSave(UeppQyjbxx bean);

}