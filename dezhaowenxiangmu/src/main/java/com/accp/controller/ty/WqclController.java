package com.accp.controller.ty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Employee;
import com.accp.domain.Team;
import com.accp.domain.Workcars;
import com.accp.service.ty.WqclService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/wqcl")
public class WqclController {
	@Autowired
	public WqclService service;
	
	@RequestMapping("/findByPage")
	@ResponseBody
	public PageInfo<Workcars> findByPage(Integer currentPage,Integer pageSize) {
		return service.findByPageBean(currentPage, pageSize);
	}
	
	@RequestMapping("/findByTree")
	@ResponseBody
	public List<Team> findByTree(Integer fteamid) { 
		return service.findByTree(fteamid); 
	}
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(Workcars worker) {
		if(service.insert(worker)>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestBody Workcars worker) {
		if(service.update(worker)>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@RequestMapping("/findByBz")
	@ResponseBody
	public String findByBz(Integer teamid) { 
		return service.findByBz(teamid).getTeamname(); 
	}
}
