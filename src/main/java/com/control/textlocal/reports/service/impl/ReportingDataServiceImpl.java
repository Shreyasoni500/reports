package com.control.textlocal.reports.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.control.textlocal.reports.model.Reports;
import com.control.textlocal.reports.repository.ReportingRepository;
import com.control.textlocal.reports.service.IReportingDataService;

@Service
public class ReportingDataServiceImpl implements IReportingDataService{
	
	@Autowired
	private ReportingRepository reportingRepository;
	
    public List<Reports> findPaginatedReport(int pageNo, int pageSize) {
    	Pageable paging = PageRequest.of(pageNo, pageSize);
        Page<Reports> pagedResult = reportingRepository.findAll(paging);
        return pagedResult.toList();
    }
}
