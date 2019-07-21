/**
 * Copyright &copy; 2019-2021 <a href="http://www.qlmsoft.cn/">QLMSoft</a> All rights reserved.
 */
package cn.wuxi.js.lib4.modules.base.service;

import java.io.File;
import java.io.IOException;
import java.util.*;

import cn.wuxi.js.lib4.common.Constants;
import cn.wuxi.js.lib4.common.config.Global;
import cn.wuxi.js.lib4.common.utils.StringUtils;
import cn.wuxi.js.lib4.common.utils.excel.ImportExcel;
import cn.wuxi.js.lib4.modules.base.dao.UeppQyryDao;
import cn.wuxi.js.lib4.modules.base.dao.UeppRyjbxxDao;
import cn.wuxi.js.lib4.modules.base.dao.UeppRyzsDao;
import cn.wuxi.js.lib4.modules.base.entity.*;
import cn.wuxi.js.lib4.modules.corp.dao.UeppQyjbxxDao;
import cn.wuxi.js.lib4.modules.corp.entity.UeppQyjbxx;
import cn.wuxi.js.lib4.modules.corp.service.UeppQyjbxxService;
import cn.wuxi.js.lib4.modules.sys.entity.User;
import cn.wuxi.js.lib4.modules.sys.utils.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.wuxi.js.lib4.common.persistence.Page;
import cn.wuxi.js.lib4.common.service.CrudService;
import cn.wuxi.js.lib4.modules.base.dao.ImportSrcFileDao;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件导入Service
 * @author aaronhuang
 * @version 2019-06-27
 */
@Service
@Transactional(readOnly = true)
public class ImportSrcFileService extends CrudService<ImportSrcFileDao, ImportSrcFile> {


	@Autowired
	private UeppQyjbxxDao qyjbxxDao;

	@Autowired
	private UeppRyjbxxDao ryjbxxDao;

	@Autowired
	private UeppRyzsDao ryzsDao;

	@Autowired
	private UeppQyryDao qyryDao;

	public ImportSrcFile get(String id) {
		return super.get(id);
	}
	
	public List<ImportSrcFile> findList(ImportSrcFile importSrcFile) {
		return super.findList(importSrcFile);
	}
	
	public Page<ImportSrcFile> findPage(Page<ImportSrcFile> page, ImportSrcFile importSrcFile) {
		return super.findPage(page, importSrcFile);
	}
	
	@Transactional(readOnly = false)
	public void save(ImportSrcFile bean) {

		//resolve import data
		User currentUser = UserUtils.getUser();
		bean.setUpdateBy(currentUser);

		String fileDir = Global
				.getConfig("userfiles.basedir.sys.importfile") ;
		File dir = new File(fileDir);
		if (!dir.exists()) {
			dir.mkdirs();
		}

		if (!bean.getFile().isEmpty()
				|| !StringUtils.isEmpty(bean.getFile()
				.getOriginalFilename())) {

			//save src file
			ImportSrcFile orgFile = resolveImportFile(fileDir,
					bean.getFile());
			orgFile.setType(ImportSrcFile.FILE_TYPE_1);
			super.save(orgFile);

			try {
				ImportExcel excelUtil = new ImportExcel(orgFile.getUrl(),0,0);

				List<ImportPersonCert> dataList = excelUtil.getDataList(ImportPersonCert.class);

				for(ImportPersonCert item : dataList){
					resolvePersonCert(item);
				}

				//insert person cert

			} catch (Exception e) {
				e.printStackTrace();
				logger.error(e.getMessage());
			}
		}

	}



	@Transactional(readOnly = false)
	public void delete(ImportSrcFile importSrcFile) {
		super.delete(importSrcFile);
	}


	private void resolvePersonCert(ImportPersonCert item) {

		//查询企业
		UeppQyjbxx qyjbxx = qyjbxxDao.findByName(item.getCorpName());
		if(qyjbxx != null){

			//人员基本信息
			UeppRyjbxx ry = ryjbxxDao.get(item.getIdCard());
			if(ry == null){
				ry = new UeppRyjbxx();
				ry.setRyid(item.getIdCard());
				ry.setXm(item.getName());
				ry.setZjlxid("1");
				ry.setZjlx("身份证");
				ry.setZjhm(item.getCertNo());
				ry.setXb(item.getGendar());
				ry.setTag("无锡建设信息中心");
				ry.setXgrqsj(new Date());
				ryjbxxDao.insert(ry);
			}

			logger.info("ry - ry.getRyid()" + ry.getRyid());

			//人员证书
			UeppRyzs ryzs = new UeppRyzs();
			ryzs.setRy(ry);
			ryzs.setRyzyzglxid(Constants.RYZYZGLXID_JZQYY);
			ryzs.setRyzyzglx(Constants.RYZYZGLX_JZQYY);
			ryzs.setRyzslxid(Constants.RYZSLXID_JZQYY);
			ryzs.setRyzslx(Constants.RYZSLX_JZQYY);
			ryzs.setSfzzz("1");
			ryzs.setZsbh(item.getCertNo());
			ryzs.setFzdw(Constants.FZDW);
			ryzs.setTag(Constants.JZQYY_TAG);
			ryzs.setFzrq(new Date());

			List<UeppRyzs> ryzsList = ryzsDao.findList(ryzs);
			if(ryzsList == null || ryzsList.isEmpty()){
				ryzsDao.insert(ryzs);
			}

			//人员执业资格

			//企业人员关联表
			UeppQyry qyry = new UeppQyry();
			qyry.setQyid(qyjbxx.getQyid());
			qyry.setRyid(ry);
			qyry.setRyzyzglxid(Constants.RYZYZGLXID_JZQYY);
			qyry.setRyzyzglx(Constants.RYZYZGLX_JZQYY);
			qyry.setTag(Constants.JZQYY_TAG);
			qyry.setXgrqsj(new Date());

			List<UeppQyry> list = qyryDao.findListByRyidAndType(qyry);
			if(list == null || list.isEmpty()){
				qyryDao.insert(qyry);
			}


		}


	}


	/**
	 * 上传文件处理程序
	 *
	 * @param fileDir
	 * @param multipartFile
	 * @return
	 */
	private ImportSrcFile resolveImportFile(String fileDir,
											  MultipartFile multipartFile) {
		ImportSrcFile aFile = new ImportSrcFile();
		int pos = multipartFile.getOriginalFilename().lastIndexOf(".");
		String fileName = multipartFile.getOriginalFilename().substring(0, pos);
		String suffix = multipartFile.getOriginalFilename().substring(pos + 1);

		aFile.setName(fileName + "_" + Calendar.getInstance().getTimeInMillis() + "." + suffix);
		File imageFile = new File(fileDir, aFile.getName());
		try {
			multipartFile.transferTo(imageFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
		aFile.setUrl(imageFile.getAbsolutePath());
		return aFile;
	}
}