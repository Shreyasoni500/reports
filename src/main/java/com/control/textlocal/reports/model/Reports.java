package com.control.textlocal.reports.model;


import java.util.Date;

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
public class Reports {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	private String sender;
	private long msisdn;
	private String firstname;
	private String lastname;
	private String custom1;
	private String custom2;
	private String custom3;
	private String message;
	private int status;
	private int userId;
	private int scheduleTime;
	private int sentId;
	private int batchId;
	private int receiptStatus;
	private int sequence;
	private int messageId;
	private int priority;
	private int validity;
	private String error;
	private Date timestamp;
	private boolean country;
	private Date senttime;
	private Date receiptedtime;
	private boolean moving;
	private int sendgateway;
	private int receiptgateway;
	private int categoryId;
	private String schannel;
	private String destination;
	private int messageLength;
	private String products;
	private double costRate;
	private double purchaseRate;
	private double creditsUsed;
	private double creditsOnAccount;
	private int nodrvalidity;
	private int err_code;
	private String gw_receiptObject;
	private Date systemDate;
	
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
	public long getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(long msisdn) {
		this.msisdn = msisdn;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCustom1() {
		return custom1;
	}
	public void setCustom1(String custom1) {
		this.custom1 = custom1;
	}
	public String getCustom2() {
		return custom2;
	}
	public void setCustom2(String custom2) {
		this.custom2 = custom2;
	}
	public String getCustom3() {
		return custom3;
	}
	public void setCustom3(String custom3) {
		this.custom3 = custom3;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getScheduleTime() {
		return scheduleTime;
	}
	public void setScheduleTime(int scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	public int getSentId() {
		return sentId;
	}
	public void setSentId(int sentId) {
		this.sentId = sentId;
	}
	public int getBatchId() {
		return batchId;
	}
	public void setBatchId(int batchId) {
		this.batchId = batchId;
	}
	public int getReceiptStatus() {
		return receiptStatus;
	}
	public void setReceiptStatus(int receiptStatus) {
		this.receiptStatus = receiptStatus;
	}
	public int getSequence() {
		return sequence;
	}
	public void setSequence(int sequence) {
		this.sequence = sequence;
	}
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public int getValidity() {
		return validity;
	}
	public void setValidity(int validity) {
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
	public boolean isCountry() {
		return country;
	}
	public void setCountry(boolean country) {
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
	public boolean isMoving() {
		return moving;
	}
	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	public int getSendgateway() {
		return sendgateway;
	}
	public void setSendgateway(int sendgateway) {
		this.sendgateway = sendgateway;
	}
	public int getReceiptgateway() {
		return receiptgateway;
	}
	public void setReceiptgateway(int receiptgateway) {
		this.receiptgateway = receiptgateway;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
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
	public int getMessageLength() {
		return messageLength;
	}
	public void setMessageLength(int messageLength) {
		this.messageLength = messageLength;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public double getCostRate() {
		return costRate;
	}
	public void setCostRate(double costRate) {
		this.costRate = costRate;
	}
	public double getPurchaseRate() {
		return purchaseRate;
	}
	public void setPurchaseRate(double purchaseRate) {
		this.purchaseRate = purchaseRate;
	}
	public double getCreditsUsed() {
		return creditsUsed;
	}
	public void setCreditsUsed(double creditsUsed) {
		this.creditsUsed = creditsUsed;
	}
	public double getCreditsOnAccount() {
		return creditsOnAccount;
	}
	public void setCreditsOnAccount(double creditsOnAccount) {
		this.creditsOnAccount = creditsOnAccount;
	}
	public int getNodrvalidity() {
		return nodrvalidity;
	}
	public void setNodrvalidity(int nodrvalidity) {
		this.nodrvalidity = nodrvalidity;
	}
	public int getErr_code() {
		return err_code;
	}
	public void setErr_code(int err_code) {
		this.err_code = err_code;
	}
	public String getGw_receiptObject() {
		return gw_receiptObject;
	}
	public void setGw_receiptObject(String gw_receiptObject) {
		this.gw_receiptObject = gw_receiptObject;
	}
	public Date getSystemDate() {
		return systemDate;
	}
	public void setSystemDate(Date systemDate) {
		this.systemDate = systemDate;
	}
	@Override
	public String toString() {
		return "Reports [id=" + id + ", sender=" + sender + ", msisdn=" + msisdn + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", custom1=" + custom1 + ", custom2=" + custom2 + ", custom3=" + custom3
				+ ", message=" + message + ", status=" + status + ", userId=" + userId + ", scheduleTime="
				+ scheduleTime + ", sentId=" + sentId + ", batchId=" + batchId + ", receiptStatus=" + receiptStatus
				+ ", sequence=" + sequence + ", messageId=" + messageId + ", priority=" + priority + ", validity="
				+ validity + ", error=" + error + ", timestamp=" + timestamp + ", country=" + country + ", senttime="
				+ senttime + ", receiptedtime=" + receiptedtime + ", moving=" + moving + ", sendgateway=" + sendgateway
				+ ", receiptgateway=" + receiptgateway + ", categoryId=" + categoryId + ", schannel=" + schannel
				+ ", destination=" + destination + ", messageLength=" + messageLength + ", products=" + products
				+ ", costRate=" + costRate + ", purchaseRate=" + purchaseRate + ", creditsUsed=" + creditsUsed
				+ ", creditsOnAccount=" + creditsOnAccount + ", nodrvalidity=" + nodrvalidity + ", err_code=" + err_code
				+ ", gw_receiptObject=" + gw_receiptObject + ", systemDate=" + systemDate + "]";
	}
	
}