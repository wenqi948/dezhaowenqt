package com.accp.domain;

public class Department {
    private Integer departmentid;

    private String depnames;

    private Integer parentid;

    private Integer code;

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepnames() {
        return depnames;
    }

    public void setDepnames(String depnames) {
        this.depnames = depnames;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}