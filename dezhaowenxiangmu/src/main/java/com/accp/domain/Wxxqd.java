package com.accp.domain;

public class Wxxqd {
    private Integer wxqid;

    private Integer insid;

    private Integer rid;

    private Integer sum;

    private Float couponmoney;

    private Float datepmoney;

    private String jialei;

    private Integer teamid;

    private Repair repair;//维修项目表
    private Team team;//班组表 
    
    public Repair getRepair() {
		return repair;
	}

	public void setRepair(Repair repair) {
		this.repair = repair;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getWxqid() {
        return wxqid;
    }

    public void setWxqid(Integer wxqid) {
        this.wxqid = wxqid;
    }

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }

    public Float getCouponmoney() {
        return couponmoney;
    }

    public void setCouponmoney(Float couponmoney) {
        this.couponmoney = couponmoney;
    }

    public Float getDatepmoney() {
        return datepmoney;
    }

    public void setDatepmoney(Float datepmoney) {
        this.datepmoney = datepmoney;
    }

    public String getJialei() {
        return jialei;
    }

    public void setJialei(String jialei) {
        this.jialei = jialei;
    }

    public Integer getTeamid() {
        return teamid;
    }

    public void setTeamid(Integer teamid) {
        this.teamid = teamid;
    }
}