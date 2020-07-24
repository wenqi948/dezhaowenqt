package com.accp.dao;

import com.accp.domain.Teamtime;
import com.accp.domain.TeamtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TeamtimeMapper {
    int countByExample(TeamtimeExample example);

    int deleteByExample(TeamtimeExample example);

    int deleteByPrimaryKey(Integer ttid);

    int insert(Teamtime record);

    int insertSelective(Teamtime record);

    List<Teamtime> selectByExample(TeamtimeExample example);

    Teamtime selectByPrimaryKey(Integer ttid);

    int updateByExampleSelective(@Param("record") Teamtime record, @Param("example") TeamtimeExample example);

    int updateByExample(@Param("record") Teamtime record, @Param("example") TeamtimeExample example);

    int updateByPrimaryKeySelective(Teamtime record);

    int updateByPrimaryKey(Teamtime record);
}