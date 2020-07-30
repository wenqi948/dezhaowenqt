package com.accp.controller.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Modoule;
import com.accp.service.wq.ModouleService;

@Controller
@RequestMapping("/modoule")
public class ModouleController {
	
	@Autowired
	ModouleService servlet;
	
	@RequestMapping("/find")
	@ResponseBody
	public List<Modoule> find( Integer id) {
		return servlet.find(id);
	}

}
