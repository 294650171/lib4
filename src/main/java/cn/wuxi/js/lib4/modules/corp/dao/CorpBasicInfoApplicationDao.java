/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.corp.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.corp.entity.CorpBasicInfoApplication;
import org.apache.ibatis.annotations.Param;

/**
 * 企业基本信息修改申请表DAO接口
 * @author aaronhuang
 * @version 2019-01-31
 */
@MyBatisDao
public interface CorpBasicInfoApplicationDao extends CrudDao<CorpBasicInfoApplication> {
	void deleteByProcInsId(@Param("qyid") String qyid, @Param("procInsId")  String procInsId);
	void updateStatus(@Param("id") String id, @Param("datastate") String datastate);
	void updateProcInsId(CorpBasicInfoApplication entity);
	
	void updateOpinion(CorpBasicInfoApplication entity);
	
}