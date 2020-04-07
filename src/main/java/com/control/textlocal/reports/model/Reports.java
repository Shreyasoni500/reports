package com.control.textlocal.reports.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/* 
 * @author srani
 * This is generic fields which will be used by all type of messages.
 * */
@Document("Reports")
public class Reports {
	/* 
	 * Unique id for User
	 * */
	//private int userId;
	/* 
	 * Id of each sent
	 * */
	//private int sentId;
	/*
	 * Individual id for group
	 * */
	//private int groupId;
	
	/*private String firstName;
	private String lastName;
	private String custom1;
	private String custom2;
	private String custom3;*/
	/* 
	 * All the information related to particular page
	 * */
	//private PageInfo info;
	/* 
	 * Current timestamp
	 * */
	//private Date systemDate;
	/* 
	 * Phone number of user
	 * */
	//private int msisdn;
	/* 
	 * Text message
	 * */
	//private String message;
	/* 
	 * Status of sent message
	 * */
	//private String status;
	@Id
	private String id;
	private String sender;
	private Long msisdn;
	private String message;
	private Integer status;
	private Integer userId;
	private Integer scheduleTime;
	private Integer sentId;
	private Integer batchId;
	private Integer receiptStatus;
	private Integer sequence;
	private Integer messageId;
	private Integer priority;
	private Integer validity;
	private String error;
	private Date timestamp;
	private Integer rx_applied;
	private Boolean country;
	private Date senttime;
	private Date receiptedtime;
	private Boolean moving;
	private Integer sendgateway;
	private Integer receiptgateway;
	private Integer categoryId;
	private String primaryRoute;
	private String secondaryRoute;
	private Integer Icr;
	private String schannel;
	private String destination;
	private Integer messageLength;
	private String products;
	private Double costRate;
	private Double purchaseRate;
	private Double creditsUsed;
	private Integer ngmpRoutingType;
	private Integer ngmpClientAppid;
	private Integer ngmpClientId;
	private Double creditsOnAccount;
	private Integer nodrvalidity;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public Long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(Long msisdn) {
		this.msisdn = msisdn;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(Integer scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public Integer getSentId() {
		return sentId;
	}
	public void setSentId(Integer sentId) {
		this.sentId = sentId;
	}
	public Integer getBatchId() {
		return batchId;
	}
	public void setBatchId(Integer batchId) {
		this.batchId = batchId;
	}
	public Integer getReceiptStatus() {
		return receiptStatus;
	}
	public void setReceiptStatus(Integer receiptStatus) {
		this.receiptStatus = receiptStatus;
	}
	public Integer getSequence() {
		return sequence;
	}
	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}
	public Integer getMessageId() {
		return messageId;
	}
	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Integer getValidity() {
		return validity;
	}
	public void setValidity(Integer validity) {
		this.validity = validity;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public Integer getRx_applied() {
		return rx_applied;
	}
	public void setRx_applied(Integer rx_applied) {
		this.rx_applied = rx_applied;
	}
	public Boolean getCountry() {
		return country;
	}
	public void setCountry(Boolean country) {
		this.country = country;
	}
	public Date getSenttime() {
		return senttime;
	}
	public void setSenttime(Date senttime) {
		this.senttime = senttime;
	}
	public Date getReceiptedtime() {
		return receiptedtime;
	}
	public void setReceiptedtime(Date receiptedtime) {
		this.receiptedtime = receiptedtime;
	}
	public Boolean getMoving() {
		return moving;
	}
	public void setMoving(Boolean moving) {
		this.moving = moving;
	}
	public Integer getSendgateway() {
		return sendgateway;
	}
	public void setSendgateway(Integer sendgateway) {
		this.sendgateway = sendgateway;
	}
	public Integer getReceiptgateway() {
		return receiptgateway;
	}
	public void setReceiptgateway(Integer receiptgateway) {
		this.receiptgateway = receiptgateway;
	}
	public Integer getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
	public String getPrimaryRoute() {
		return primaryRoute;
	}
	public void setPrimaryRoute(String primaryRoute) {
		this.primaryRoute = primaryRoute;
	}
	public String getSecondaryRoute() {
		return secondaryRoute;
	}
	public void setSecondaryRoute(String secondaryRoute) {
		this.secondaryRoute = secondaryRoute;
	}
	public Integer getIcr() {
		return Icr;
	}
	public void setIcr(Integer icr) {
		Icr = icr;
	}
	public String getSchannel() {
		return schannel;
	}
	public void setSchannel(String schannel) {
		this.schannel = schannel;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Integer getMessageLength() {
		return messageLength;
	}
	public void setMessageLength(Integer messageLength) {
		this.messageLength = messageLength;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public Double getCostRate() {
		return costRate;
	}
	public void setCostRate(Double costRate) {
		this.costRate = costRate;
	}
	public Double getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(Double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public Double getCreditsUsed() {
		return creditsUsed;
	}
	public void setCreditsUsed(Double creditsUsed) {
		this.creditsUsed = creditsUsed;
	}
	public Integer getNgmpRoutingType() {
		return ngmpRoutingType;
	}
	public void setNgmpRoutingType(Integer ngmpRoutingType) {
		this.ngmpRoutingType = ngmpRoutingType;
	}
	public Integer getNgmpClientAppid() {
		return ngmpClientAppid;
	}
	public void setNgmpClientAppid(Integer ngmpClientAppid) {
		this.ngmpClientAppid = ngmpClientAppid;
	}
	public Integer getNgmpClientId() {
		return ngmpClientId;
	}
	public void setNgmpClientId(Integer ngmpClientId) {
		this.ngmpClientId = ngmpClientId;
	}
	public Double getCreditsOnAccount() {
		return creditsOnAccount;
	}
	public void setCreditsOnAccount(Double creditsOnAccount) {
		this.creditsOnAccount = creditsOnAccount;
	}
	public Integer getNodrvalidity() {
		return nodrvalidity;
	}
	public void setNodrvalidity(Integer nodrvalidity) {
		this.nodrvalidity = nodrvalidity;
	}
	@Override
	public String toString() {
		return "Reports [id=" + id + ", sender=" + sender + ", msisdn=" + msisdn + ", message="
				+ message + ", status=" + status + ", userId=" + userId + ", scheduleTime=" + scheduleTime + ", sentId="
				+ sentId + ", batchId=" + batchId + ", receiptStatus=" + receiptStatus + ", sequence=" + sequence
				+ ", messageId=" + messageId + ", priority=" + priority + ", validity=" + validity + ", error=" + error
				+ ", timestamp=" + timestamp + ", rx_applied=" + rx_applied + ", country=" + country + ", senttime="
				+ senttime + ", receiptedtime=" + receiptedtime + ", moving=" + moving + ", sendgateway=" + sendgateway
				+ ", receiptgateway=" + receiptgateway + ", categoryId=" + categoryId + ", primaryRoute=" + primaryRoute
				+ ", secondaryRoute=" + secondaryRoute + ", Icr=" + Icr + ", schannel=" + schannel + ", destination="
				+ destination + ", messageLength=" + messageLength + ", products=" + products + ", costRate=" + costRate
				+ ", purchaseRate=" + purchaseRate + ", creditsUsed=" + creditsUsed + ", ngmpRoutingType="
				+ ngmpRoutingType + ", ngmpClientAppid=" + ngmpClientAppid + ", ngmpClientId=" + ngmpClientId
				+ ", creditsOnAccount=" + creditsOnAccount + ", nodrvalidity=" + nodrvalidity + "]";
	}
	
	
}