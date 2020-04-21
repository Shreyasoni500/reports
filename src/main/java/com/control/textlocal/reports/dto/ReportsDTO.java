package com.control.textlocal.reports.dto;

import java.util.Date;

import com.control.textlocal.reports.model.Filter;
import com.control.textlocal.reports.model.OrderBy;
import com.control.textlocal.reports.model.PageInfo;

public class ReportsDTO {
	/* 
	 * Unique id for User
	 * */
	private int userId;
	/* 
	 * Id of each sent
	 * */
	private int sentId;
	/*
	 * Individual id for group
	 * */
	private int groupId;
	/* 
	 * Fields needed to show on UI
	 * */
	private Filter filter;
	/* 
	 * Sort by particular field
	 * */
	private OrderBy orderBy;
	/* 
	 * All the information related to particular page
	 * */
	private PageInfo info;
	/* 
	 * Phone number of user
	 * */
	private int msisdn;
	/* 
	 * Text message
	 * */
	private String message;
	/* 
	 * Status of sent message
	 * */
	private String status;
}
