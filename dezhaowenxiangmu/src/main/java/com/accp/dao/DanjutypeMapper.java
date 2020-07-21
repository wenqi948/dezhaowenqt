package com.accp.dao;

import com.accp.domain.Danjutype;
import com.accp.domain.DanjutypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DanjutypeMapper {
    int countByExample(DanjutypeExample example);

    int deleteByExample(DanjutypeExample example);

    int deleteByPrimaryKey(Integer djuid);

    int insert(Danjutype record);

    int insertSelective(Danjutype record);

    List<Danjutype> selectByExample(DanjutypeExample example);

    Danjutype selectByPrimaryKey(Integer djuid);

    int updateByExampleSelective(@Param("record") Danjutype record, @Param("example") DanjutypeExample example);

    int updateByExample(@Param("record") Danjutype record, @Param("example") DanjutypeExample example);

    int updateByPrimaryKeySelective(Danjutype record);

    int updateByPrimaryKey(Danjutype record);
}