package com.position2.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.position2.api.MapperInterface;
import com.position2.model.AllocationResponse;
import com.position2.model.Employee;
import com.position2.model.ProjectRequest;
import com.position2.model.ResourceAllocation;
import com.position2.util.GenerateUUID;

/**
 * 
 * @author venu
 *
 */
@Service
public class CommandService {

	private static final Logger log = LoggerFactory.getLogger(CommandService.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	GenerateUUID uuid;
		
	@Autowired
	MapperInterface mapperInterface;
	
	/**
	 * 
	 * @param e
	 */
	public void saveEmployeeDetails(Employee emp) {		
		try {			
			emp.setId(uuid.generateUUID());
			mapperInterface.createEmployee(emp);
		} catch (Exception exception) {
			log.info("",exception);
			throw exception;
		}
	}
	
	/**
	 * 
	 * @param pr
	 */
	public void saveProjectDetails(ProjectRequest pr) {		
		try {				
			pr.setId(uuid.generateUUID());
			
			// Insert into project
			String sqlProject = "INSERT INTO PROJECT (ID,PROJECT_NAME) VALUES (?,?)";					
			int status=jdbcTemplate.update(sqlProject,new Object[]{pr.getId(),pr.getProjectName()});
			
			// Insert into update
			String sqlTask = "INSERT INTO TASK (ID,TASK_NAME,PROJECT_ID,TASK_START_DATE,TASK_END_DATE) VALUES (?,?,?,?,?)";
			for(int i=0;i<pr.getTask().size();i++) {
				String id = uuid.generateUUID();
				pr.getTask().get(i).setId(id);
				int status1 = jdbcTemplate.update(sqlTask,new Object[]{pr.getTask().get(i).getId(),pr.getTask().get(i).getTaskName(),pr.getId(),
						pr.getTask().get(i).getTaskStartDate(),pr.getTask().get(i).getTaskEndDate()});				
			}						
		} catch (Exception exception) {
			log.info("",exception);
		}
	}
	
	/**
	 * Allocation Project and task to Employee
	 * @param ra
	 */
	public void saveAllocationDetails(ResourceAllocation ra) {		
		try {			
			ra.setId(uuid.generateUUID());
			mapperInterface.allocationEmployeeCreate(ra);
		} catch (Exception exception) {
			log.info("",exception);
		}
	}
	
	/**
	 * Insert/Update Allocating Date and number of hours
	 * @param ar
	 * 1.Not allowed for previous date
	 * 2.Not allowed on Sat and Sun
	 */		
	public void allocationDetails(AllocationResponse ar) {		
		try {						
			// Id not exist create else update			
			if(ar.getId() != null && ar.getId().length() > 0 && ar.getResourceId() != null ) {
				 mapperInterface.allocationEdit(ar);				
				// Get allocation time and number of hours
					/*
					 * AllocationResponse ar1 =
					 * mapperInterface.getAllocationDetailsById(ar.getId());
					 * System.out.println(ar1.getAllocationDateTime()); SimpleDateFormat
					 * simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd"); String d1 =
					 * simpleDateFormat.format(ar1.getAllocationDateTime()); System.out.println(d1);
					 * Date d3 = simpleDateFormat.parse(d1);
					 * 
					 * // Get current date String date = simpleDateFormat.format(new Date()); Date
					 * d4 = simpleDateFormat.parse(date);
					 * 
					 * if (d4.compareTo(d3) > 0) { System.out.println("Date1 is after Date2");
					 * mapperInterface.allocationEdit(ar); }else if (d4.compareTo(d3) < 0) {
					 * System.out.println("Date1 is before Date2"); // Update is not allowed }else
					 * if (d4.compareTo(d3) == 0) { System.out.println("Date1 is equal to Date2");
					 * mapperInterface.allocationEdit(ar); }
					 */	
			} else {
//				if (d4.compareTo(d3) < 0) { 		 
//						            
//		        }			
				if(ar.getResourceId() != null) {
					ar.setId(uuid.generateUUID());
					mapperInterface.allocationCreate(ar);
				}					
			}
		} catch (Exception exception) {
			log.info("",exception);
//			throw exception;
		}
	}	
}
