package com.th.cpack;

import com.th.exceptionpack.InvalidAgeException;

public class Citizen {
	private int id;
	private String name;
	private int age;
	
	public Citizen(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public String getLicense() throws InvalidAgeException
	{
		if (age<18)
			throw new InvalidAgeException("Hi Young Master... Licence cannot be issued!!");
			else 
				if ((age<=75)&&(age>=18))
					return("Congrats!!!   Licence Isuued..");
				else
					throw new InvalidAgeException("Hi Senior Citizen...Licence cannot be issued!!");
		
	}
	
	
	

}
