package com.accp.controller.wq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Usertable;
import com.accp.service.wq.UsertableService;

@Controller
@RequestMapping("/usertableservlet")
public class UsertableController {

	@Autowired
	UsertableService service;
	
	//登录查询
	@RequestMapping("/denlucha")
	@ResponseBody
	public Usertable find(String name,String mima) {
		return service.find(name,mima);
	}
}
