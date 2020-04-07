package com.control.textlocal.reports.service;

import java.util.List;

import com.control.textlocal.reports.model.Reports;

public interface IReportingDataService {
	public List<Reports> findPaginatedReport(int pageNo, int pageSize);
}
