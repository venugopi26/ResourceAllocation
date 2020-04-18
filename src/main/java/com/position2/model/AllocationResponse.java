package com.position2.model;

import java.util.Date;

public class AllocationResponse {
	
	private String id;
	private Date allocationDateTime;
	private int numberOfHours;
	private String resourceId;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getAllocationDateTime() {
		return allocationDateTime;
	}
	public void setAllocationDateTime(Date allocationDateTime) {
		this.allocationDateTime = allocationDateTime;
	}
	public int getNumberOfHours() {
		return numberOfHours;
	}
	public void setNumberOfHours(int numberOfHours) {
		this.numberOfHours = numberOfHours;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}		
}
