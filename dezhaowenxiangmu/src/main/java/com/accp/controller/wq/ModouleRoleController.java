package com.accp.controller.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Modoule;
import com.accp.service.wq.ModouleRoleService;

@Controller
@RequestMapping("/modouleRoleservlet")
public class ModouleRoleController {

	@Autowired
	ModouleRoleService service;
	
	//根据角色id查询
	@RequestMapping("/findByrid")
	@ResponseBody
	public List<Modoule> findByrid(Integer catalog, Integer rid){
			return service.findByrid(catalog, rid);
	}
	
	
}
