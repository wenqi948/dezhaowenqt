package com.accp.domain;

public class Team {
    private Integer teamid;

    private String teamname;

    private Integer fteamid;

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