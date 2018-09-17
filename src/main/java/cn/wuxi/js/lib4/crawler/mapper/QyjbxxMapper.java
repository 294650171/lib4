package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.Qyjbxx;
import cn.wuxi.js.lib4.crawler.entity.QyjbxxExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface QyjbxxMapper {
    long countByExample(QyjbxxExample example);

    int deleteByExample(QyjbxxExample example);

    int deleteByPrimaryKey(String qyid);

    int insert(Qyjbxx record);

    int insertSelective(Qyjbxx record);

    List<Qyjbxx> selectByExampleWithRowbounds(QyjbxxExample example, RowBounds rowBounds);

    List<Qyjbxx> selectByExample(QyjbxxExample example);

    Qyjbxx selectByPrimaryKey(String qyid);

    int updateByExampleSelective(@Param("record") Qyjbxx record, @Param("example") QyjbxxExample example);

    int updateByExample(@Param("record") Qyjbxx record, @Param("example") QyjbxxExample example);

    int updateByPrimaryKeySelective(Qyjbxx record);

    int updateByPrimaryKey(Qyjbxx record);
}