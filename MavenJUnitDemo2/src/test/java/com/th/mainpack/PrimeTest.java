package com.th.mainpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeTest {

	@Test
	public void test1() {
		//fail("Not yet implemented");
		
		PrimeClass ob = new PrimeClass();
		assertEquals(true, ob.isPrime(17));
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		
		PrimeClass ob = new PrimeClass();
		assertEquals(false, ob.isPrime(16));
	}
	
	

}
