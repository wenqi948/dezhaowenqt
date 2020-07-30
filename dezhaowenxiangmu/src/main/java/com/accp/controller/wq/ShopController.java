package com.accp.controller.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Firm;
import com.accp.domain.Goodstype;
import com.accp.domain.Shop;
import com.accp.domain.Store;
import com.accp.domain.Unit;
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
	
	//查询所有商品类型
	@RequestMapping("/findleixin")
	@ResponseBody
	public List<Goodstype> findleixin(){
		return servlet.findleixin();
	}
	
	//查询所有数量单位
	@RequestMapping("/finddanwei")
	@ResponseBody
	public List<Unit> finddanwei() {
		return servlet.finddanwei();
	}
	
	//查询所有厂商编码
	@RequestMapping("/findchangshangbm")
	@ResponseBody
	public List<Firm> findchangshangbm() {
		return servlet.findchangshangbm();
	}
	
	
	//商品新增
	@RequestMapping("/spxinzen")
	@ResponseBody
	public String spxinzen(@RequestBody Shop sho) {
		return servlet.insert(sho);
	}
	
	//商品修改
	@RequestMapping("/spxiugai")
	@ResponseBody
	public String update(@RequestBody Shop sho) {
		return servlet.update(sho);
	}
	
	//商品删除
	@RequestMapping("/spsanchu")
	@ResponseBody
	public String delete(@RequestBody Shop sho) {
		return servlet.delete(sho);
	}
}
