package com.accp.service.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.ModouleMapper;
import com.accp.dao.ModouleRoleMapper;
import com.accp.domain.Modoule;
import com.accp.domain.ModouleRole;
import com.accp.domain.ModouleRoleExample;

@Service
@Transactional
public class ModouleRoleService {

	@Autowired
	ModouleRoleMapper mapper;
	
	@Autowired
	ModouleMapper mappermo;
	
	
	//根据角色id查询
	public List<Modoule> findByrid(Integer catalog, Integer roleId){
		System.out.println(roleId);
		return mappermo.findByRoleId(catalog, roleId);
	}
	
	
	
	
	
	
}
