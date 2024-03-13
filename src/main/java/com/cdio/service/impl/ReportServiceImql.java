package com.cdio.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cdio.dao.ProductDao;
import com.cdio.dao.ReportProductbyDayDao;
import com.cdio.entity.ReportCategory;
import com.cdio.entity.ReportProductbyDay;
import com.cdio.entity.ReportTrademark;
import com.cdio.service.ProductService;
import com.cdio.service.ReportService;

@Service
public class ReportServiceImql implements ReportService {
	
	@Autowired
	ReportService reportdao;
	
	@Autowired
	ProductDao productDao;
	
	@Autowired
	ReportProductbyDayDao reportproductbydaydao;
	
	@Override
	public List<ReportCategory> getReportCategory() {
		return productDao.getReportCategory();
	}

	@Override
	public List<ReportProductbyDay> getReportProductbyDaynoMinMax() {
		// TODO Auto-generated method stub
		return reportproductbydaydao.reportProdctByDaynoMinMax();
	}

	@Override
	public List<ReportProductbyDay> getReportProductbyDayMinMax(Date minday,Date Max) {
		// TODO Auto-generated method stub
		return reportproductbydaydao.reportProdctByDay( minday,  Max);
	}

	@Override
	public List<ReportCategory> revenueByMonth() {
		// TODO Auto-generated method stub
		return reportdao.revenueByMonth();
	}

	@Override
	public List<ReportTrademark> getReportTrademark() {
		// TODO Auto-generated method stub
		return productDao.getReportTrademark();
	}

}
