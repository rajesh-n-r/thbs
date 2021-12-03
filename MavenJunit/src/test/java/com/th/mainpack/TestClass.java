package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestClass {

	@Test
	public void test() {

		int val1=5;
		int val2=6;
		//assertEquals(val1,val2);
		assertTrue(val1<val2);
		
		String str1="abc";
		String str2="abc";
		assertSame(str1,str2);
		
		
		String str3=null;
		assertNotNull(str3);
	}

}
