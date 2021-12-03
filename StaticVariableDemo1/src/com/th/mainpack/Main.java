package com.th.mainpack;

import com.th.ppack.Person;

public class Main {

	public static void main(String[] args) {
		
		Person p1 = new Person(100,"Ashwin",26);
		Person p2 = new Person(101,"Adhitya",27);
		
		System.out.println("No. of person objects created: "+Person.getCount());
		//System.out.println("No. of person objects created: "+Person.count);
		
		Person p3 = new Person(102,"Atul",20);
		System.out.println("No. of person objects created: "+Person.getCount());
		
		

	}

}
