package com.covalense.javaapp.exceptions;

public class InvalidNameException extends RuntimeException {

	private String message = "Name should have maximum five characters";

	public InvalidNameException() {

	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "Name should have maximum five characters";
	}

}
