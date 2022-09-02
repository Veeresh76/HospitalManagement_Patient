package com.Mindtree.Patient.ExceptionHandler;




import java.net.UnknownHostException;
import java.util.NoSuchElementException;



import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Object> checkInput(EmptyInputException emptyInputException) {
		return new ResponseEntity(emptyInputException.getM(),HttpStatus.BAD_REQUEST );
	}
	
	
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleEmptyInput(NoSuchElementException noSuchElementException) {
		return new ResponseEntity("No Elements found",HttpStatus.BAD_REQUEST );
	}
	
	@ExceptionHandler(UnknownHostException.class)
		public ResponseEntity<String> childServerdown(UnknownHostException unknownHostException) {
			return new ResponseEntity("child Server is down",HttpStatus.BAD_GATEWAY );
	}
	
	/*@ExceptionHandler(EmptyInputException.class)
	public ResponseEntity<Object> checkInput(EmptyInputException emptyInputException) {
		return new ResponseEntity(emptyInputException.getM(),HttpStatus.BAD_GATEWAY );
	}*/
	
	@Override
	protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
			HttpHeaders headers, HttpStatus status, WebRequest request) {
		
		return new ResponseEntity("Check Input method type ",HttpStatus.BAD_REQUEST );
	}
	
	@Override
	protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		
		return new ResponseEntity("Path Variable is Missing ",HttpStatus.BAD_REQUEST );
	}
	
}
