package com.th;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Customer {
	private int custid;
	private String custname;
	private int custbal;
	public int getCustid() {
		return custid;
	}
	public String getCustname() {
		return custname;
	}
	public int getCustbal() {
		return custbal;
	}
	
	
}
