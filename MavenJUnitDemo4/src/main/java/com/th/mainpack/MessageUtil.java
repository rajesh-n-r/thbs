package com.th.mainpack;

public class MessageUtil {
	
	private String message;
	
	
	
	
	public MessageUtil(String message) {
		super();
		this.message = message;
	}

	public String printMessage()
	{
		System.out.println(message);
		return message;
	}
	
	public String greetMessage()
	{
		message = "Welcome!!"+message;
		System.out.println(message);
		return message;
	}

}
