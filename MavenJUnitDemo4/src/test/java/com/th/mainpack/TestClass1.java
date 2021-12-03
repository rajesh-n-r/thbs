package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass1 {
	
	String msg="Hari";
	
	MessageUtil ob = new MessageUtil(msg);

	@Test
	public void test() {
		
		System.out.println("Inside TestClass1 testing printMessage method");
		assertEquals(msg, ob.printMessage());
		
	}

}
