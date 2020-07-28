package com.accp.domain;

public class Usertable {
    private Integer id;

    private String usname;

    private String uspwd;

    private Integer rid;

    private String storeid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsname() {
        return usname;
    }

    public void setUsname(String usname) {
        this.usname = usname;
    }

    public String getUspwd() {
        return uspwd;
    }

    public void setUspwd(String uspwd) {
        this.uspwd = uspwd;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getStoreid() {
        return storeid;
    }

    public void setStoreid(String storeid) {
        this.storeid = storeid;
    }
}