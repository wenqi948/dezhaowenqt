package com.accp.dao;

import com.accp.domain.Cartypes;
import com.accp.domain.CartypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CartypesMapper {
    int countByExample(CartypesExample example);

    int deleteByExample(CartypesExample example);

    int deleteByPrimaryKey(Integer ctsid);

    int insert(Cartypes record);

    int insertSelective(Cartypes record);

    List<Cartypes> selectByExample(CartypesExample example);

    Cartypes selectByPrimaryKey(Integer ctsid);

    int updateByExampleSelective(@Param("record") Cartypes record, @Param("example") CartypesExample example);

    int updateByExample(@Param("record") Cartypes record, @Param("example") CartypesExample example);

    int updateByPrimaryKeySelective(Cartypes record);

    int updateByPrimaryKey(Cartypes record);
}