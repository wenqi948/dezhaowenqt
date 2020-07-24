package com.accp.service.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ModouleMapper;
import com.accp.domain.Modoule;
import com.accp.domain.ModouleExample;

@Service
@Transactional
public class ModouleService {
	
	@Autowired
	ModouleMapper mapper;
	
	//查询
	public List<Modoule> find(Integer id) {
		ModouleExample example=new ModouleExample();
		example.createCriteria().andParentidEqualTo(id);
		return mapper.selectByExample(example);
	}
	
	

}
