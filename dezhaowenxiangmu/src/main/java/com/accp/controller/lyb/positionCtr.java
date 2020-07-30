package com.accp.controller.lyb;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Header;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.domain.Position;
import com.accp.service.lyb.positionService;
import com.github.pagehelper.PageInfo;


@RestController
@RequestMapping("/position")
public class positionCtr {
    @Autowired
    positionService service;
    
    @GetMapping("/{pageNum}/{pageSize}")
    public PageInfo<Position> findbypage(@PathVariable("pageNum") Integer pageNum,@PathVariable("pageSize") Integer pageSize){
    	return service.findbyapage(pageNum, pageSize);
    }
    @GetMapping("/find")
    public List<Position> findw(){
    	return service.find();
    }
    
    @PostMapping
    public String create(@RequestBody Position pos) {
       int num=service.create(pos);
       if (num>0) {
    	   return "00000";
	   }
       return "11111";
    }
    @RequestMapping("update")
    @ResponseBody
    public String update(@RequestBody Position pon) {
    	int vsnm=service.update(pon);
    	if (vsnm>0) {
			return "11111";
		}
    	return "00000";
    }
    @GetMapping("/del/{pid}")
    public String remove(@PathVariable("pid") Integer pid) {
    	int sum=service.remove(pid);
    	if (sum>0) {
			return "00000";
		}
			
    	return "11111";
    }
    @RequestMapping("/exportExcel")
    public ResponseEntity<byte []> exportExcel(){
    	try {
			List<Position> list=service.find();
			//创建excel
			XSSFWorkbook xss=new XSSFWorkbook();
			//创建seet页
			Sheet sheet= xss.createSheet();
			Row titleRow=sheet.createRow(0);
			Cell cellId=titleRow.createCell(0);
			cellId.setCellValue("岗位编号");
			Cell sellId=titleRow.createCell(1);
			sellId.setCellValue("部门编号");
			Cell cellname=titleRow.createCell(2);
			cellname.setCellValue("岗位名称");
			
			for (int i = 0; i < list.size(); i++) {
				Row row=sheet.createRow(i+1);
				Cell Id=row.createCell(0);
				Id.setCellValue(list.get(i).getPositioned());
				Cell sId=row.createCell(1);
				sId.setCellValue(list.get(i).getDepartmentid());
				Cell name=row.createCell(2);
				name.setCellValue(list.get(i).getPositionname());
			}
			
			HttpHeaders headers=new HttpHeaders();
			String excelName=new String("岗位定义列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			
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
