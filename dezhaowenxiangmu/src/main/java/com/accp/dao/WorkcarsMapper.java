package com.accp.dao;

import com.accp.domain.Workcars;
import com.accp.domain.WorkcarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkcarsMapper {
    int countByExample(WorkcarsExample example);

    int deleteByExample(WorkcarsExample example);

    int deleteByPrimaryKey(Integer wid);

    int insert(Workcars record);

    int insertSelective(Workcars record);

    List<Workcars> selectByExample(WorkcarsExample example);

    Workcars selectByPrimaryKey(Integer wid);

    int updateByExampleSelective(@Param("record") Workcars record, @Param("example") WorkcarsExample example);

    int updateByExample(@Param("record") Workcars record, @Param("example") WorkcarsExample example);

    int updateByPrimaryKeySelective(Workcars record);

    int updateByPrimaryKey(Workcars record);
}