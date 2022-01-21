package com.project.service;

import com.project.model.RequestModel;
import com.project.model.ResponseModel;

@org.springframework.stereotype.Service
public class Service {

	public ResponseModel testAnnotation(RequestModel request) {
		return new ResponseModel(request.getValue1(), request.getValue2());
	}
}
