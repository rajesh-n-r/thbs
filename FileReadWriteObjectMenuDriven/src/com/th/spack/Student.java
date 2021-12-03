package com.th.spack;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private int marks;
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
