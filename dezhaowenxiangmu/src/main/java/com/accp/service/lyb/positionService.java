package com.accp.service.lyb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.PositionMapper;
import com.accp.domain.Position;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class positionService {
	@Autowired
    private PositionMapper pomapper;
    
    public PageInfo<Position> findbyapage(Integer pageNum,Integer pageSize){
   	 Page<Position> page=PageHelper.startPage(pageNum, pageSize);
   	 pomapper.selectByExample(null);
   	 return page.toPageInfo();
    }
    public int update(Position pon) {
    	return pomapper.updateByPrimaryKey(pon);
    }
    
    public List<Position> find(){
   	return pomapper.selectByExample(null);
    }
    
    public int remove(Integer positionid) {
   	 return pomapper.deleteByPrimaryKey(positionid);
    }
    
    public int create(Position pos) {
   	 return pomapper.insert(pos);
    }
}
