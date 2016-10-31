package org.abhishek.SampleApplication.model;

import org.springframework.http.HttpStatus;

public class ErrorMessage {
	private String message;
	private String errorcode;
	private HttpStatus status;

	public ErrorMessage() {
		super();
	}

	public ErrorMessage(final HttpStatus status, final String errorcode, String message) {
		super();
		this.status = status;
		this.errorcode = errorcode;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getErrorcode() {
		return errorcode;
	}

	public void setErrorcode(String errorcode) {
		this.errorcode = errorcode;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
