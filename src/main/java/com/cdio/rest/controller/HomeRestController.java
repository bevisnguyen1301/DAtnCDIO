package com.cdio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdio.dao.OrderDao;
import com.cdio.dao.ReportProductbyDayDao;
import com.cdio.entity.Order;
import com.cdio.entity.ReportProductbyDay;

@CrossOrigin("*")
@RestController
public class HomeRestController {
	
	@Autowired
	OrderDao odao;
	@Autowired
	ReportProductbyDayDao pReportProductbyDayDao;
	
	
	
	
	@GetMapping("/rest/ordertop10")
	public List<Order> getAll(){
		return odao.getTop10();
	}
	@GetMapping("/rest/producttop10")
	public List<ReportProductbyDay> getStatus(){
		return  pReportProductbyDayDao.reportProdctTop10();
	}
}
