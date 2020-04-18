package com.position2.commons;

public class CommandResponse {
	
	private int statusCode;
	
	
	public CommandResponse(int statusCode) {
		super();
		this.statusCode = statusCode;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	
	
}
