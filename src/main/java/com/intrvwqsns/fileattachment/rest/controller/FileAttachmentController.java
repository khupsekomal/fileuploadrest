package com.intrvwqsns.fileattachment.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intrvwqsns.fileattachment.rest.entities.Employee;
import com.intrvwqsns.fileattachment.rest.service.EmployeeService;

@RestController
public class FileAttachmentController {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping
	public ResponseEntity<Employee> addDetails(Employee e){
		
		Employee emp = service.addDetails(e);
		return new ResponseEntity<Employee>(emp,HttpStatus.OK);
		
	}

}
