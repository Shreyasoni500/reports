package com.control.textlocal.reports.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import static com.control.textlocal.reports.Logger.ReportLogger.REPORT_LOGGER;
import com.control.textlocal.reports.model.Reports;
import com.control.textlocal.reports.model.SingleDTO;
import com.control.textlocal.reports.service.IReportingDataService;
import com.control.textlocal.reports.service.SendMessageSource;


@RestController
@EnableBinding(SendMessageSource.class)
public class ReportingController {
	
	@Autowired 
	private IReportingDataService reportingDataService;
	
	@Autowired 
	private SendMessageSource sendMessageSource;
	
	@GetMapping("history/single/{pageNo}/{pageSize}")
	public List<Reports> getPaginatedReport(@PathVariable int pageNo,@PathVariable int pageSize) {
			 return reportingDataService.findPaginatedReport(pageNo, pageSize);
	}
	
	@RequestMapping("/message")
	@ResponseBody
	public String sendMessage(@RequestBody SingleDTO singleDTO) {
		sendMessageSource.sendMessage().send(MessageBuilder.withPayload(singleDTO).build());
		REPORT_LOGGER.info(singleDTO.toString());
		return "Message Sent";
	}
	
	@StreamListener(target = SendMessageSource.MESSAGING)
    public void processMessagingChannel(SingleDTO singleDTO) {
		REPORT_LOGGER.info(singleDTO.toString());
    }
	
	
}