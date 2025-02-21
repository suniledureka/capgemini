package com.capgemini.library.except.controllers;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.capgemini.library.dto.ApiError;
import com.capgemini.library.except.BookNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

//@RestControllerAdvice
@ControllerAdvice
public class GlobalExceptionHandlerController {
	@Autowired
	private ApiError apiErrorRef;

	@ExceptionHandler(exception = BookNotFoundException.class)
	public ResponseEntity<ApiError> handleBookNotFoundException(Exception ex, HttpServletRequest httpRequest) {
		// return ResponseEntity.badRequest().body(ex.getMessage());

		apiErrorRef.setDate(LocalDateTime.now().toString());
		apiErrorRef.setMessage(ex.getMessage());
		apiErrorRef.setType(ex.getClass().getName());

		String uri = httpRequest.getRequestURI();
		apiErrorRef.setPath(uri);

		return ResponseEntity.badRequest().body(apiErrorRef);
	}

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	public ResponseEntity<?> handleValidationFailure(MethodArgumentNotValidException mex) {
		/*
		 * BindingResult bindingResult = mex.getBindingResult(); List<FieldError>
		 * fieldErrors = bindingResult.getFieldErrors();
		 * System.out.println(fieldErrors.size());
		 * 
		 * for (FieldError fieldErr : fieldErrors) {
		 * System.out.println(fieldErr.getField() + " - " +
		 * fieldErr.getDefaultMessage()); }
		 */

		List<String> errors = mex.getBindingResult()
								 .getFieldErrors()
								 .stream()
								 .map(except -> except.getField() + ": " + except.getDefaultMessage())
								 .collect(Collectors.toList());

		return new ResponseEntity<List<String>>(errors, HttpStatus.BAD_REQUEST);
	
	}
}
