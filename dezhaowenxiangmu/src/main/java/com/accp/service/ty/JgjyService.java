package com.accp.service.ty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.CartypesMapper;
import com.accp.dao.DanjutypeMapper;
import com.accp.dao.InstationMapper;
import com.accp.dao.WorkcarsMapper;
import com.accp.domain.Cartypes;
import com.accp.domain.Danjutype;
import com.accp.domain.Instation;
import com.accp.domain.InstationExample;
import com.accp.domain.Team;
import com.accp.domain.Workcars;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class JgjyService {
	@Autowired
	private InstationMapper imapper;
	
	@Autowired
	private CartypesMapper cmapper;
	
	@Autowired
	private DanjutypeMapper dmapper;
	
	public PageInfo<Instation> findByPageBean(Integer currentPage,Integer pageSize,String isJg){
		Page<Instation> page=PageHelper.startPage(currentPage,pageSize);
		List<Instation> list=new ArrayList<Instation>();
		if(isJg!=null) {
			InstationExample example=new InstationExample();
			example.createCriteria().andYewutypeEqualTo(isJg);
			list=imapper.selectByExample(example);
		}else {
			list=imapper.selectByExample(null);
		}
		for (Instation in : list) {
			Cartypes car=cmapper.selectByPrimaryKey(in.getCtsid());
			in.setCartypes(car); 
			Danjutype danju=dmapper.selectByPrimaryKey(in.getWxstateid());
			in.setDanjutype(danju);
		}
		return page.toPageInfo();
	}
}
