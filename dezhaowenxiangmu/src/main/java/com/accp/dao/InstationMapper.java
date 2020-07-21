package com.accp.dao;

import com.accp.domain.Instation;
import com.accp.domain.InstationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InstationMapper {
    int countByExample(InstationExample example);

    int deleteByExample(InstationExample example);

    int deleteByPrimaryKey(Integer insid);

    int insert(Instation record);

    int insertSelective(Instation record);

    List<Instation> selectByExample(InstationExample example);

    Instation selectByPrimaryKey(Integer insid);

    int updateByExampleSelective(@Param("record") Instation record, @Param("example") InstationExample example);

    int updateByExample(@Param("record") Instation record, @Param("example") InstationExample example);

    int updateByPrimaryKeySelective(Instation record);

    int updateByPrimaryKey(Instation record);
}