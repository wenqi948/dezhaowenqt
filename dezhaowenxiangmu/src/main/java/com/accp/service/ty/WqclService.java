package com.accp.service.ty;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.accp.dao.TeamMapper;
import com.accp.dao.WorkcarsMapper;

import com.accp.domain.Team;
import com.accp.domain.Workcars;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class WqclService {
	@Autowired
	private WorkcarsMapper wmapper;
	
	@Autowired
	private TeamMapper tmapper;
	
	public PageInfo<Workcars> findByPageBean(Integer currentPage,Integer pageSize){
		Page<Workcars> page=PageHelper.startPage(currentPage,pageSize);
		List<Workcars> list=wmapper.selectByExample(null);
		for (Workcars yg : list) {
			Team de=tmapper.selectByPrimaryKey(yg.getTeamid());
			yg.setTeamname(de.getTeamname());
		}
		return page.toPageInfo();
	}
	
	public List<Team> findByTree(Integer fteamid){
		return tmapper.find(fteamid);
	}
	public Team findByBz(Integer teamid) {
		return tmapper.selectByPrimaryKey(teamid);
	}
	public int insert(Workcars wk) {
		return wmapper.insert(wk);
	}
	public int update(Workcars wk) {
		return wmapper.updateByPrimaryKey(wk);
	}
}
