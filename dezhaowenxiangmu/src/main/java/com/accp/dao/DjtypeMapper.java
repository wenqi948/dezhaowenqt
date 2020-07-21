package com.accp.dao;

import com.accp.domain.Djtype;
import com.accp.domain.DjtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DjtypeMapper {
    int countByExample(DjtypeExample example);

    int deleteByExample(DjtypeExample example);

    int deleteByPrimaryKey(Integer djid);

    int insert(Djtype record);

    int insertSelective(Djtype record);

    List<Djtype> selectByExample(DjtypeExample example);

    Djtype selectByPrimaryKey(Integer djid);

    int updateByExampleSelective(@Param("record") Djtype record, @Param("example") DjtypeExample example);

    int updateByExample(@Param("record") Djtype record, @Param("example") DjtypeExample example);

    int updateByPrimaryKeySelective(Djtype record);

    int updateByPrimaryKey(Djtype record);
}