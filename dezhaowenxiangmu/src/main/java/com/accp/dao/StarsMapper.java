package com.accp.dao;

import com.accp.domain.Stars;
import com.accp.domain.StarsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StarsMapper {
    int countByExample(StarsExample example);

    int deleteByExample(StarsExample example);

    int deleteByPrimaryKey(Integer starsid);

    int insert(Stars record);

    int insertSelective(Stars record);

    List<Stars> selectByExample(StarsExample example);

    Stars selectByPrimaryKey(Integer starsid);

    int updateByExampleSelective(@Param("record") Stars record, @Param("example") StarsExample example);

    int updateByExample(@Param("record") Stars record, @Param("example") StarsExample example);

    int updateByPrimaryKeySelective(Stars record);

    int updateByPrimaryKey(Stars record);
}