package com.jodayn.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

public class ErrorResponse {

	private String message;
	private HttpStatus httpStatus;
	private LocalDateTime exceptionOccuredAt;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}
	public LocalDateTime getExceptionOccuredAt() {
		return exceptionOccuredAt;
	}
	public void setExceptionOccuredAt(LocalDateTime exceptionOccuredAt) {
		this.exceptionOccuredAt = exceptionOccuredAt;
	}
	
	
	
	
}
