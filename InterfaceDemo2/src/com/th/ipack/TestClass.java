package com.th.ipack;

public class TestClass implements Interface3 {

	@Override
	public void m4() {
		
		//count++;  this is final variable 
		System.out.println("In m4 method"+count);
		
	}

	@Override
	public void m1() {
		
		System.out.println("In m1 method"+count);
		
	}

	@Override
	public void m2() {
		System.out.println("In m2 method"+count);
		
	}

	@Override
	public void m3() {
		System.out.println("In m3 method"+count);
		
	}

}
