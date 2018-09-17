package cn.wuxi.js.lib4.crawler.mapper;

import cn.wuxi.js.lib4.common.persistence.annotation.MyBatisDao;
import cn.wuxi.js.lib4.crawler.entity.Qyzs;
import cn.wuxi.js.lib4.crawler.entity.QyzsExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@MyBatisDao
public interface QyzsMapper {
    long countByExample(QyzsExample example);

    int deleteByExample(QyzsExample example);

    int deleteByPrimaryKey(String zsjlid);

    int insert(Qyzs record);

    int insertSelective(Qyzs record);

    List<Qyzs> selectByExampleWithRowbounds(QyzsExample example, RowBounds rowBounds);

    List<Qyzs> selectByExample(QyzsExample example);

    Qyzs selectByPrimaryKey(String zsjlid);

    int updateByExampleSelective(@Param("record") Qyzs record, @Param("example") QyzsExample example);

    int updateByExample(@Param("record") Qyzs record, @Param("example") QyzsExample example);

    int updateByPrimaryKeySelective(Qyzs record);

    int updateByPrimaryKey(Qyzs record);
    
    String queryQyzsID();
    
}