package com.accp.controller.fcy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Engine;
import com.accp.service.fcy.engineService;

@RestController
@RequestMapping("/fdjpp")
public class engineController {

	@Autowired
	engineService engineservice;
	
	
//	添加
	@PostMapping
	@ResponseBody
	public int insert(@RequestBody Engine engine) {
		int flag=engineservice.insert(engine);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	删除
	@GetMapping("/delete/{engineid}")
	@ResponseBody
	public int delete(@PathVariable("engineid") Integer engineid) {
		int flag=engineservice.delete(engineid);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	修改
	@PostMapping("/update")
	@ResponseBody
	public int update(@RequestBody Engine engine) {
		int flag=engineservice.update(engine);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	查询所有
	@GetMapping
	@ResponseBody
	public List<Engine> selectAll() {
		return engineservice.selectAll();
	}
	
	
//	发动机品牌名称模糊查询
	@GetMapping("/name/{enginename}")
	@ResponseBody
	public List<Engine> selectOne(@PathVariable("enginename") String enginename) {
		return engineservice.selectOne(enginename);
	}
	
	
//	发动机品牌id查询
	@GetMapping("/id/{engineid}")
	@ResponseBody
	public Engine selectId(@PathVariable("engineid") Integer engineid) {
		return engineservice.selectId(engineid);
	}
}
