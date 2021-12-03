package com.th.emppack;

public class Programmer extends Employee {
	
	private int noOfProjects;
	private String skillSet;
	
	public Programmer(int empId, String empName, int bsal, int noOfProjects, String skillSet) {
		super(empId, empName, bsal);  // base class constructor is chained and invoked/called 
		this.noOfProjects = noOfProjects; // base class constructor works first and the sub class constructor
		this.skillSet = skillSet;
	}

	@Override
	public String getempDetails() {
		
		return super.getempDetails()+"  "+noOfProjects+"    "+skillSet;
	}

	public int getNoOfProjects() {
		return noOfProjects;
	}

	public String getSkillSet() {
		return skillSet;
	}

	
	
	
	
	

}
