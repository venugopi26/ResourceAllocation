package com.position2.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.position2.commons.QueryResponse;
import com.position2.model.ListResponse;
import com.position2.service.QueryService;

@RestController
@RequestMapping("/query")
public class QueryController {
	
	private static final Logger log = LoggerFactory.getLogger(QueryController.class);
	
	@Autowired
	QueryService queryService;
	/**
	 * @author venu
	 * @param id
	 * Get all Employee info and resource calender by manger id and filters
	 */
    //@CrossOrigin(origins = "http://localhost:3000/*")
	@RequestMapping(method = RequestMethod.GET, path = "/get-all/{id}")		
	public @ResponseBody QueryResponse getAllController(@Valid @PathVariable String id,@RequestParam("noOfRowsperPage") int noOfRowsperPage,@RequestParam("pageNum") int pageNum){
		ListResponse res = new ListResponse();
		int statusCode = 101;
		try {						
			res = queryService.getAllService(id,noOfRowsperPage,pageNum);	
			statusCode = 200;
		} catch (Exception exception) {
			statusCode = 101;
			log.error("Error while create employee", exception);			
		}
		return new QueryResponse(statusCode, res);
	}
}
