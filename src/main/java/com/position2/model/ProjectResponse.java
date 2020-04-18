package com.position2.model;

import java.util.Date;
import java.util.List;

public class ProjectResponse {
	
	private String id;
	private String projectId;
	private String taskId;
	private String projectName;
	private String taskName;
	private Date taskStartDate;
	private Date taskEndDate;
	private List<AllocationResponse> allocation;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public Date getTaskStartDate() {
		return taskStartDate;
	}
	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}
	public Date getTaskEndDate() {
		return taskEndDate;
	}
	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}
	public List<AllocationResponse> getAllocation() {
		return allocation;
	}
	public void setAllocation(List<AllocationResponse> allocation) {
		this.allocation = allocation;
	}
	
}
