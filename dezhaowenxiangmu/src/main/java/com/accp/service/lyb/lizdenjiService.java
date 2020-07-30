package com.accp.service.lyb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DepartmentMapper;
import com.accp.dao.DimissionMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.domain.Department;
import com.accp.domain.Dimission;
import com.accp.domain.DimissionExample;
import com.accp.domain.Employee;
import com.accp.domain.EmployeeExample;

@Service
@Transactional
public class lizdenjiService {
     @Autowired
     private DimissionMapper dimiMapper;          //离职表
     
     @Autowired
     private DepartmentMapper department;         //部门表
     
     @Autowired
     private EmployeeMapper employmapper;         //员工表
     
     public List<Dimission> find(){
    	 return dimiMapper.selectByExample(null);
     }
     public int remove(Integer dimsid) {
    	 return dimiMapper.deleteByPrimaryKey(dimsid);
     }
     
     public List<Department> findAll(){
    	List<Department> list=department.findAll();
    	return list;
     }
     public int insert(Dimission depar) {
    	 return dimiMapper.insert(depar);
     }
     public int update(Employee employ) {
    	 return employmapper.updateByPrimaryKey(employ);
     }
     public int removeEid(String eid) {
    	 return employmapper.deleteByPrimaryKey(eid);
     }
     public Employee findEid(String eid) {
    	 return employmapper.selectByPrimaryKey(eid);
     }
}
