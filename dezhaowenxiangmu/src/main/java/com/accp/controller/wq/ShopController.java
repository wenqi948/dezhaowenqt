package com.accp.controller.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Shop;
import com.accp.domain.Store;
import com.accp.service.wq.ShopServlet;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/Shopservlet")
public class ShopController {
	@Autowired
	ShopServlet servlet;
	
	@RequestMapping("/fanAll")
	@ResponseBody
	public PageInfo<Shop> pagefenyei(String name,Integer pageSize,Integer pageNum) {
		return servlet.pagefenyei(name,pageSize, pageNum);
	}
	
	
	@RequestMapping("/fanmiendian")
	@ResponseBody
	public List<Store> mindainfind() {
		return servlet.mindainfind();
	}
	

}
