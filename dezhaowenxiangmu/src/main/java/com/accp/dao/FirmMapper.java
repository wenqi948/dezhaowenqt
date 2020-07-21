package com.accp.dao;

import com.accp.domain.Firm;
import com.accp.domain.FirmExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirmMapper {
    int countByExample(FirmExample example);

    int deleteByExample(FirmExample example);

    int deleteByPrimaryKey(String firmno);

    int insert(Firm record);

    int insertSelective(Firm record);

    List<Firm> selectByExample(FirmExample example);

    Firm selectByPrimaryKey(String firmno);

    int updateByExampleSelective(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByExample(@Param("record") Firm record, @Param("example") FirmExample example);

    int updateByPrimaryKeySelective(Firm record);

    int updateByPrimaryKey(Firm record);
}