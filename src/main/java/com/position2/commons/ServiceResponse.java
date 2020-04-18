package com.position2.commons;

public class ServiceResponse {
	
	private String statusCode;

	public ServiceResponse() {
		
	}
	
	public ServiceResponse(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}	
	
}
