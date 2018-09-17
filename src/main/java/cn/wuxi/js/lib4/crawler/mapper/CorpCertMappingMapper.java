package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.CorpCertMapping;
import cn.wuxi.js.lib4.crawler.entity.CorpCertMappingExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface CorpCertMappingMapper {
    long countByExample(CorpCertMappingExample example);

    int deleteByExample(CorpCertMappingExample example);

    int insert(CorpCertMapping record);

    int insertSelective(CorpCertMapping record);

    List<CorpCertMapping> selectByExampleWithRowbounds(CorpCertMappingExample example, RowBounds rowBounds);

    List<CorpCertMapping> selectByExample(CorpCertMappingExample example);

    int updateByExampleSelective(@Param("record") CorpCertMapping record, @Param("example") CorpCertMappingExample example);

    int updateByExample(@Param("record") CorpCertMapping record, @Param("example") CorpCertMappingExample example);
    
    List<CorpCertMapping> selectAll(String certType);
    
}