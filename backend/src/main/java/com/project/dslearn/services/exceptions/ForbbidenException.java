package com.project.dslearn.services.exceptions;

public class ForbbidenException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ForbbidenException(String msg) {
		super(msg);
	}
	
}
