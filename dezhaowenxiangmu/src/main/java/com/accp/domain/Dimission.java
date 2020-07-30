package com.accp.domain;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Dimission {
    private Integer dimissionid;

    private String employeeid;

    private Integer departmentid;
    
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dimtimes;

    private String dimreasona;
    
    private Employee employee;
    
    private Department department;
    
    

    public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

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