/**
 * Copyright &copy; 2012-2016 <a href="https://github.com/thinkgem/jeesite">JeeSite</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicAccout;
import org.apache.ibatis.annotations.Param;

/**
 * 企业基本帐号DAO接口
 * @author huang.zhengyu
 * @version 2019-01-17
 */
@MyBatisDao
public interface CorpBasicAccoutDao extends CrudDao<CorpBasicAccout> {
    CorpBasicAccout findByTyshxydm(@Param("tyshxydm") String tyshxydm);
}