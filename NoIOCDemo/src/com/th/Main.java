package com.th;

public class Main {

	public static void main(String[] args) {
		
		/*Address address = new Address("17","DM street","Bangalore","Karnataka","560030"); 
		Customer cob = new Customer(100,"Nancy",address);*/
		
		
		Address address = new Address();
		address.setDoorNo("17");
		address.setStreet("DM");
		address.setCity("Bangalore");
		address.setState("Karnataka");
		address.setPin("560030");
		
		
		
		Customer cob = new Customer();
		cob.setCustId(100);
		cob.setCustName("Rachana");
		cob.setAddress(address);
		
		System.out.println(cob);
		System.out.println(cob.getAddress().getCity());
		System.out.println(cob.getAddress());
		
		
		

	}

}
