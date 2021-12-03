package com.th.spack;

import com.th.apack.Address;

public class Student {
	
	private int regNo;
	private String sName;
	private Address addrs;
	public Student(int regNo, String sName, Address addrs) {
		super();
		this.regNo = regNo;
		this.sName = sName;
		this.addrs = addrs;
	}
	@Override
	public String toString() {
		return "Student [regNo=" + regNo + ", sName=" + sName + ", addrs=" + addrs + "]";
	}
	
	
	
	

}
