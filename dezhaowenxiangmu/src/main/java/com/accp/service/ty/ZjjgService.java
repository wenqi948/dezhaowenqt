package com.accp.service.ty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.DepartmentMapper;
import com.accp.dao.EmployeeMapper;
import com.accp.domain.Department;
import com.accp.domain.DepartmentExample;
import com.accp.domain.Employee;
import com.accp.domain.EmployeeExample;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class ZjjgService {
	@Autowired
	private DepartmentMapper mapper;
	
	@Autowired
	private EmployeeMapper emapper;
	
	public List<Department> find(Integer parentid){
		List<Department> list=mapper.find(parentid);
		for (Department de : list) {
			String name=de.getCode()+"-"+de.getDepnames();
			de.setDepnames(name);
			for (Department department : de.getChildren()) {
				String name1=department.getCode()+"-"+department.getDepnames();
				department.setDepnames(name1);
				for (Department de1 : department.getChildren()) {
					String name2=de1.getCode()+"-"+de1.getDepnames();
					de1.setDepnames(name2);
				}
			}
		}
		return list;
	}
	
	public List<Employee> export(Integer embmid,String ppgh){
		List<Employee> list=new ArrayList<Employee>();
		if(embmid==1||embmid==0) {
			if(ppgh.equals("%25")) {
				list=emapper.selectByExample(null);
			}else {
				list=emapper.iffrom(ppgh, embmid);
			}
		}else if(embmid!=1&&embmid!=0) {
			if(ppgh.equals("%25")) {
				ppgh=null;
			}
			list=emapper.iffrom(ppgh, embmid);
		}
		for (Employee yg : list) {
			Department de=mapper.selectByPrimaryKey(yg.getEmbm());
			yg.setEmbmname(de.getDepnames());
			Department de1=mapper.selectByPrimaryKey(yg.getEmmd());
			yg.setEmmdname(de1.getDepnames());
		}
		return list;
	}
	
	public PageInfo<Employee> findByPageBean(Integer currentPage,Integer pageSize,Integer embmid,String ppgh){
		Page<Employee> page=PageHelper.startPage(currentPage,pageSize);
		EmployeeExample example=new EmployeeExample();
		List<Employee> list=new ArrayList<Employee>();
		
		if(embmid==1||embmid==0) {
			if(ppgh.equals("%25")) {
				list=emapper.selectByExample(null);
			}else {
				list=emapper.iffrom(ppgh, embmid);
			}
		}else if(embmid!=1&&embmid!=0) {
			if(ppgh.equals("%25")) {
				ppgh=null;
			}
			list=emapper.iffrom(ppgh, embmid);
		}
		for (Employee yg : list) {
			Department de=mapper.selectByPrimaryKey(yg.getEmbm());
			yg.setEmbmname(de.getDepnames());
			Department de1=mapper.selectByPrimaryKey(yg.getEmmd());
			yg.setEmmdname(de1.getDepnames());
		}
		return page.toPageInfo();
	}
	
	public Employee findByBm(Integer bmid) {
		List<Employee> list=emapper.selectByExample(null);
		Employee em1=list.get(list.size()-1);
		String embh=em1.getEmployeeid();
		int dd=Integer.parseInt(embh.substring(3,embh.length()));
		if(dd<10) {
			embh="OEM"+"000"+(dd+1);
		}
		else if(dd<100) {
			embh="OEM"+"00"+(dd+1);
		}
		else {
			embh="OEM"+"0"+(dd+1);
		}
		Employee em=new Employee();
		Department de=mapper.selectByPrimaryKey(bmid);
		Department de1=mapper.selectByPrimaryKey(1);
		em.setEmbmname(de.getDepnames());
		em.setEmbm(de.getCode());
		em.setEmmd(de1.getCode());
		em.setEmmdname(de1.getDepnames());
		em.setEmployeeid(embh);
		return em;
	}
	
	public int create(Employee em) {
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andCodeEqualTo(em.getEmbm());
		Department de=mapper.selectByExample(example).get(0);
		
		DepartmentExample example1=new DepartmentExample();
		example1.createCriteria().andCodeEqualTo(em.getEmmd());
		Department de1=mapper.selectByExample(example1).get(0);
		
		
		Employee em1=new Employee();
		em1=em;
		em1.setEmbm(de.getDepartmentid());
		em1.setEmmd(de1.getDepartmentid());
		return emapper.insert(em1);
	}
	
	
	public int update(Employee em) {
		EmployeeExample example=new EmployeeExample();
		example.createCriteria().andEmployeeidEqualTo(em.getEmployeeid());
		return emapper.updateByExample(em, example);
	}
	
	public Department loadbybmselect(Integer bmid) {
		Department de=mapper.selectByPrimaryKey(bmid);
		
		
		DepartmentExample example=new DepartmentExample();
		example.createCriteria().andParentidEqualTo(bmid);
		List<Department> list=mapper.selectByExample(example);
		if(list.size()==0) {
			String id=de.getCode().toString()+"01";
			de.setCode(Integer.parseInt(id));
		}
		else {
			de.setCode(list.get(list.size()-1).getCode()+1);
		}
		
		
		return de;
	}
	
	public int createbm(Department de) {
		return mapper.insert(de);
	}
	
	public String  removebm(Integer removeid) {
		EmployeeExample example=new EmployeeExample();
		example.createCriteria().andEmbmEqualTo(removeid);
		List<Employee> list=emapper.selectByExample(example);
		if(list.size()==0) {
			mapper.deleteByPrimaryKey(removeid);
			return "0000";
		}else {
			return "0001";
		}
	}
}
