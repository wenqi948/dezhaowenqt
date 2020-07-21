package com.accp.dao;

import com.accp.domain.Modeltype;
import com.accp.domain.ModeltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModeltypeMapper {
    int countByExample(ModeltypeExample example);

    int deleteByExample(ModeltypeExample example);

    int deleteByPrimaryKey(String cartypeid);

    int insert(Modeltype record);

    int insertSelective(Modeltype record);

    List<Modeltype> selectByExample(ModeltypeExample example);

    Modeltype selectByPrimaryKey(String cartypeid);

    int updateByExampleSelective(@Param("record") Modeltype record, @Param("example") ModeltypeExample example);

    int updateByExample(@Param("record") Modeltype record, @Param("example") ModeltypeExample example);

    int updateByPrimaryKeySelective(Modeltype record);

    int updateByPrimaryKey(Modeltype record);
}