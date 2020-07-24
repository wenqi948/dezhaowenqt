package com.accp.dao;

import com.accp.domain.ModouleRole;
import com.accp.domain.ModouleRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModouleRoleMapper {
    int countByExample(ModouleRoleExample example);

    int deleteByExample(ModouleRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ModouleRole record);

    int insertSelective(ModouleRole record);

    List<ModouleRole> selectByExample(ModouleRoleExample example);

    ModouleRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ModouleRole record, @Param("example") ModouleRoleExample example);

    int updateByExample(@Param("record") ModouleRole record, @Param("example") ModouleRoleExample example);

    int updateByPrimaryKeySelective(ModouleRole record);

    int updateByPrimaryKey(ModouleRole record);
}