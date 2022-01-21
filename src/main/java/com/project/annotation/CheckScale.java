package com.project.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

import jdk.jfr.Description;

/**
 * 
 * @author Kuldeep Sharma
 * {@link Description} : Should be used only for Double.class
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = CheckScaleValidator.class)
public @interface CheckScale {
	
	String message() default "Invalid Value";
	int max();
	
	public Class<?>[] groups() default {};
    //represents additional information about annotation
    public Class<? extends Payload>[] payload() default {};
}
