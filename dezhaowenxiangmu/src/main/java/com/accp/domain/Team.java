package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Integer teamid;

    private String teamname;

    private Integer fteamid;

    
    private List<Team> children =new ArrayList<Team>();
    public List<Team> getChildren() {
		return children;
	}

	public void setChildren(List<Team> children) {
		this.children = children;
	}
    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }

    public String getTeamname() {
        return teamname;
    }

    public void setTeamname(String teamname) {
        this.teamname = teamname;
    }

    public Integer getFteamid() {
        return fteamid;
    }

    public void setFteamid(Integer fteamid) {
        this.fteamid = fteamid;
    }
}