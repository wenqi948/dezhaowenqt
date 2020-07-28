package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Repairtree {
    private Integer xtype;

    private String xtypename;

    private Integer parentiid;
    
    private List<Repairtree> children=new ArrayList<Repairtree>();

    public List<Repairtree> getChildren() {
		return children;
	}

	public void setChildren(List<Repairtree> children) {
		this.children = children;
	}

	public Integer getXtype() {
        return xtype;
    }

    public void setXtype(Integer xtype) {
        this.xtype = xtype;
    }

    public String getXtypename() {
        return xtypename;
    }

    public void setXtypename(String xtypename) {
        this.xtypename = xtypename;
    }

    public Integer getParentiid() {
        return parentiid;
    }

    public void setParentiid(Integer parentiid) {
        this.parentiid = parentiid;
    }
}