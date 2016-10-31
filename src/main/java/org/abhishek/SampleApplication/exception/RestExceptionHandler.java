package org.abhishek.SampleApplication.exception;

import org.abhishek.SampleApplication.model.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler({ DataNotFound.class })
	public ResponseEntity<Object> Res(final DataNotFound ex, final WebRequest request) {
		final ErrorMessage er = new ErrorMessage(ex.getStatus(), ex.getErrCode(), ex.getLocalizedMessage());
		return new ResponseEntity<Object>(er, new HttpHeaders(), er.getStatus());
	}

}
