package com.jodayn.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(exception = IdNotFoundException.class)
	public ErrorResponse notFoundMessage(IdNotFoundException exception)
	{
		
		ErrorResponse errorResponse = new ErrorResponse();
		errorResponse.setHttpStatus(HttpStatus.NOT_FOUND);
		errorResponse.setMessage(exception.getMessage());
		errorResponse.setExceptionOccuredAt(LocalDateTime.now());
		
		return errorResponse;
	}
}
