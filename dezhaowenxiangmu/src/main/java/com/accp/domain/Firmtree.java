package com.accp.domain;

public class Firmtree {
    private Integer citytreeid;

    private String cityname;

    private Integer parentid;

    private Integer biaoshiid;

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

    public Integer getBiaoshiid() {
        return biaoshiid;
    }

    public void setBiaoshiid(Integer biaoshiid) {
        this.biaoshiid = biaoshiid;
    }
}