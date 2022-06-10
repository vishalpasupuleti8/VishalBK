package com.lnt.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


//Global Exception Handler
//like catch block
@RestControllerAdvice
public class ClassNotFoundExceptionHandler {

@ExceptionHandler(value=CustomerNotFoundException.class)

public ResponseEntity<String> handler(Exception e){
	String msg="{\"msg\":\"Customer Not Found\"}";
	return new ResponseEntity<String>(msg,HttpStatus.NOT_FOUND);
}
}