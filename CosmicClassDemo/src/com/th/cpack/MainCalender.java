package com.th.cpack;

import com.th.dpack.MyDate;

public class MainCalender {

	public static void main(String[] args) {
		
		MyDate d1 = new MyDate(8,11,2021);
		
	
		
		MyDate d2 = new MyDate(8,11,2021);
		MyDate d3 = d2;
		
		System.out.println(d1.equals(d2));  // eqauls() is  boolean method  it returns true or false
		
		System.out.println(d1.hashCode());
		System.out.println(d2.hashCode());
		System.out.println(d3.hashCode());
		System.out.println(d2.equals(d3));
		
		System.out.println(d1==d2); // == compares the memeory location of two objects 
		System.out.println(d2==d3);
		
		MyDate d4=null;
		System.out.println(d4.equals(d3));
		
		

	}

}
