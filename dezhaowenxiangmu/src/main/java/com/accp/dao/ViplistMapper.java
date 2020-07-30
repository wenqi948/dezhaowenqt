package com.accp.dao;

import com.accp.domain.Viplist;
import com.accp.domain.ViplistExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViplistMapper {
    int countByExample(ViplistExample example);

    int deleteByExample(ViplistExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Viplist record);

    int insertSelective(Viplist record);

    List<Viplist> selectByExample(ViplistExample example);

    Viplist selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Viplist record, @Param("example") ViplistExample example);

    int updateByExample(@Param("record") Viplist record, @Param("example") ViplistExample example);

    int updateByPrimaryKeySelective(Viplist record);

    int updateByPrimaryKey(Viplist record);
}