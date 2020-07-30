package com.accp.controller.lyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Stars;
import com.accp.service.lyb.starService;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/stars")
public class starsCtr {
	@Autowired 
	starService staService;

	@GetMapping("/{pageNum}/{pageSize}")
	public PageInfo<Stars> findbypage(@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize")Integer pageSize){
		return staService.findBypage(pageNum, pageSize);
	}
	@PostMapping
	public String create(@RequestBody Stars sta) {
		int sum=staService.create(sta);
		if (sum>0) {
			return "11111";
		}
		return "00000";
	}
	@GetMapping("/del/{sid}")
	public String remove(@PathVariable("sid") Integer sid ) {
		int sum=staService.remove(sid);
		if (sum>0) {
			return "11111";
		}
		return "00000";
	}
	 @RequestMapping("update")
	 @ResponseBody
	public String update(@RequestBody Stars stas) {
		int mmm=staService.update(stas);
		if (mmm>0) {
			return "11111";
		}
		return "00000";
	}
}
