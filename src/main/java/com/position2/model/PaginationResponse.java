package com.position2.model;

public class PaginationResponse {

	private int totalRows;
	private int totalPages;
	private int numberOfrowsReturn;
	
	public int getTotalRows() {
		return totalRows;
	}
	public void setTotalRows(int totalRows) {
		this.totalRows = totalRows;
	}
	public int getTotalPages() {
		return totalPages;
	}
	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public int getNumberOfrowsReturn() {
		return numberOfrowsReturn;
	}
	public void setNumberOfrowsReturn(int numberOfrowsReturn) {
		this.numberOfrowsReturn = numberOfrowsReturn;
	}
	
	
}
