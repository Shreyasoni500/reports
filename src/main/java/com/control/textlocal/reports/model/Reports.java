package com.control.textlocal.reports.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;
/* 
 * @author srani
 * This is generic fields which will be used by all type of messages.
 * */
@Entity
@Table(name = "EMPLOYEE_DOCUMENTS")
public class Reports extends MessageHistory{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private int gatewayName;
	private int pendingliveId;
	private String firstname;
	private String lastname;
	private String sender;
	private long msisdn;
	private int status;
	private int scheduleTime;
	private int sentId;
	private int validity;
	private boolean country;
	private Date senttime;
	private Date receiptedtime;
	private int categoryId;
	private String primaryRoute;
	private String secondaryRoute;
	private int messageLength;
	private double costRate;
	private double creditsUsed;
	private int nodrvalidity;
	private int batchId;
	private int priority;
	private Date createdAt;
	private Date updatedAt;
	private int ngmpClientId;
	private String ngmpClientAppId;
	private int ngmpRoutingType;
	private String schannel; //parameter sent to gateway
	private int lcr; //Least cost routing
	
	private int receiptStatus;
	private String error;
	private int sendgateway;
	private int receiptgateway;
	private String destination;
	private double purchaseRate;
	private double creditsOnAccount;
	private String gw_receiptObject;
}