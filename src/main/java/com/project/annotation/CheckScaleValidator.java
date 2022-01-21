package com.project.annotation;

import java.math.BigDecimal;

import javax.management.RuntimeErrorException;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckScaleValidator implements ConstraintValidator<CheckScale, Double> {

	int max;
	String message;
	public void initialize(CheckScale constraintAnnotation) {
		max = constraintAnnotation.max();
		message = constraintAnnotation.message();
		ConstraintValidator.super.initialize(constraintAnnotation);
	}
	
	@Override
	public boolean isValid(Double value, ConstraintValidatorContext context) {
		if(BigDecimal.valueOf(value).scale() <= max) {
			return Boolean.TRUE;
		}
		throw new RuntimeErrorException(null, message);
	}

}
