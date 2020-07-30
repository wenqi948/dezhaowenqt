package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private Integer departmentid;

    private String depnames;

    private Integer parentid;

    private Integer code;

    
    private List<Department> children=new ArrayList<Department>();
    
    public List<Department> getChildren() {
		return children;
	}

	public void setChildren(List<Department> children) {
		this.children = children;
	}
    
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