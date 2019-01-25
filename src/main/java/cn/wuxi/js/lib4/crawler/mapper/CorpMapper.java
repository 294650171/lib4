package cn.wuxi.js.lib4.crawler.mapper;

import java.util.List;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.CorpEntity;

@MyBatisDao
public interface CorpMapper {

	List<CorpEntity> getCorpWithoutUnifiedSocialCreditCode();

	void updateUnifiedSocialCreditCode(CorpEntity corp);
	
	void updateNoCredCode(CorpEntity corp);
	
	//CorpEntity findCorpByUnifiedSocialCreditCode(String code);
	
	//勘察设计企业
	List<CorpEntity> getSurveyAndDesign();
	
	//勘察企业
	List<CorpEntity> getSurveyAndDesignStaff();
	
	//新增企业部分
	List<CorpEntity> getSurveyAndDesignAdd();

	//有资质过期的企业
	List<CorpEntity> getSurveyAndDesignExpired();
	
	//培训企业名单
	List<String> getPeixun();

}