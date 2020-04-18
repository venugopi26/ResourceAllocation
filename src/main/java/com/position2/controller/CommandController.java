package com.position2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.position2.commons.CommandResponse;
import com.position2.commons.QueryResponse;
import com.position2.model.AllocationResponse;
import com.position2.model.Employee;
import com.position2.model.ProjectRequest;
import com.position2.model.ResourceAllocation;
import com.position2.service.CommandService;

@RestController
@RequestMapping("/command")
public class CommandController {
	private static final Logger log = LoggerFactory.getLogger(CommandController.class);
	
	// Manager Id
	// 7072219a-0f6f-43a6-ad2e-4a93a071c75e
	@Autowired
	CommandService commandService;
	
	/**
	 * Create Employee
	 * @param reqBody
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/employee")	
	public @ResponseBody CommandResponse createEmployee(@RequestBody  Employee reqBody){
		int statusCode = 301;
		try {			
			log.info("Create Employee.");
			commandService.saveEmployeeDetails(reqBody);
			statusCode=200;
		} catch (Exception exception) {
			log.error("Error while create employee", exception);			
		}
		return new CommandResponse(statusCode);
	}
	
	/**
	 * Create Project and Task
	 * @param reqBody
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/project")	
	public @ResponseBody void createProject(@RequestBody  ProjectRequest reqBody){
		try {			
			log.info("Create Project.");
			commandService.saveProjectDetails(reqBody);			
		} catch (Exception exception) {
			log.error("Error while create employee", exception);			
		}
	}
	
	/**
	 * Assign Project and Task
	 * @param reqBody
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/allocation")	
	public @ResponseBody CommandResponse resourceAssignController(@RequestBody  ResourceAllocation reqBody){
		int statusCode = 301;
		try {			
			commandService.saveAllocationDetails(reqBody);	
			statusCode=200;
		} catch (Exception exception) {
			statusCode = 301;
			log.error("Error while allocation Resource.", exception);			
		}
		return new CommandResponse(statusCode);
	}	
	
	/**
	 * Resource Allocate Time, Number of hours
	 * @param reqBody
	 */
	@RequestMapping(method = RequestMethod.POST, path = "/allocation1")	
	public @ResponseBody CommandResponse resourceAllocationController(@RequestBody  AllocationResponse reqBody){
		int statusCode = 301;
		try {			
			log.info("Resource Allocation Update Controller.");
			commandService.allocationDetails(reqBody);		
			statusCode=200;
		} catch (Exception exception) {
			statusCode = 301;
			log.error("Error while allocation Resource.", exception);			
		}
		return new CommandResponse(statusCode);
	}
}
