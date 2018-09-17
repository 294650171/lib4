package cn.wuxi.js.lib4.crawler.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.CorpRegStaff;
import cn.wuxi.js.lib4.crawler.entity.CorpRegStaffExample;
import cn.wuxi.js.lib4.crawler.mohurd.bean.RegStaffVO;

@MyBatisDao
public interface CorpRegStaffMapper {
    long countByExample(CorpRegStaffExample example);

    int deleteByExample(CorpRegStaffExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CorpRegStaff record);

    int insertSelective(CorpRegStaff record);

    List<CorpRegStaff> selectByExampleWithRowbounds(CorpRegStaffExample example, RowBounds rowBounds);

    List<CorpRegStaff> selectByExample(CorpRegStaffExample example);

    CorpRegStaff selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CorpRegStaff record, @Param("example") CorpRegStaffExample example);

    int updateByExample(@Param("record") CorpRegStaff record, @Param("example") CorpRegStaffExample example);

    int updateByPrimaryKeySelective(CorpRegStaff record);

    int updateByPrimaryKey(CorpRegStaff record);
 
    /**
     * 按名字跟身份证ID缩写查找身份证ID
     * @param record
     * @return
     */
    String selectIdCardByNameAndIdcard(RegStaffVO record);
    
}