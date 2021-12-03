package com.th.emppack;

public class Employee {
	
	protected int empId;
	protected String empName;
	protected int bsal;
	
	
	public Employee(int empId, String empName, int bsal) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.bsal = bsal;
	}


	public int getEmpId() {
		return empId;
	}


	public String getEmpName() {
		return empName;
	}


	public int getBsal() {
		return bsal;
	}
	
	
	public String getempDetails()
	{
		return(empId+"    "+empName+"     "+bsal);
	}

}
