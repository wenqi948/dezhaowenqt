package com.accp.dao;

import com.accp.domain.Wxxqd;
import com.accp.domain.WxxqdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxxqdMapper {
    int countByExample(WxxqdExample example);

    int deleteByExample(WxxqdExample example);

    int deleteByPrimaryKey(Integer wxqid);

    int insert(Wxxqd record);

    int insertSelective(Wxxqd record);

    List<Wxxqd> selectByExample(WxxqdExample example);

    Wxxqd selectByPrimaryKey(Integer wxqid);

    int updateByExampleSelective(@Param("record") Wxxqd record, @Param("example") WxxqdExample example);

    int updateByExample(@Param("record") Wxxqd record, @Param("example") WxxqdExample example);

    int updateByPrimaryKeySelective(Wxxqd record);

    int updateByPrimaryKey(Wxxqd record);
}