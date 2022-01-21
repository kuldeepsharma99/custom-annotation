package com.project.annotation;

import java.math.BigDecimal;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.util.ObjectUtils;

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
		if(ObjectUtils.isEmpty(value) || BigDecimal.valueOf(value).scale() <= max) {
			return Boolean.TRUE;
		}
		throw new RuntimeException(message);  // throw your custom exception here
	}

}
