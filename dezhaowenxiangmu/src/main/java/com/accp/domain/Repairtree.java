package com.accp.domain;

public class Repairtree {
    private Integer xtype;

    private String xtypename;

    private Integer parentiid;

    private Integer biaoshiid;

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

    public Integer getBiaoshiid() {
        return biaoshiid;
    }

    public void setBiaoshiid(Integer biaoshiid) {
        this.biaoshiid = biaoshiid;
    }
}