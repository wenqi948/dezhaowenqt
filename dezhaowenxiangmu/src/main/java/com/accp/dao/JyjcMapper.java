package com.accp.dao;

import com.accp.domain.Jyjc;
import com.accp.domain.JyjcExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JyjcMapper {
    int countByExample(JyjcExample example);

    int deleteByExample(JyjcExample example);

    int deleteByPrimaryKey(Integer jyid);

    int insert(Jyjc record);

    int insertSelective(Jyjc record);

    List<Jyjc> selectByExample(JyjcExample example);

    Jyjc selectByPrimaryKey(Integer jyid);

    int updateByExampleSelective(@Param("record") Jyjc record, @Param("example") JyjcExample example);

    int updateByExample(@Param("record") Jyjc record, @Param("example") JyjcExample example);

    int updateByPrimaryKeySelective(Jyjc record);

    int updateByPrimaryKey(Jyjc record);
}