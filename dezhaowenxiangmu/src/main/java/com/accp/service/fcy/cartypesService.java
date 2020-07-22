package com.accp.service.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import com.accp.dao.CartypesMapper;
import com.accp.dao.ModeltypeMapper;
import com.accp.domain.Cartypes;
import com.accp.domain.CartypesExample;
import com.accp.domain.Modeltype;
import com.accp.domain.ModeltypeExample;

@Service
@Transactional
public class cartypesService {
	
	@Autowired
	CartypesMapper cartypesmapper;
	
	@Autowired
	ModeltypeMapper modeltypemapper;
	
	public int insert(Cartypes cartypes) {
		return cartypesmapper.insert(cartypes);
	}
	
	public int remove(Integer ctsid) {
		ModeltypeExample e=new ModeltypeExample();
		e.createCriteria().andCtsidEqualTo(ctsid);
		List<Modeltype> list= modeltypemapper.selectByExample(e);
		for (Modeltype modeltype : list) {
			modeltypemapper.deleteByPrimaryKey(modeltype.getCartypeid());
		}
		return cartypesmapper.deleteByPrimaryKey(ctsid);
	}
	
	public Cartypes selectId(Integer ctsid) {
		return cartypesmapper.selectByPrimaryKey(ctsid);
	}
	
	public List<Cartypes> selectOne(String cartypes){
		CartypesExample e=new CartypesExample();
		e.createCriteria().andCtsnamesLike("%"+cartypes+"%");
		return cartypesmapper.selectByExample(e);
	}
	
	public List<Cartypes> selectAll(){
		return cartypesmapper.selectByExample(null);
	}
}
