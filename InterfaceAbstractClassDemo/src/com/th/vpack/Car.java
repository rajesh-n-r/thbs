package com.th.vpack;

public class Car extends Vehicle{
	private int maxSpeed;
	private String type;
	
	

	public Car(int regNo, String model, int currSpeed, int maxSpeed, String type) {
		super(regNo, model, currSpeed);
		this.maxSpeed = maxSpeed;
		this.type = type;
	}

	@Override
	public int increSpeed(int n) {
		if (currSpeed+n<maxSpeed)
			currSpeed+=n;
		else
			currSpeed = -1;
		
		return currSpeed;
		
	}




	@Override
	public String toString() {
		return "Car [maxSpeed=" + maxSpeed + ", type=" + type + ", regNo=" + regNo + ", model=" + model + ", currSpeed="
				+ currSpeed + "]";
	}
	
	

}
