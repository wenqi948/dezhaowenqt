package com.accp.dao;

import com.accp.domain.Repairtree;
import com.accp.domain.RepairtreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepairtreeMapper {
	
	
	
	List<Repairtree> findTree(Integer parentiid);
	
    int countByExample(RepairtreeExample example);

    int deleteByExample(RepairtreeExample example);

    int deleteByPrimaryKey(Integer xtype);

    int insert(Repairtree record);

    int insertSelective(Repairtree record);

    List<Repairtree> selectByExample(RepairtreeExample example);

    Repairtree selectByPrimaryKey(Integer xtype);

    int updateByExampleSelective(@Param("record") Repairtree record, @Param("example") RepairtreeExample example);

    int updateByExample(@Param("record") Repairtree record, @Param("example") RepairtreeExample example);

    int updateByPrimaryKeySelective(Repairtree record);

    int updateByPrimaryKey(Repairtree record);
}