package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass2 {
	
	String msg="Anand";
	
	MessageUtil ob = new MessageUtil(msg);

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		System.out.println("Inside TestClass2 testing for greetMessage method");
		msg= "Welcome!!"+msg;
		assertEquals(msg, ob.greetMessage());
	}

}
