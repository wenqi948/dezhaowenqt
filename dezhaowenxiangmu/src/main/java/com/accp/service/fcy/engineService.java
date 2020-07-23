package com.accp.service.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.dao.EngineMapper;
import com.accp.dao.ModeltypeMapper;
import com.accp.domain.Engine;
import com.accp.domain.EngineExample;
import com.accp.domain.Modeltype;
import com.accp.domain.ModeltypeExample;

@Service
@Transactional
public class engineService {
	
	@Autowired
	ModeltypeMapper modeltypemapper;
	
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
	
	public List<Modeltype> selectmodeltype(Integer engineid) {
		ModeltypeExample e=new ModeltypeExample();
		e.createCriteria().andEngineidEqualTo(engineid);
		return modeltypemapper.selectByExample(e);
	}
}
