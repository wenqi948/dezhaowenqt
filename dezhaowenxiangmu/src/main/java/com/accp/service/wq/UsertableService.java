package com.accp.service.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.UsertableMapper;
import com.accp.domain.Usertable;
import com.accp.domain.UsertableExample;

@Service
@Transactional
public class UsertableService {
	
	@Autowired
	UsertableMapper mapper;
	
	//登录查询
	public Usertable find(String name,String mima) {
		UsertableExample example=new UsertableExample();
		example.createCriteria().andUsnameEqualTo(name).andUspwdEqualTo(mima);
		List<Usertable> liat=mapper.selectByExample(example);
		if(liat.size()>0) {
			return liat.get(0);
		}
		return null;
	}

}
