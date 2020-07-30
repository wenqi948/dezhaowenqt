package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Modoule {
    private Integer mid;

    private String ename;

    private String cname;

    private String path;

    private Integer catalog;

    private Integer parentid;

    private String method;

    private String tubiao;

    private String active;
    
    private List<Modoule> lists=new ArrayList<Modoule>();

    /**
	 * @return the lists
	 */
	public List<Modoule> getLists() {
		return lists;
	}

	/**
	 * @param lists the lists to set
	 */
	public void setLists(List<Modoule> lists) {
		this.lists = lists;
	}

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getCatalog() {
        return catalog;
    }

    public void setCatalog(Integer catalog) {
        this.catalog = catalog;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getTubiao() {
        return tubiao;
    }

    public void setTubiao(String tubiao) {
        this.tubiao = tubiao;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}