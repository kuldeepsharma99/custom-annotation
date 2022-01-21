package com.project.model;

public class ResponseModel {
	private Double value1;
	private Double value2;
	
	public ResponseModel(Double value1, Double value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

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
}
