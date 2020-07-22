package com.accp.controller.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Cartypes;
import com.accp.service.fcy.cartypesService;

@RestController
@RequestMapping("/pp")
public class cartypesController {
	
	@Autowired
	cartypesService cartypesservice;
	
//	添加车辆品牌
	@PostMapping
	@ResponseBody
	public int insert(@RequestBody Cartypes cartypes) {
		int flag=cartypesservice.insert(cartypes);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	删除
	@GetMapping("/delete/{ctsid}")
	@ResponseBody
	public int remove(@PathVariable("ctsid") Integer ctsid) {
		int flag=cartypesservice.remove(ctsid);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	查询所有
	@GetMapping
	@ResponseBody
	public List<Cartypes> selectAll(){
		return cartypesservice.selectAll();
	}
	
	
//	车辆品牌模糊查询
	@GetMapping("/name/{cartypes}")
	@ResponseBody
	public List<Cartypes> selectOne(@PathVariable("cartypes") String cartypes) {
		return cartypesservice.selectOne(cartypes);
	}
	
	
//	车辆品牌id查询
	@GetMapping("/id/{ctsid}")
	@ResponseBody
	public Cartypes selectId(@PathVariable("ctsid") Integer ctsid) {
		return cartypesservice.selectId(ctsid);
	}
	
}
