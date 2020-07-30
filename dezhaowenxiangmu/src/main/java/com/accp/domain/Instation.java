package com.accp.domain;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Instation {
    private Integer insid;

    private Integer wxstateid;

    private String artisanid;
    
    private List<Wxxqd> wxxqd;//维修单详情
    public List<Wxxqd> getWxxqd() {
		return wxxqd;
	}

	public void setWxxqd(List<Wxxqd> wxxqd) {
		this.wxxqd = wxxqd;
	}

	private Djtype djtype;//
	private Danjutype danjutype;//单据类型
	private Clientcar clientcar;//客户车辆表
	private Cartypes cartypes;//业务类型
    
    public Djtype getDjtype() {
		return djtype;
	}

	public void setDjtype(Djtype djtype) {
		this.djtype = djtype;
	}

	public Danjutype getDanjutype() {
		return danjutype;
	}

	public void setDanjutype(Danjutype danjutype) {
		this.danjutype = danjutype;
	}

	public Clientcar getClientcar() {
		return clientcar;
	}

	public void setClientcar(Clientcar clientcar) {
		this.clientcar = clientcar;
	}

	public Cartypes getCartypes() {
		return cartypes;
	}

	public void setCartypes(Cartypes cartypes) {
		this.cartypes = cartypes;
	}

	private Integer ctsid;

    private String instation;

    private String jsyuan;
    
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date joininstimes;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date predictcompletetime; 

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date predicttime;

    private Float budgetmoney;

    private String insevent;

    private Boolean iszn;

    private Boolean ifjs;

    private String qcxinhao;

    private String chezhuname;

    private String yewutype;

    private String jiesuantype;

    private String shigonclass;

    private String toptime;

    private String jiecheren;

    private Integer djid;

    public Integer getInsid() {
        return insid;
    }

    public void setInsid(Integer insid) {
        this.insid = insid;
    }

    public Integer getWxstateid() {
        return wxstateid;
    }

    public void setWxstateid(Integer wxstateid) {
        this.wxstateid = wxstateid;
    }

    public String getArtisanid() {
        return artisanid;
    }

    public void setArtisanid(String artisanid) {
        this.artisanid = artisanid;
    }

    public Integer getCtsid() {
        return ctsid;
    }

    public void setCtsid(Integer ctsid) {
        this.ctsid = ctsid;
    }

    public String getInstation() {
        return instation;
    }

    public void setInstation(String instation) {
        this.instation = instation;
    }

    public String getJsyuan() {
        return jsyuan;
    }

    public void setJsyuan(String jsyuan) {
        this.jsyuan = jsyuan;
    }

    public Date getJoininstimes() {
        return joininstimes;
    }

    public void setJoininstimes(Date joininstimes) {
        this.joininstimes = joininstimes;
    }

    public Date getPredictcompletetime() {
        return predictcompletetime;
    }

    public void setPredictcompletetime(Date predictcompletetime) {
        this.predictcompletetime = predictcompletetime;
    }

    public Date getPredicttime() {
        return predicttime;
    }

    public void setPredicttime(Date predicttime) {
        this.predicttime = predicttime;
    }

    public Float getBudgetmoney() {
        return budgetmoney;
    }

    public void setBudgetmoney(Float budgetmoney) {
        this.budgetmoney = budgetmoney;
    }

    public String getInsevent() {
        return insevent;
    }

    public void setInsevent(String insevent) {
        this.insevent = insevent;
    }

    public Boolean getIszn() {
        return iszn;
    }

    public void setIszn(Boolean iszn) {
        this.iszn = iszn;
    }

    public Boolean getIfjs() {
        return ifjs;
    }

    public void setIfjs(Boolean ifjs) {
        this.ifjs = ifjs;
    }

    public String getQcxinhao() {
        return qcxinhao;
    }

    public void setQcxinhao(String qcxinhao) {
        this.qcxinhao = qcxinhao;
    }

    public String getChezhuname() {
        return chezhuname;
    }

    public void setChezhuname(String chezhuname) {
        this.chezhuname = chezhuname;
    }

    public String getYewutype() {
        return yewutype;
    }

    public void setYewutype(String yewutype) {
        this.yewutype = yewutype;
    }

    public String getJiesuantype() {
        return jiesuantype;
    }

    public void setJiesuantype(String jiesuantype) {
        this.jiesuantype = jiesuantype;
    }

    public String getShigonclass() {
        return shigonclass;
    }

    public void setShigonclass(String shigonclass) {
        this.shigonclass = shigonclass;
    }

    public String getToptime() {
        return toptime;
    }

    public void setToptime(String toptime) {
        this.toptime = toptime;
    }

    public String getJiecheren() {
        return jiecheren;
    }

    public void setJiecheren(String jiecheren) {
        this.jiecheren = jiecheren;
    }

    public Integer getDjid() {
        return djid;
    }

    public void setDjid(Integer djid) {
        this.djid = djid;
    }
}