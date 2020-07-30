package com.accp.controller.ty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Cartypes;
import com.accp.domain.Clientcar;
import com.accp.domain.Completed;
import com.accp.domain.Employee;
import com.accp.domain.Instation;
import com.accp.domain.Workcars;
import com.accp.domain.Wxxqd;
import com.accp.service.ty.ComeCarService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/tycomecar")
public class ComeCarController {
	@Autowired
	ComeCarService service;
	
	@RequestMapping("/findpage")
	@ResponseBody
	public PageInfo<Instation> findPage(Integer pageNum,Integer pageSize){
		return service.findPage(pageNum, pageSize);
	}
	@RequestMapping("/findcartype")
	@ResponseBody
	public List<Cartypes> findCarType(){
		return service.findCarType();
	}
	@RequestMapping("/findbycar")
	@ResponseBody
	public Instation findbycar(Integer dh){
		return service.findbycar(dh); 
	}
	
	@RequestMapping("/findbysum")
	@ResponseBody
	public int findbysum(Integer dh){
		Instation in=service.findbycar(dh);
		int count=0;
		for (Wxxqd wx : in.getWxxqd()) {
			count+=wx.getSum();
		}
		return count;
	}
	
	@RequestMapping("/findbysmoney")
	@ResponseBody
	public int findbysmoney(Integer dh){
		Instation in=service.findbycar(dh);
		int count=0;
		for (Wxxqd wx : in.getWxxqd()) {
			count+=wx.getDatepmoney();
		}
		return count;
	}
	
	@RequestMapping("/findbyyg")
	@ResponseBody
	public List<Employee> findbyyg(){
		return service.findbyyg();
	}
	
	
	@RequestMapping("/add")
	@ResponseBody
	public String add(Completed c) {
		if(service.insert(c)>0) {
			return "0000";
		}else {
			return "0001"; 
		}
	} 
	
	@RequestMapping("/findbynum")
	@ResponseBody
	public int findbynum(Integer dh) {
		return service.findbynum(dh);
	} 
	
	@RequestMapping("/hg")
	@ResponseBody
	public int hg(Integer dh) {
		return service.hg(dh);
	} 
} 
