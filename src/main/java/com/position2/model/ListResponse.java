package com.position2.model;

import java.io.Serializable;
import java.util.List;

public class ListResponse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PaginationResponse pagination;
	private List<ResourceResponse> response;
	
	public PaginationResponse getPagination() {
		return pagination;
	}
	public void setPagination(PaginationResponse pagination) {
		this.pagination = pagination;
	}
	public List<ResourceResponse> getResponse() {
		return response;
	}
	public void setResponse(List<ResourceResponse> response) {
		this.response = response;
	}
	
	
}
