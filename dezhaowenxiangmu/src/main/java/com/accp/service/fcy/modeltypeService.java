package com.accp.service.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;

import com.accp.dao.CartypesMapper;
import com.accp.dao.EngineMapper;
import com.accp.dao.ModeltypeMapper;
import com.accp.domain.Cartypes;
import com.accp.domain.Engine;
import com.accp.domain.Modeltype;
import com.accp.domain.ModeltypeExample;

@Service
@Transactional
public class modeltypeService {
	
	@Autowired
	ModeltypeMapper modeltypemapper;
	
	@Autowired
	EngineMapper enginemapper;
	
	@Autowired
	CartypesMapper cartypesmapper;
	
	
	public int insert(Modeltype modeltype) {
		return modeltypemapper.insert(modeltype);
	}
	
	public int remove(String cartypeid) {
		return modeltypemapper.deleteByPrimaryKey(cartypeid);
	}
	
	public List<Modeltype> selectcartypes(Integer ctsid){
		ModeltypeExample e=new ModeltypeExample();
		e.createCriteria().andCtsidEqualTo(ctsid);
		List<Modeltype> list= modeltypemapper.selectByExample(e);
		for (Modeltype modeltype : list) {
			Engine engine=enginemapper.selectByPrimaryKey(modeltype.getEngineid());
			modeltype.setEnginename(engine.getEnginename());
			Cartypes cartypes=cartypesmapper.selectByPrimaryKey(modeltype.getCtsid());
			modeltype.setCtsnames(cartypes.getCtsnames());
		}
		return list;
	}
	
	public int update(@RequestBody Modeltype modeltype) {
		return modeltypemapper.updateByPrimaryKey(modeltype);
	}
	
	public List<Modeltype> selectAll(){
		List<Modeltype> list=modeltypemapper.selectByExample(null);
		for (Modeltype modeltype : list) {
			Engine engine=enginemapper.selectByPrimaryKey(modeltype.getEngineid());
			modeltype.setEnginename(engine.getEnginename());
			Cartypes cartypes=cartypesmapper.selectByPrimaryKey(modeltype.getCtsid());
			modeltype.setCtsnames(cartypes.getCtsnames());	
		}
		return list;
	}
	
	public List<Modeltype> selectOne(String modeltype){
		ModeltypeExample e=new ModeltypeExample();
		e.createCriteria().andCartypenameLike("%"+modeltype+"%");
		List<Modeltype> list=modeltypemapper.selectByExample(e);
		for (Modeltype m : list) {
			Engine engine=enginemapper.selectByPrimaryKey(m.getEngineid());
			m.setEnginename(engine.getEnginename());
			Cartypes cartypes=cartypesmapper.selectByPrimaryKey(m.getCtsid());
			m.setCtsnames(cartypes.getCtsnames());	
		}
		return list;
	}
	
	public Modeltype selectId(String cartypeid) {
		Modeltype m= modeltypemapper.selectByPrimaryKey(cartypeid);
		Engine engine=enginemapper.selectByPrimaryKey(m.getEngineid());
		m.setEnginename(engine.getEnginename());
		Cartypes cartypes=cartypesmapper.selectByPrimaryKey(m.getCtsid());
		m.setCtsnames(cartypes.getCtsnames());
		return m;
	}
}
