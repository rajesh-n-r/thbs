package com.th.cpack;

public class Circle {
	private double radius;
	private String colour;	
	
	public Circle() {
		this(3.5,"Blue");  //invoking /calling the fully paramatized consturtor  within this constructor
	}
	public Circle(double radius) {
		this(radius,"Brown");
	}
	
	public Circle(String colour) {
		this(6.5,colour);
	}

	// Comple paramatized constructor (customized circle)
	public Circle(double radius, String colour) {
		super();
		this.radius = radius;
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", colour=" + colour + "]";
	}
	
	

}
