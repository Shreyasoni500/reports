package com.control.textlocal.reports.service;

import java.util.List;

import com.control.textlocal.reports.dto.APIDTO;
import com.control.textlocal.reports.dto.ReportsDTO;
import com.control.textlocal.reports.model.Reports;

public interface IReportingDataService {
	public List<APIDTO> fetchListAPIDTO(ReportsDTO reportsDTO);
	//public List<Reports> findPaginatedReport(int pageNo, int pageSize);
	//public void send(String message);
}
