package com.cdio.service;

import java.util.Date;
import java.util.List;

import com.cdio.entity.ReportCategory;
import com.cdio.entity.ReportProductbyDay;
import com.cdio.entity.ReportTrademark;

public interface ReportService {
	
	List<ReportCategory> getReportCategory() ;
	
	List<ReportProductbyDay> getReportProductbyDaynoMinMax();
	List<ReportProductbyDay> getReportProductbyDayMinMax(Date minday , Date maxday);

	List<ReportCategory> revenueByMonth();

	List<ReportTrademark> getReportTrademark();
}
