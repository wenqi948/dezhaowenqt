package com.accp.controller.ty;

import java.util.List;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;


import org.apache.poi.xssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.domain.Employee;
import com.accp.service.ty.ZjjgService;

@Controller
@RequestMapping("/exportExcel")
public class ExportExcelController {
	@Autowired
	public ZjjgService service;
	
	@RequestMapping("/exportZzjg")
	@ResponseBody
	public ResponseEntity<byte []> exportExcel(Integer embmid,String ppgh){
		try {
			if(ppgh.equals("%")) {
				ppgh="%25";
			}
			List<Employee> list= service.export(embmid, ppgh);
			//创建excel
			XSSFWorkbook xss = new XSSFWorkbook();
			//创建sheet页
			Sheet sheet = xss.createSheet();
			Row titleRow = sheet.createRow(0);
			Cell employeeid = titleRow.createCell(0);
			employeeid.setCellValue("员工编号");
			Cell emname = titleRow.createCell(1);
			emname.setCellValue("员工姓名");
			Cell emsex = titleRow.createCell(2);
			emsex.setCellValue("员工性别");
			Cell emmd = titleRow.createCell(3);
			emmd.setCellValue("员工门店");
			Cell embm=titleRow.createCell(4);
			embm.setCellValue("员工部门");
			Cell emadmin=titleRow.createCell(5);
			emadmin.setCellValue("员工账号");
			Cell emstzk=titleRow.createCell(6);
			emstzk.setCellValue("员工身体状况");
			Cell emgw=titleRow.createCell(7);
			emgw.setCellValue("员工岗位");
			Cell emheight=titleRow.createCell(8);
			emheight.setCellValue("员工身高");
			Cell emjg=titleRow.createCell(9);
			emjg.setCellValue("身高籍贯");
			Cell emmz=titleRow.createCell(10);
			emmz.setCellValue("员工民族");
			Cell emhyzk=titleRow.createCell(11);
			emhyzk.setCellValue("婚姻状况");
			Cell emxl=titleRow.createCell(12);
			emxl.setCellValue("婚姻学历");
			Cell embyyx=titleRow.createCell(13);
			embyyx.setCellValue("毕业院校");
			Cell emzy=titleRow.createCell(14);
			emzy.setCellValue("员工专业");
			Cell emzyzg=titleRow.createCell(15);
			emzyzg.setCellValue("员工专业资格");
			Cell emsx=titleRow.createCell(16);
			emsx.setCellValue("员工属性");
			Cell emxw=titleRow.createCell(17);
			emxw.setCellValue("员工学位");
			Cell embz=titleRow.createCell(18);
			embz.setCellValue("员工编制");
			Cell emsfz=titleRow.createCell(19);
			emsfz.setCellValue("员工身份证号");
			Cell emhkdz=titleRow.createCell(20);
			emhkdz.setCellValue("员工户口地址");
			Cell emxzdz=titleRow.createCell(21);
			emxzdz.setCellValue("现住地址");
			Cell emlxdh=titleRow.createCell(22);
			emlxdh.setCellValue("员工练习电话");
			Cell emsj=titleRow.createCell(23);
			emsj.setCellValue("员工手机");
			Cell ememail=titleRow.createCell(24);
			ememail.setCellValue("员工邮箱");
			Cell emkhyh=titleRow.createCell(25);
			emkhyh.setCellValue("员工银行");
			Cell emyhzh=titleRow.createCell(26);
			emyhzh.setCellValue("员工银行账号");
			Cell emjjlxr=titleRow.createCell(27);
			emjjlxr.setCellValue("员工员工紧急联系人");
			Cell emrzrq=titleRow.createCell(28);
			emrzrq.setCellValue("员工入职日期");
			Cell emsyrq=titleRow.createCell(29);
			emsyrq.setCellValue("员工使用日期");
			Cell emcsrq=titleRow.createCell(30);
			emcsrq.setCellValue("员工出生日期");
			Cell emhtks=titleRow.createCell(31);
			emhtks.setCellValue("员工合同开始");
			Cell emhtjs=titleRow.createCell(32);
			emhtjs.setCellValue("员工合同结束");
			Cell emkzbh=titleRow.createCell(33);
			emkzbh.setCellValue("员工卡自编号");
			Cell emknbh=titleRow.createCell(34);
			emknbh.setCellValue("员工卡内部号");
			Cell emtjr=titleRow.createCell(35);
			emtjr.setCellValue("员工推荐人");
			Cell emzdzkq=titleRow.createCell(36);
			emzdzkq.setCellValue("员工整单折扣权");
			Cell emgszkq=titleRow.createCell(37);
			emgszkq.setCellValue("员工工时折扣权");
			Cell emspzkq=titleRow.createCell(38);
			emspzkq.setCellValue("员工商品折扣权");
			Cell emjmq=titleRow.createCell(39);
			emjmq.setCellValue("员工减免权");
			for(int i=0;i<list.size();i++) {
				Row row = sheet.createRow(i+1);
				Cell employeeid1 = row.createCell(0);
				employeeid1.setCellValue(list.get(i).getEmployeeid());
				Cell emname1 = row.createCell(1);
				emname1.setCellValue(list.get(i).getEmname());
				Cell emsex1 = row.createCell(2);
				emsex1.setCellValue(list.get(i).getEmsex());
				Cell emmd1 = row.createCell(3);
				emmd1.setCellValue(list.get(i).getEmmdname());
				Cell embm1=row.createCell(4);
				embm1.setCellValue(list.get(i).getEmbmname());
				Cell emadmin1=row.createCell(5);
				emadmin1.setCellValue(list.get(i).getEmadmin());
				Cell emstzk1=row.createCell(6);
				emstzk1.setCellValue(list.get(i).getEmstzk());
				Cell emgw1=row.createCell(7);
				emgw1.setCellValue(list.get(i).getEmgw());
				Cell emheight1=row.createCell(8);
				emheight1.setCellValue(list.get(i).getEmheight());
				Cell emjg1=row.createCell(9);
				emjg1.setCellValue(list.get(i).getEmjg());
				Cell emmz1=row.createCell(10);
				emmz1.setCellValue(list.get(i).getEmmz());
				Cell emhyzk1=row.createCell(11);
				emhyzk1.setCellValue(list.get(i).getEmhyzk());
				Cell emxl1=row.createCell(12);
				emxl1.setCellValue(list.get(i).getEmxl());
				Cell embyyx1=row.createCell(13);
				embyyx1.setCellValue(list.get(i).getEmbyyx());
				Cell emzy1=row.createCell(14);
				emzy1.setCellValue(list.get(i).getEmzy());
				Cell emzyzg1=row.createCell(15);
				emzyzg1.setCellValue(list.get(i).getEmzyzg());
				Cell emsx1=row.createCell(16);
				emsx1.setCellValue(list.get(i).getEmsx());
				Cell emxw1=row.createCell(17);
				emxw1.setCellValue(list.get(i).getEmxw());
				Cell embz1=row.createCell(18);
				embz1.setCellValue(list.get(i).getEmbz());
				Cell emsfz1=row.createCell(19);
				emsfz1.setCellValue(list.get(i).getEmsfz());
				Cell emhkdz1=row.createCell(20);
				emhkdz1.setCellValue(list.get(i).getEmhkdz());
				Cell emxzdz1=row.createCell(21);
				emxzdz1.setCellValue(list.get(i).getEmxzdz());
				Cell emlxdh1=row.createCell(22);
				emlxdh1.setCellValue(list.get(i).getEmlxdh());
				Cell emsj1=row.createCell(23);
				emsj1.setCellValue(list.get(i).getEmsj());
				Cell ememail1=row.createCell(24);
				ememail1.setCellValue(list.get(i).getEmemail());
				Cell emkhyh1=row.createCell(25);
				emkhyh1.setCellValue(list.get(i).getEmkhyh());
				Cell emyhzh1=row.createCell(26);
				emyhzh1.setCellValue(list.get(i).getEmyhzh());
				Cell emjjlxr1=row.createCell(27);
				emjjlxr1.setCellValue(list.get(i).getEmjjlxr());
				Cell emrzrq1=row.createCell(28);
				emrzrq1.setCellValue(list.get(i).getEmrzrq());
				Cell emsyrq1=row.createCell(29);
				emsyrq1.setCellValue(list.get(i).getEmsyrq());
				Cell emcsrq1=row.createCell(30);
				emcsrq1.setCellValue(list.get(i).getEmcsrq());
				Cell emhtks1=row.createCell(31);
				emhtks1.setCellValue(list.get(i).getEmhtks());
				Cell emhtjs1=row.createCell(32);
				emhtjs1.setCellValue(list.get(i).getEmhtjs());
				Cell emkzbh1=row.createCell(33);
				emkzbh1.setCellValue(list.get(i).getEmkzbh());
				Cell emknbh1=row.createCell(34);
				emknbh1.setCellValue(list.get(i).getEmknbh());
				Cell emtjr1=row.createCell(35);
				emtjr1.setCellValue(list.get(i).getEmtjr());
				Cell emzdzkq1=row.createCell(36);
				emzdzkq1.setCellValue(list.get(i).getEmzdzkq());
				Cell emgszkq1=row.createCell(37);
				emgszkq1.setCellValue(list.get(i).getEmgszkq());
				Cell emspzkq1=row.createCell(38);
				emspzkq1.setCellValue(list.get(i).getEmspzkq());
				Cell emjmq1=row.createCell(39);
				emjmq1.setCellValue(list.get(i).getEmjmq());
			}
			
			HttpHeaders headers = new HttpHeaders();
			String excelName = new String("组织机构数据列表.xlsx".getBytes("utf-8"),"iso-8859-1");
			headers.setContentDispositionFormData("attachment", excelName);
			headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
			
			//文件流
			ByteArrayOutputStream bao = new ByteArrayOutputStream();
			//将excel写入到文件流中
			xss.write(bao);
			//将文件流转换成字节
			byte [] bytes = bao.toByteArray();
			return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
