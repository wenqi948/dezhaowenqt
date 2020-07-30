package com.accp.dao;

import com.accp.domain.Modoule;
import com.accp.domain.ModouleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModouleMapper {
	List<Modoule> find(Integer parentid);
	
	List<Modoule> findByRoleId(@Param("catalog") Integer catalog,@Param("rid") Integer roleId);
	
    int countByExample(ModouleExample example);

    int deleteByExample(ModouleExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(Modoule record);

    int insertSelective(Modoule record);

    List<Modoule> selectByExample(ModouleExample example);

    Modoule selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") Modoule record, @Param("example") ModouleExample example);

    int updateByExample(@Param("record") Modoule record, @Param("example") ModouleExample example);

    int updateByPrimaryKeySelective(Modoule record);

    int updateByPrimaryKey(Modoule record);
}