package com.example.travelopia.exception;

public class TravelDetailsException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private final String message;

	public TravelDetailsException() {
		this.message = "Login Exception";
	}

	public TravelDetailsException(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "LoginException [message=" + message + "]";
	}

	@Override
	public String getMessage() {
		return message;
	}
}
