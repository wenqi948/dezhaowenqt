package com.accp.controller.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Instation;
import com.accp.domain.Workcars;
import com.accp.service.ty.JgjyService;
import com.accp.service.ty.WqclService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/jgjy")
public class JgjyController {
	@Autowired
	public JgjyService service;
	
	@RequestMapping("/findByPage")
	@ResponseBody
	public PageInfo<Instation> findByPage(Integer currentPage,Integer pageSize,String isJg) {
		return service.findByPageBean(currentPage, pageSize,isJg);
	}
}
