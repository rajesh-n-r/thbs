package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {
		
		int val1=5;
		int val2=6;
		 // val1 is expected value , val2 is the output of a unit 
		//assertEquals(val1, val2);
		//assertTrue(val1<val2);
		
		String str1="abc";
		String str2 ="abc";
		String str3 = new String("abc");
		 
		// check if both the references of the object are same 
		//assertSame(str1, str2);
		//assertSame(str1, str3);
		//assertEquals(str1, str3);
		
		String[] expectedarray = {"one","two","three"};
		String[] outputarray = {"one","two","three"};
		//assertArrayEquals(expectedarray, outputarray);
		
		String str4=null;
		//assertNull(str4);
		 // assertNotNull(str4);
		
		
		
	}

}
