package com.th.ppack;

public class Person {
	
	private static int count;
	private int pId;
	private String pName;
	private int age;
	
	static {  // to intialize the values of static variables 
		     // static blocks executed first
		 count=0;
	}

	public Person(int pId, String pName, int age) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.age = age;
		++count;
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", age=" + age + "]";
	}

	public static int getCount() {
		return count;
	}
	
	

}
