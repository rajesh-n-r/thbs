package com.th.apack;

public class Address {
	private int doorNo;
	private String street;
	private String city;
	private String state;
	private int pincode;
	public Address(int doorNo, String street, String city, String state, int pincode) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", street=" + street + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}
	
	

}
