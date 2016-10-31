package org.abhishek.SampleApplication.exception;

import org.abhishek.SampleApplication.model.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class DataNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8468398171601192683L;
	private String errCode;
	private HttpStatus status;

	public DataNotFound(String message, String errCode, HttpStatus status) {

		super(message);
		this.errCode = errCode;
		this.status = status;

	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

}
