package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Firmtree {
    private Integer citytreeid;

    private String cityname;

    private Integer parentid;
    
    private List<Firmtree> children=new ArrayList<Firmtree>();

    public List<Firmtree> getChildren() {
		return children;
	}

	public void setChildren(List<Firmtree> children) {
		this.children = children;
	}

	public Integer getCitytreeid() {
        return citytreeid;
    }

    public void setCitytreeid(Integer citytreeid) {
        this.citytreeid = citytreeid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }
}