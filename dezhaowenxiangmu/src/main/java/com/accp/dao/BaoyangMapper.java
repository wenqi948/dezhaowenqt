package com.accp.dao;

import com.accp.domain.Baoyang;
import com.accp.domain.BaoyangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BaoyangMapper {
    int countByExample(BaoyangExample example);

    int deleteByExample(BaoyangExample example);

    int insert(Baoyang record);

    int insertSelective(Baoyang record);

    List<Baoyang> selectByExample(BaoyangExample example);

    int updateByExampleSelective(@Param("record") Baoyang record, @Param("example") BaoyangExample example);

    int updateByExample(@Param("record") Baoyang record, @Param("example") BaoyangExample example);
}