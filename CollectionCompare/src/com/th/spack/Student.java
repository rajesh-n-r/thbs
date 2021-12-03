package com.th.spack;

public class Student implements Comparable<Student> {

	private int regno;
	private String name;
	private int marks;
	
	public Student(int regno, String name, int marks) {
		super();
		this.regno = regno;
		this.name = name;
		this.marks = marks;
	}


	public int getRegno() {
		return regno;
	}



	public String getName() {
		return name;
	}



	public int getMarks() {
		return marks;
	}

	//compare two objects bsed on their fields in natural ordering
	//s1.compareTo(s2)
	@Override
	public int compareTo(Student s) {
		//asscending order
		//if(marks>s.marks)
		// decending order
		if(marks<s.marks)
			return 1;
		else
			if(marks==s.marks)
				return 0;
			else
				return -1;
		
	}

	@Override
	public String toString() {
		return "Student [regno=" + regno + ", name=" + name + ", marks=" + marks + "]";
	}

}
