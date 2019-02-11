/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpAccountResetPassApplication;

/**
 * 企业密码找回申请DAO接口
 * @author aaronhuang
 * @version 2019-02-11
 */
@MyBatisDao
public interface CorpAccountResetPassApplicationDao extends CrudDao<CorpAccountResetPassApplication> {
	
}