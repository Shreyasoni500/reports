package com.control.textlocal.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.control.textlocal.reports.model.Reports;
import com.control.textlocal.reports.service.IReportingDataService;


@RestController
public class ReportingController {
	
	@Autowired 
	private IReportingDataService reportingDataService;
	
	@GetMapping("history/single/{pageNo}/{pageSize}")
	public List<Reports> getPaginatedReport(@PathVariable int pageNo,@PathVariable int pageSize) {
			 return reportingDataService.findPaginatedReport(pageNo, pageSize);
	}
}