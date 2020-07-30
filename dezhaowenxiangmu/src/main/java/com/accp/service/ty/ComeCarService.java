package com.accp.service.ty;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.CartypesMapper;
import com.accp.dao.ClientMapper;
import com.accp.dao.ClientcarMapper;
import com.accp.dao.CompletedMapper;
import com.accp.dao.DanjutypeMapper;
import com.accp.dao.DepartmentMapper;
import com.accp.dao.DjtypeMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.dao.InstationMapper;
import com.accp.dao.RepairMapper;
import com.accp.dao.TeamMapper;
import com.accp.dao.WxxqdMapper;
import com.accp.domain.Artisan;
import com.accp.domain.Cartypes;
import com.accp.domain.Client;
import com.accp.domain.Clientcar;
import com.accp.domain.Completed;
import com.accp.domain.CompletedExample;
import com.accp.domain.Danjutype;
import com.accp.domain.Department;
import com.accp.domain.Djtype;
import com.accp.domain.Employee;
import com.accp.domain.Instation;
import com.accp.domain.InstationExample;
import com.accp.domain.Repair;
import com.accp.domain.Team;
import com.accp.domain.Wxxqd;
import com.accp.domain.WxxqdExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ComeCarService {
	@Autowired
	InstationMapper im;
	@Autowired
	DjtypeMapper dm;
	@Autowired
	DanjutypeMapper djm;
	@Autowired
	ClientcarMapper cm; 
	@Autowired
	ClientMapper ctm;
	@Autowired
	CartypesMapper ctsm;
	@Autowired
	WxxqdMapper wm;
	@Autowired
	TeamMapper tm;
	@Autowired
	RepairMapper rm;
	@Autowired
	EmployeeMapper em;
	@Autowired
	DepartmentMapper dam;
	@Autowired
	CompletedMapper com;
	public PageInfo<Instation> findPage(Integer pageNum,Integer pageSize){
		Page<Instation> page = PageHelper.startPage(pageNum, pageSize);
		List<Instation> list= im.selectByExample(null);
		for (Instation i : list) {
			Djtype d = dm.selectByPrimaryKey(i.getWxstateid());
			Cartypes ct =ctsm.selectByPrimaryKey(i.getCtsid());
			Danjutype dj = djm.selectByPrimaryKey(i.getDjid());
			Clientcar cc = cm.selectByPrimaryKey(i.getInstation());
			Client c = ctm.selectByPrimaryKey(cc.getYuliu());
			i.setDanjutype(dj);
			i.setCartypes(ct);
			i.setDjtype(d);
			i.setClientcar(cc);
			cc.setClient(c);
		}
		return page.toPageInfo();
	}
	public List<Cartypes> findCarType(){
		return ctsm.selectByExample(null);
	}
	public Instation findbycar(Integer wxdh){
		
		Instation in=im.selectByPrimaryKey(wxdh);
		Clientcar cc = cm.selectByPrimaryKey(in.getInstation());
		Client c=ctm.selectByPrimaryKey(cc.getYuliu());
		cc.setClient(c);
		Cartypes ca=ctsm.selectByPrimaryKey(in.getCtsid());
		WxxqdExample example=new WxxqdExample();
		example.createCriteria().andInsidEqualTo(in.getInsid());
		List<Wxxqd> list=wm.selectByExample(example);
		for (Wxxqd wxxqd : list) {
			Repair re=rm.selectByPrimaryKey(wxxqd.getRid());
			Team te=tm.selectByPrimaryKey(wxxqd.getTeamid());
			wxxqd.setRepair(re);
			wxxqd.setTeam(te);
		}
		in.setClientcar(cc);
		in.setCartypes(ca);
		in.setWxxqd(list);
		return in;
	}
	
	public List<Employee> findbyyg(){
		List<Employee> list=em.selectByExample(null);
		for (Employee em : list) {
			Department de=dam.selectByPrimaryKey(em.getEmbm());
			em.setEmbmname(de.getDepnames());
		}
		return list;
	}
	public int insert(Completed c) {
		if(c.getIshg().equals("合格")) {
			Instation in=im.selectByPrimaryKey(c.getDanhao());
			in.setYewutype("已竣工车");
			im.updateByPrimaryKey(in);
		}
		else {
			Instation in=im.selectByPrimaryKey(c.getDanhao());
			in.setYewutype("待竣工车");
			im.updateByPrimaryKey(in);
		}
		com.insert(c);
		return 0;
	}
	
	public int findbynum(Integer dh) {
		CompletedExample example=new CompletedExample();
		example.createCriteria().andDanhaoEqualTo(dh);
		int count=com.countByExample(example);
		return count;
	}
	
	public int hg(Integer dh) {
		Instation in=im.selectByPrimaryKey(dh);
		in.setYewutype("待竣工车");
		return im.updateByPrimaryKey(in);
	}
}
