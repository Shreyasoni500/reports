package com.control.textlocal.reports.dto;



public class SingleDTO {
	private String userId;
	private String message;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "SingleDTO [userId=" + userId + ", message=" + message + "]";
	}
	
}
