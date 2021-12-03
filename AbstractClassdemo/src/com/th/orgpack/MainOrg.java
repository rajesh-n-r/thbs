package com.th.orgpack;

import com.th.emppack.Employee;
import com.th.emppack.Manager;
import com.th.emppack.Programmer;

public class MainOrg {

	public static void main(String[] args) {
		
		//Employee e = new Employee(100,"Catherine",40000); ----> this is not possible xxx
		Manager m = new Manager(100,"Catherine",50000,"HR",6);
		Programmer p = new Programmer(200,"Balaji",55000,4,"HTML technologies");
		
		System.out.println(m.getempDetails()+"   "+m.calcNetSalary());
		System.out.println(p.getempDetails()+"   "+p.calcNetSalary());
		
		Employee e1 = new Manager(101,"Krishna",50000,"Finanace",5);
		System.out.println(e1.getempDetails()+"    "+e1.calcNetSalary());
		
		Employee e2 = new Programmer(201,"Prem",45000,3,"Java");
		System.out.println(e2.getempDetails()+"   "+e2.calcNetSalary());
		
		

	}

}
