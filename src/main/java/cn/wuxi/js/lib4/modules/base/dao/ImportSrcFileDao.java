/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.dao;

import cn.wuxi.js.lib4.common.persistence.CrudDao;
import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.modules.base.entity.ImportSrcFile;

/**
 * 文件导入DAO接口
 * @author aaronhuang
 * @version 2019-06-27
 */
@MyBatisDao
public interface ImportSrcFileDao extends CrudDao<ImportSrcFile> {
	
}