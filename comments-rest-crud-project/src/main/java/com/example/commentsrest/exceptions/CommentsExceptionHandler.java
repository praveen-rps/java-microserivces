package com.example.commentsrest.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CommentsExceptionHandler {
	
	@ExceptionHandler(CommentsNotFoundException.class)
	public ResponseEntity<String> handleCommentsNotFoundException(CommentsNotFoundException ex) {
		ResponseEntity<String> response = new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
		return response;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
		Map<String,String> dataErros = new HashMap<>();
		ex.getBindingResult()
		  .getAllErrors()
		  .forEach(error ->{
					String fieldName = ((FieldError) error).getField();
					String errorMessage = error.getDefaultMessage();
					dataErros.put(fieldName, errorMessage);
				});
		  
	
		return new ResponseEntity(dataErros, HttpStatus.NOT_ACCEPTABLE);
	}
}
