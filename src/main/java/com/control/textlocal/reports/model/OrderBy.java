package com.control.textlocal.reports.model;

public class OrderBy {
	private int senderId = 1;
	private int firstName;
	private int lastName;
	private int custom1;
	private int custom2;
	private int custom3;
	private int date;
	private int message;
	private int msisdn;
	private int cost;
	public int getSenderId() {
		return senderId;
	}
	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}
	public int getFirstName() {
		return firstName;
	}
	public void setFirstName(int firstName) {
		this.firstName = firstName;
	}
	public int getLastName() {
		return lastName;
	}
	public void setLastName(int lastName) {
		this.lastName = lastName;
	}
	public int getCustom1() {
		return custom1;
	}
	public void setCustom1(int custom1) {
		this.custom1 = custom1;
	}
	public int getCustom2() {
		return custom2;
	}
	public void setCustom2(int custom2) {
		this.custom2 = custom2;
	}
	public int getCustom3() {
		return custom3;
	}
	public void setCustom3(int custom3) {
		this.custom3 = custom3;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(int msisdn) {
		this.msisdn = msisdn;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "OrderBy [senderId=" + senderId + ", firstName=" + firstName + ", lastName=" + lastName + ", custom1="
				+ custom1 + ", custom2=" + custom2 + ", custom3=" + custom3 + ", date=" + date + ", message=" + message
				+ ", msisdn=" + msisdn + ", cost=" + cost + "]";
	}
	
	
}
