package com.accp.dao;

import com.accp.domain.Usertable;
import com.accp.domain.UsertableExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsertableMapper {
    int countByExample(UsertableExample example);

    int deleteByExample(UsertableExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Usertable record);

    int insertSelective(Usertable record);

    List<Usertable> selectByExample(UsertableExample example);

    Usertable selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Usertable record, @Param("example") UsertableExample example);

    int updateByExample(@Param("record") Usertable record, @Param("example") UsertableExample example);

    int updateByPrimaryKeySelective(Usertable record);

    int updateByPrimaryKey(Usertable record);
}