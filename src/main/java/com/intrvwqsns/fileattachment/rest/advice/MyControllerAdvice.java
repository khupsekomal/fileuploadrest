package com.intrvwqsns.fileattachment.rest.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice {
	
	@ExceptionHandler
	public ResponseEntity<String> method1(){
		return new ResponseEntity("Exception occured",HttpStatus.BAD_REQUEST);
		
	}

}
