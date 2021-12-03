package com.th.orgpack;

import com.th.emppack.*;

public class Mainorg {

	public static void main(String[] args) {
		
		Employee e1 = new Employee(100,"Rashmi",20000);
		System.out.println(e1.getempDetails());
		
		Programmer p1 = new Programmer(200,"Sachin",50000,3,"Java");
		System.out.println(p1.getempDetails());
		
		Manager m1 = new Manager(300,"VijayRaghuraman",60000,"HR",5);
		System.out.println(m1.getempDetails());
		

	}

}
