package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.UeppCode;
import cn.wuxi.js.lib4.crawler.entity.UeppCodeExample;
import cn.wuxi.js.lib4.crawler.entity.UeppCodeKey;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface UeppCodeMapper {
    long countByExample(UeppCodeExample example);

    int deleteByExample(UeppCodeExample example);

    int deleteByPrimaryKey(UeppCodeKey key);

    int insert(UeppCode record);

    int insertSelective(UeppCode record);

    List<UeppCode> selectByExampleWithRowbounds(UeppCodeExample example, RowBounds rowBounds);

    List<UeppCode> selectByExample(UeppCodeExample example);

    UeppCode selectByPrimaryKey(UeppCodeKey key);

    int updateByExampleSelective(@Param("record") UeppCode record, @Param("example") UeppCodeExample example);

    int updateByExample(@Param("record") UeppCode record, @Param("example") UeppCodeExample example);

    int updateByPrimaryKeySelective(UeppCode record);

    int updateByPrimaryKey(UeppCode record);
}