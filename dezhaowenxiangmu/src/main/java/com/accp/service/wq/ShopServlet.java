package com.accp.service.wq;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.FirmMapper;
import com.accp.dao.GoodstypeMapper;
import com.accp.dao.ShopMapper;
import com.accp.dao.StateMapper;
import com.accp.dao.StoreMapper;
import com.accp.dao.UnitMapper;
import com.accp.domain.Firm;
import com.accp.domain.Goodstype;
import com.accp.domain.Shop;
import com.accp.domain.ShopExample;
import com.accp.domain.State;
import com.accp.domain.Store;
import com.accp.domain.Unit;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ShopServlet {
	@Autowired
	ShopMapper mapper;
	
	@Autowired
	FirmMapper mapperbm;//商品编码
	
	@Autowired
	StateMapper mapperzt;//状态表
	
	@Autowired 
	StoreMapper mappermd;//门店表
	
	@Autowired 
	UnitMapper mapperdw;//单位表
	
	@Autowired 
	GoodstypeMapper mapperlx;//商品类型表
	
	
	public List<Shop> findAll(String name) {
		List<Shop> list;
		if(name==null||name=="") {
			list=mapper.selectByExample(null);
		}else {
			ShopExample example=new ShopExample();
			example.createCriteria().andFirmnoEqualTo(name);
			list=mapper.selectByExample(example);
		}
		
		for (Shop s : list) {
			Firm ff=mapperbm.selectByPrimaryKey(s.getFirmno());
			State ss=mapperzt.selectByPrimaryKey(s.getStateid());
			Store st=mappermd.selectByPrimaryKey(s.getStoreid());
			Unit un=mapperdw.selectByPrimaryKey(s.getUnitid());
			Goodstype go=mapperlx.selectByPrimaryKey(s.getGid());
			s.setFi(ff);
			s.setSt(ss);
			s.setSto(st);
			s.setUn(un);
			s.setGo(go);
			
		}
		return list;
	}
	
	//分页
	public PageInfo<Shop> pagefenyei(String name,Integer pageSize,Integer pageNum) {
		Page page=PageHelper.startPage(pageNum, pageSize);
		
		List<Shop> list=findAll(name);
		return page.toPageInfo();
	}
	
	
	//名店查询
	public List<Store> mindainfind() {
		return mappermd.selectByExample(null);
	}
	
	
	
	
	
	
	

}
