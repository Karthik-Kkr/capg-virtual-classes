package com.capg.lab3.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import com.capg.lab3.exceptions.ExceptionResponse;
import com.capg.lab3.exceptions.ProductNotFoundException;

@ControllerAdvice
@RestController
public class ErrorRestController {
	
	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(code=HttpStatus.NOT_FOUND, reason="Product not Found", value=HttpStatus.NOT_FOUND)
	public ExceptionResponse handleError(WebRequest request) {
		return new ExceptionResponse(LocalDate.now(), HttpStatus.NOT_FOUND, "Product doesnot exist", 
				request.getDescription(true), request.getContextPath());
		
	}

}
