package com.position2.commons;

import com.position2.model.ListResponse;

public class QueryResponse {
	
	private int statusCode;
	
	private ListResponse response;
	
	
	public QueryResponse(int statusCode, ListResponse response) {
		super();
		this.statusCode = statusCode;
		this.response = response;
	}


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	public ListResponse getResponse() {
		return response;
	}


	public void setResponse(ListResponse response) {
		this.response = response;
	}

}
