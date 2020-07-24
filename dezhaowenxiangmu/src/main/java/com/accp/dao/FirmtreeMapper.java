package com.accp.dao;

import com.accp.domain.Firmtree;
import com.accp.domain.FirmtreeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirmtreeMapper {
    int countByExample(FirmtreeExample example);

    int deleteByExample(FirmtreeExample example);

    int deleteByPrimaryKey(Integer citytreeid);

    int insert(Firmtree record);

    int insertSelective(Firmtree record);

    List<Firmtree> selectByExample(FirmtreeExample example);

    Firmtree selectByPrimaryKey(Integer citytreeid);

    int updateByExampleSelective(@Param("record") Firmtree record, @Param("example") FirmtreeExample example);

    int updateByExample(@Param("record") Firmtree record, @Param("example") FirmtreeExample example);

    int updateByPrimaryKeySelective(Firmtree record);

    int updateByPrimaryKey(Firmtree record);
}