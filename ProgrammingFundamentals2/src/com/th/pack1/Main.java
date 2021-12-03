package com.th.pack1;

public class Main {

	public static void main(String[] args) {
		
		float f1 = 13.333F;   // 4bytes
		double d1 = f1;  // 8 bytes    
		                 // implicit conversion
		
		float f2 = (float)d1;  // explicit conversion 
		
		System.out.println("value of f2:"+f2);
		
		System.out.printf("value of f2: %.1f",f2);
		
		
		int a=122;
		byte b = (byte)a; // explicit conversion
		
		

	}

}
