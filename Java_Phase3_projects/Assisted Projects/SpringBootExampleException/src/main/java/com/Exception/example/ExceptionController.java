package com.Exception.example;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(value=ProductException.class)
	public ResponseEntity<Object> exceptionHandler(ProductException e){
		
		ResponseEntity<Object> rs=new ResponseEntity<Object>("Product not found",HttpStatus.NOT_FOUND);
		return rs;
	}

}
