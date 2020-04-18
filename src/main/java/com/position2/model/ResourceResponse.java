package com.position2.model;

import java.util.List;

public class ResourceResponse {
	
	private String id;
	private String name;
	private String position;
	private String managerId;
	private List<ProjectResponse> project;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public List<ProjectResponse> getProject() {
		return project;
	}
	public void setProject(List<ProjectResponse> project) {
		this.project = project;
	}
	
}
