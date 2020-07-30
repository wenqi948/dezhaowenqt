package com.accp.controller.ty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.Employee;
import com.accp.service.ty.ZjjgService;
import com.github.pagehelper.PageInfo;



@Controller
@RequestMapping("/zzjg")
public class ZjjgController {
	@Autowired
	public ZjjgService service;
	
	@RequestMapping("/findByTree")
	@ResponseBody
	public List<Department> find(Integer parentid){
		return service.find(parentid);
	}
	
	@RequestMapping("/findByPage")
	@ResponseBody
	public PageInfo<Employee> findByPage(Integer currentPage,Integer pageSize,Integer embmid,String ppgh) {
		return service.findByPageBean(currentPage, pageSize,embmid,ppgh);
	}
	
	@RequestMapping("/findByBm")
	@ResponseBody
	public Employee findByBm(Integer embmid) {
		return service.findByBm(embmid);
	}
	
	@RequestMapping("/update")
	@ResponseBody
	public String update(@RequestBody Employee worker) {
		if(service.update(worker)>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(Employee worker) {
		if(service.create(worker)>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@RequestMapping("/loadbybmselect")
	@ResponseBody
	public Department loadbybmselect(Integer bmid) {
		return service.loadbybmselect(bmid);
	}
	
	@RequestMapping("/createbm")
	@ResponseBody
	public String createbm(Department de) {
		de.setParentid(de.getDepartmentid());
		de.setDepartmentid(0);
		if(service.createbm(de)>0) {
			return "0000";
		}else {
			return "0001";
		}
	}
	
	@RequestMapping("/removebm")
	@ResponseBody
	public String removebm(Integer removeid) {
		return service.removebm(removeid);
	}
	
}
