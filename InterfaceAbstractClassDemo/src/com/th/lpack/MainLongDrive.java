package com.th.lpack;

import com.th.vpack.Car;

public class MainLongDrive {

	public static void main(String[] args) {
		Car c1 = new Car(1927,"q3",20,140,"Sedan");
		System.out.println(c1.start());
		int increspeed = c1.increSpeed(60);
		if (increspeed!=-1)
			  System.out.println("Enjoy your drive !!! your current speed is  "+increspeed);
		else
			System.out.println("Alert!!!!  Stop the car.....");
		
		System.out.println(c1.stop());
	}

}
