package com.position2.api;

import java.util.List;


import com.position2.model.AllocationResponse;
import com.position2.model.Employee;
import com.position2.model.Project;
import com.position2.model.ResourceAllocation;
import com.position2.model.ResourceResponse;
import com.position2.model.Task;

/**
 * 
 * @author venu
 *
 */
public interface MapperInterface {
	
	// List of Records
	List<ResourceResponse> getAll(String id,int size,int pageNum);
	
	// List of Records Count 
	int getAll_count(String id);
	
	// Resource Calender Create
	void allocationCreate(AllocationResponse ar);
	
	// Resource Calender update
	void allocationEdit(AllocationResponse ar);
	
	// Resource Allocation to Employee
	void allocationEmployeeCreate(ResourceAllocation ra);
	
	// Employee Creation
	void createEmployee(Employee e);
	
	// Create Project
	void createProject(Project project);
	
	// Create Task
	void createTask(Task task);
	
	// Get allocation details by id
	AllocationResponse getAllocationDetailsById(String id);

}
