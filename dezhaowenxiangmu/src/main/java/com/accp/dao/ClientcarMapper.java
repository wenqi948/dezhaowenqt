package com.accp.dao;

import com.accp.domain.Clientcar;
import com.accp.domain.ClientcarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClientcarMapper {
    int countByExample(ClientcarExample example);

    int deleteByExample(ClientcarExample example);

    int deleteByPrimaryKey(String carno);

    int insert(Clientcar record);

    int insertSelective(Clientcar record);

    List<Clientcar> selectByExample(ClientcarExample example);

    Clientcar selectByPrimaryKey(String carno);

    int updateByExampleSelective(@Param("record") Clientcar record, @Param("example") ClientcarExample example);

    int updateByExample(@Param("record") Clientcar record, @Param("example") ClientcarExample example);

    int updateByPrimaryKeySelective(Clientcar record);

    int updateByPrimaryKey(Clientcar record);
}