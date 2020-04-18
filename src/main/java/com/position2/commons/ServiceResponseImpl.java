package com.position2.commons;

public class ServiceResponseImpl<Response> extends ServiceResponse {
	
	private Response response;
		
	public ServiceResponseImpl(String statusCode, Response response) {
		super(statusCode);
		this.response = response;		
	}
	
	public ServiceResponseImpl(String statusCode){
        super(statusCode);
    }

	public Response getResponse(){
		return response;
	}

	public void setResponse(Response response) {
		this.response = response;
	}
	   	 
}
