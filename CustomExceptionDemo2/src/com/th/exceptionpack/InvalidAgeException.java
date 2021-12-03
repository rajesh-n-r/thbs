package com.th.exceptionpack;

public class InvalidAgeException extends Exception{
	private String msg;

	public InvalidAgeException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}
	
	

}
