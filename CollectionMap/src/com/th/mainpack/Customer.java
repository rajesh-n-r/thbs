package com.th.mainpack;

public class Customer {
	private int id;
	private String name;
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	

}
