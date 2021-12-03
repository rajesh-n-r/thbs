package com.th.mainpack;

import emppack.Employee;
import exceptionpack.InsufficentLeaveException;

public class Main {

	public static void main(String[] args) {
		Employee employee = new Employee(100,12);
		
		try {
			System.out.println(employee.applyLeave(15));
		} catch (InsufficentLeaveException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Leave not sanctioned:   "+e.getMessage());
		}
		

	}

}
