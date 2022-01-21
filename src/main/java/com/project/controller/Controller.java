package com.project.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.RequestModel;
import com.project.model.ResponseModel;
import com.project.service.Service;

@RestController
@RequestMapping("/annotation")
public class Controller {

	@Autowired
	Service service;
	
	@PostMapping()
	public ResponseEntity<ResponseModel> testAnnotation(@RequestBody @Valid RequestModel request) {
		return new ResponseEntity<ResponseModel>(service.testAnnotation(request), HttpStatus.OK) ;
	}
}
