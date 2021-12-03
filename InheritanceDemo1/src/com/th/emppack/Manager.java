package com.th.emppack;

public class Manager  extends Employee{
	
	private String deptName;
	private int empCount;
	
	public Manager(int empId, String empName, int bsal, String deptName, int empCount) {
		super(empId, empName, bsal);
		this.deptName = deptName;
		this.empCount = empCount;
	}

	public String getDeptName() {
		return deptName;
	}

	public int getEmpCount() {
		return empCount;
	}

	@Override
	public String getempDetails() {
		// TODO Auto-generated method stub
		return super.getempDetails()+"   "+deptName+"    "+empCount;
	}
	
	
	

}
