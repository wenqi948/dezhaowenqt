package com.accp.dao;

import com.accp.domain.Wxstate;
import com.accp.domain.WxstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxstateMapper {
    int countByExample(WxstateExample example);

    int deleteByExample(WxstateExample example);

    int deleteByPrimaryKey(Integer wxstateid);

    int insert(Wxstate record);

    int insertSelective(Wxstate record);

    List<Wxstate> selectByExample(WxstateExample example);

    Wxstate selectByPrimaryKey(Integer wxstateid);

    int updateByExampleSelective(@Param("record") Wxstate record, @Param("example") WxstateExample example);

    int updateByExample(@Param("record") Wxstate record, @Param("example") WxstateExample example);

    int updateByPrimaryKeySelective(Wxstate record);

    int updateByPrimaryKey(Wxstate record);
}