package com.position2.model;

import java.util.List;

public class ProjectRequest {

	private String id;
	private String projectName;	
	private List<Task> task;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public List<Task> getTask() {
		return task;
	}
	public void setTask(List<Task> task) {
		this.task = task;
	}

}
	