package com.accp.domain;

public class Goodstype {
    private Integer gid;

    private String gname;

    private Integer fathertype;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public Integer getFathertype() {
        return fathertype;
    }

    public void setFathertype(Integer fathertype) {
        this.fathertype = fathertype;
    }
}