package com.th.mainpack;

import static org.junit.Assert.*;

public class PrimeTest {

	public void test() {
		
		PrimeClass ob=new PrimeClass();
		assertEquals(true,ob.isPrime(17));
	}
	

		public void test1() {
			
			PrimeClass ob=new PrimeClass();
			assertEquals(false,ob.isPrime(16));
		}
}
