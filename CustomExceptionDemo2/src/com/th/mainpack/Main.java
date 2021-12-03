package com.th.mainpack;

import com.th.cpack.Citizen;
import com.th.exceptionpack.InvalidAgeException;

public class Main {

	public static void main(String[] args) {
		
		Citizen citizen = new Citizen(100,"Raghu",82);
		
		try {
			System.out.println(citizen.getLicense());
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		

	}

}
