package com.youjiang.weiyitoutiao.mapper.generate;

import com.youjiang.weiyitoutiao.po.Toutiao;
import com.youjiang.weiyitoutiao.po.ToutiaoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToutiaoMapper {
    int countByExample(ToutiaoExample example);

    int deleteByExample(ToutiaoExample example);

    int deleteByPrimaryKey(String id);

    int insert(Toutiao record);

    int insertSelective(Toutiao record);

    List<Toutiao> selectByExample(ToutiaoExample example);

    Toutiao selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Toutiao record, @Param("example") ToutiaoExample example);

    int updateByExample(@Param("record") Toutiao record, @Param("example") ToutiaoExample example);

    int updateByPrimaryKeySelective(Toutiao record);

    int updateByPrimaryKey(Toutiao record);
}