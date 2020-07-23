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
import com.accp.domain.Modeltype;
import com.accp.service.fcy.modeltypeService;

@RestController
@RequestMapping("/cx")
public class modeltypeController {

	@Autowired
	modeltypeService modeltypeservice;
	
//	添加车辆品牌
	@PostMapping
	@ResponseBody
	public int insert(@RequestBody Modeltype modeltype) {
		int flag=modeltypeservice.insert(modeltype);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	删除
	@GetMapping("/delete/{cartypeid}")
	@ResponseBody
	public int remove(@PathVariable("cartypeid") String cartypeid) {
		int flag=modeltypeservice.remove(cartypeid);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	修改
	@PostMapping("/update")
	@ResponseBody
	public int update(@RequestBody Modeltype modeltype) {
		int flag=modeltypeservice.update(modeltype);
		if(flag>0) {
			return 111;
		}
		return 000;
	}
	
	
//	查询所有
	@GetMapping
	@ResponseBody
	public List<Modeltype> selectAll(){
		return modeltypeservice.selectAll();
	}
	
	
//	选择查询右边
	@GetMapping("/cartypes/{ctsid}")
	@ResponseBody
	public List<Modeltype> selectcartypes(@PathVariable("ctsid") Integer ctsid){
		return modeltypeservice.selectcartypes(ctsid);
	}
	
	
//	车辆车型模糊查询
	@GetMapping("/name/{modeltype}")
	@ResponseBody
	public List<Modeltype> selectOne(@PathVariable("modeltype") String modeltype) {
		return modeltypeservice.selectOne(modeltype);
	}
	
	
//	车辆车型id查询
	@GetMapping("/id/{cartypeid}")
	@ResponseBody
	public Modeltype selectId(@PathVariable("cartypeid") String cartypeid) {
		return modeltypeservice.selectId(cartypeid);
	}
}
