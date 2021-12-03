package com.th.mainpack;

public class MessageUtil {	
	
	private String message;
	
	public String printMessage() {
		System.out.println(message);
		return message;
		
	}
	public String greetMessage() {
		message="welcome!!!"+message;
		System.out.println(message);
		return message;
	}
}
