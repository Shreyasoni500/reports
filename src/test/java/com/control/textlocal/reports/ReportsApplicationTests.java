package com.control.textlocal.reports;

import static com.control.textlocal.reports.Logger.ReportLogger.REPORT_LOGGER;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import com.control.textlocal.reports.model.Reports;
import com.control.textlocal.reports.repository.ReportingRepository;

@SpringBootTest
class ReportsApplicationTests {
	
	@Autowired
	private ReportingRepository reportingRepository;
	
	@Test
	void contextLoads() {
		REPORT_LOGGER.info("****************This is my book***********");
	}
	
	/*@Test
	public void fetchSingleRecord() {
		Pageable paging = PageRequest.of(1, 5);
        Page<Reports> pagedResult = reportingRepository.findAll(paging);
        List<Reports> listReport = pagedResult.toList();
        listReport.stream().forEach(result -> System.out.println(result));
	}*/
	
	/*@Test
	public void fetchOneRecord() {
		Optional<Reports> report = reportingRepository.findById("5e872d85846d701467d2f6f8");
		if (report.isPresent()) {
			System.out.println(report.toString());
		}
	}*/

}
