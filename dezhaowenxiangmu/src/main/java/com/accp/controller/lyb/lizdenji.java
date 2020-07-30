package com.accp.controller.lyb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Department;
import com.accp.domain.Dimission;
import com.accp.domain.Employee;
import com.accp.domain.Position;
import com.accp.service.lyb.lizdenjiService;
import com.accp.service.lyb.starService;

@Controller
@RequestMapping("dimi")
public class lizdenji {
    @Autowired
    lizdenjiService service;
  
    @RequestMapping("/find")
    @ResponseBody
    public List<Dimission> find(){
    	return service.find();
    }
    @RequestMapping("/remove/{did}")
    @ResponseBody
    public String remove(@PathVariable("did") Integer did) {
        int num=service.remove(did);
        if (num>0) {
			return "00000";
		}
        return "11111";
    }
    @RequestMapping("/findAll")
    @ResponseBody
    public List<Department> findAll(){
    	return service.findAll();
    }
    @RequestMapping("/insert")
    @ResponseBody
    public String insert(@RequestBody Dimission depar) {
    	int num=service.insert(depar);
    	if (num>0) {
			return "00000";
		}
    	return "11111";
    }
    @RequestMapping("/update")
    @ResponseBody
    public String update(@RequestBody Employee employ) {
    	int nsm=service.update(employ);
    	if (nsm>0) {
			return "22222";
		}
    	return "11111";
    }
    @RequestMapping("/removeEid/{eid}")
    @ResponseBody
    public String removeEid(@PathVariable("eid") String eid) {
    	int num=service.removeEid(eid);
        if (num>0) {
			return "00000";
		}
        return "22222";
    }
    @RequestMapping("/findEid/{eid}")
    @ResponseBody
    public Employee findEid(@PathVariable("eid") String eid) {
    	Employee sum=service.findEid(eid);
    	return sum;
    }
    @RequestMapping("/exportExcel")
    public ResponseEntity<byte []> exportExcel(){
    	try {
			List<Dimission> list=service.find();
			//创建excel
			XSSFWorkbook xss=new XSSFWorkbook();
			//创建seet页
			Sheet sheet= xss.createSheet();
			Row titleRow=sheet.createRow(0);
			Cell dname=titleRow.createCell(0);
			dname.setCellValue("部门名称");
			Cell eId=titleRow.createCell(1);
			eId.setCellValue("员工编号");
			Cell esex=titleRow.createCell(2);
			esex.setCellValue("性别");
			Cell zw=titleRow.createCell(3);
			zw.setCellValue("职位");
			Cell lizrq=titleRow.createCell(4);
			lizrq.setCellValue("离职日期");
			Cell lizyy=titleRow.createCell(5);
			lizyy.setCellValue("离职原因");
			
			for (int i = 0; i < list.size(); i++) {
				Row row=sheet.createRow(i+1);
				Cell dnae=row.createCell(0);
				dnae.setCellValue(list.get(i).getDepartment().getDepnames());
				Cell Eid=row.createCell(1);
				Eid.setCellValue(list.get(i).getEmployeeid());
				Cell sex=row.createCell(2);
				sex.setCellValue(list.get(i).getEmployee().getEmsex());
				Cell dzw=row.createCell(3);
				dzw.setCellValue(list.get(i).getEmployee().getEmgw());
				Cell lirq=row.createCell(4);
				lirq.setCellValue(list.get(i).getDimtimes());
				Cell liyy=row.createCell(5);
				liyy.setCellValue(list.get(i).getDimreasona());
				
			}
			
			HttpHeaders headers=new HttpHeaders();
			String excelName=new String("离职登记列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			//文件流	
			ByteArrayOutputStream  bao=new ByteArrayOutputStream();
			//将excel写到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes=bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers,HttpStatus.OK);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
}
