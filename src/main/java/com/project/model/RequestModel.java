package com.project.model;

import com.project.annotation.CheckScale;

public class RequestModel {
	
	@CheckScale(max = 2)  // takes max 2 digits after decimal. e.g 10.45
	private Double value1;
	
	@CheckScale(max = 3, message = "value supports only upto 3 decimal digits")  // with custom message
	private Double value2;
	
	// Getters and Setters
	public Double getValue1() {
		return value1;
	}

	public void setValue1(Double value1) {
		this.value1 = value1;
	}

	public Double getValue2() {
		return value2;
	}

	public void setValue2(Double value2) {
		this.value2 = value2;
	}	
}
