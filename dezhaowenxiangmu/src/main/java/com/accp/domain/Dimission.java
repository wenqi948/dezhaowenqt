package com.accp.domain;

import java.util.Date;

public class Dimission {
    private Integer dimissionid;

    private String employeeid;

    private Integer departmentid;

    private Date dimtimes;

    private String dimreasona;

    public Integer getDimissionid() {
        return dimissionid;
    }

    public void setDimissionid(Integer dimissionid) {
        this.dimissionid = dimissionid;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Date getDimtimes() {
        return dimtimes;
    }

    public void setDimtimes(Date dimtimes) {
        this.dimtimes = dimtimes;
    }

    public String getDimreasona() {
        return dimreasona;
    }

    public void setDimreasona(String dimreasona) {
        this.dimreasona = dimreasona;
    }
}