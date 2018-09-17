package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.Qycsyw;
import cn.wuxi.js.lib4.crawler.entity.QycsywExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface QycsywMapper {
    long countByExample(QycsywExample example);

    int deleteByExample(QycsywExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Qycsyw record);

    int insertSelective(Qycsyw record);

    List<Qycsyw> selectByExampleWithRowbounds(QycsywExample example, RowBounds rowBounds);

    List<Qycsyw> selectByExample(QycsywExample example);

    Qycsyw selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Qycsyw record, @Param("example") QycsywExample example);

    int updateByExample(@Param("record") Qycsyw record, @Param("example") QycsywExample example);

    int updateByPrimaryKeySelective(Qycsyw record);

    int updateByPrimaryKey(Qycsyw record);
}