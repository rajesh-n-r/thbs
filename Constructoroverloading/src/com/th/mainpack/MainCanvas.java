package com.th.mainpack;

import com.th.cpack.Circle;

public class MainCanvas {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		System.out.println(c1);
		
		Circle c2 = new Circle(4.5);
		System.out.println(c2);
		
		Circle c3 = new Circle("RED");
		System.out.println(c3);
		
		Circle c4 = new Circle(5.5,"PINK");
		System.out.println(c4);
		
		

	}

}
