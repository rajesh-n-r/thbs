package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass1 {


		String msg="rajesh";
		MessageUtil ob =new MessageUtil();
		
		@Test
		public void test() {
			System.out.println("Inside testclass1 testing print message method");
			assertEquals(msg,ob.printMessage());
	}

}
