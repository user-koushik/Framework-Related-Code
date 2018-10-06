package com.mypackage.banking.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import com.mypackage.banking.model.ErrorDetail;

@Provider
public class NoDataFoundExceptionMapper implements ExceptionMapper<NoDataFoundException>{

	@Override
	public Response toResponse(NoDataFoundException exception){
		
		ErrorDetail erroDet = new ErrorDetail(404, exception.getMessage(), exception.getCause());
		
		/*return Response.status(Status.NOT_FOUND).build();*/
		
		return Response.status(Status.NOT_FOUND).build();
	}
}
