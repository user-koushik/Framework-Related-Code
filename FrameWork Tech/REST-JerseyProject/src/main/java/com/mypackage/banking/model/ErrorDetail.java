package com.mypackage.banking.model;

public class ErrorDetail {
	
	int errorCode;
	String errorStatus;
	Throwable cause;
	
	public ErrorDetail(){
		
	}

	public ErrorDetail(int errorCode, String errorStatus, Throwable cause) {
		super();
		this.errorCode = errorCode;
		this.errorStatus = errorStatus;
		this.cause = cause;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorStatus() {
		return errorStatus;
	}

	public void setErrorStatus(String errorStatus) {
		this.errorStatus = errorStatus;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	

}
