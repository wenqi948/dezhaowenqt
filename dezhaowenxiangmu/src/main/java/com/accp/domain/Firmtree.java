package com.accp.domain;

public class Firmtree {
    private Integer citytreeid;

    private String cityname;

    private Integer parentid;

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