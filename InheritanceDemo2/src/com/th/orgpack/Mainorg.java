package com.th.orgpack;

import com.th.emppack.*;
import com.th.tpack.Tax;

public class Mainorg {

	public static void main(String[] args) {
		
		/*Employee e1 = new Employee(100,"Rashmi",20000);
		System.out.println(e1.getempDetails());
		
		Programmer p1 = new Programmer(200,"Sachin",50000,3,"Java");
		System.out.println(p1.getempDetails());
		
		Manager m1 = new Manager(300,"VijayRaghuraman",60000,"HR",5);
		System.out.println(m1.getempDetails());*/
		
		/*Employee e = new Manager(300,"Vijay",60000,"HR",5);
		System.out.println(e.getempDetails()); // since object is Manager class object 
		 // due to dynamic polymorphism fetaures getemDetails() of Manager class executes
		// e.getempDetails()  this is virtual method invoccation 
		// We need to downcast the e to its respective subclass 
		 Manager m = (Manager) e;
		
		System.out.println(m.getEmpId()+"   "+m.getDeptName()+"   "+m.getEmpCount());*/
		
		// what is the utility of upcasting and downcasting?
		 
		Employee[] emparr = new Employee[4];
		emparr[0] = new Employee(100,"Hari",50000);
		emparr[1]= new Manager(200,"Sachin",60000,"IT",5);
		emparr[2]= new Programmer(300,"Deepak",60000,3,"Angular JS");
		emparr[3]= new Manager(201,"Nancy",70000,"R&D",3);
		
		// to argue emparr is a hetrogeous array : due to IS_A relationship all the subclass objects
		// can be stored in the base class array 
		
		System.out.println("Printing details of diff types of employees");
		for (Employee e:emparr)
		{
			System.out.println(e.getempDetails()+"  tax paid : "+Tax.calcTax(e));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
