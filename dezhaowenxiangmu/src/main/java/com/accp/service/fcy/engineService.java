package com.accp.service.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.EngineMapper;
import com.accp.domain.Engine;
import com.accp.domain.EngineExample;

@Service
@Transactional
public class engineService {
	
	@Autowired
	EngineMapper enginemapper;
	
	public int insert(Engine engine) {
		return enginemapper.insert(engine);
	}
	
	public int delete(Integer engineid) {
		return enginemapper.deleteByPrimaryKey(engineid);
	}
	public int update(Engine engine) {
		return enginemapper.updateByPrimaryKey(engine);
	}
	
	public List<Engine> selectAll(){
		return enginemapper.selectByExample(null);
	}

	public List<Engine> selectOne(String enginename){
		EngineExample e=new EngineExample();
		e.createCriteria().andEnginenameLike("%"+enginename+"%");
		return enginemapper.selectByExample(e);
	}
	
	public Engine selectId(Integer engineid) {
		return enginemapper.selectByPrimaryKey(engineid);
	}
}
