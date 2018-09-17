package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.CorpRegStaffCert;
import cn.wuxi.js.lib4.crawler.entity.CorpRegStaffCertExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface CorpRegStaffCertMapper {
    long countByExample(CorpRegStaffCertExample example);

    int deleteByExample(CorpRegStaffCertExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CorpRegStaffCert record);

    int insertSelective(CorpRegStaffCert record);

    List<CorpRegStaffCert> selectByExampleWithRowbounds(CorpRegStaffCertExample example, RowBounds rowBounds);

    List<CorpRegStaffCert> selectByExample(CorpRegStaffCertExample example);

    CorpRegStaffCert selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CorpRegStaffCert record, @Param("example") CorpRegStaffCertExample example);

    int updateByExample(@Param("record") CorpRegStaffCert record, @Param("example") CorpRegStaffCertExample example);

    int updateByPrimaryKeySelective(CorpRegStaffCert record);

    int updateByPrimaryKey(CorpRegStaffCert record);
}