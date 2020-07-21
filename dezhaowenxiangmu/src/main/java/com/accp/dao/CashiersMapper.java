package com.accp.dao;

import com.accp.domain.Cashiers;
import com.accp.domain.CashiersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CashiersMapper {
    int countByExample(CashiersExample example);

    int deleteByExample(CashiersExample example);

    int deleteByPrimaryKey(Integer casid);

    int insert(Cashiers record);

    int insertSelective(Cashiers record);

    List<Cashiers> selectByExample(CashiersExample example);

    Cashiers selectByPrimaryKey(Integer casid);

    int updateByExampleSelective(@Param("record") Cashiers record, @Param("example") CashiersExample example);

    int updateByExample(@Param("record") Cashiers record, @Param("example") CashiersExample example);

    int updateByPrimaryKeySelective(Cashiers record);

    int updateByPrimaryKey(Cashiers record);
}