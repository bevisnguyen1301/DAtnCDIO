package com.cdio.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdio.dao.ReportDao;
import com.cdio.entity.Product;
import com.cdio.entity.Report;
import com.cdio.service.ProductService;

@CrossOrigin("*")
@RestController

public class ReportRestController {
	@Autowired
	ReportDao reportDao;
	
	@GetMapping("/rest/report")
	public List<Report>  getAll() {
		return reportDao.revenueByMonth();
	}
	@GetMapping("/rest/reportWeek")
	public List<Report>  getAll1() {
		return reportDao.revenueByWeek();
	}
}
