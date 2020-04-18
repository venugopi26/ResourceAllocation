package com.position2.service;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.position2.api.MapperInterface;
import com.position2.model.Employee;
import com.position2.model.ListResponse;
import com.position2.model.PaginationResponse;
import com.position2.model.ResourceResponse;



@Service
public class QueryService {
	
	private static final Logger log = LoggerFactory.getLogger(QueryService.class);
	
	@Autowired
	MapperInterface mapperInterface;
	
	public ListResponse getAllService(String id,int noOfRowsperPage,int pageNum) {	
		List<ResourceResponse> res = Collections.emptyList();
		PaginationResponse pagination = new PaginationResponse();
		ListResponse response = new ListResponse();
		try {			
			log.info("In Service.");
			int totalRows = mapperInterface.getAll_count(id);					
			
			// Calculate total pages (total rows/noOfRowsperPage)
			int totalPages = (int) Math.ceil(noOfRowsperPage/totalRows);			
			pagination.setTotalRows(totalRows);
			pagination.setNumberOfrowsReturn(totalRows);
			pagination.setTotalPages(totalPages);
			
			// Set Pagination			
			res = mapperInterface.getAll(id,noOfRowsperPage,pageNum);
			response.setResponse(res);
			response.setPagination(pagination);
			log.info("Service Complete.");
		} catch (Exception exception) {
			log.info("Exp.",exception);
		}
		return response;
	}
}
