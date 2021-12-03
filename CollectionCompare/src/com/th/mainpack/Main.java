package com.th.mainpack;

import java.util.ArrayList;
import java.util.Collections;

import com.th.spack.Student;

public class Main {

	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		
		slist.add(new Student(100,"raj",75));
		slist.add(new Student(200,"raju",65));
		slist.add(new Student(300,"ravi",85));
		slist.add(new Student(400,"raghu",75));
		slist.add(new Student(500,"ram",55));
		
		for(Student s: slist) {
			System.out.println(s);
		}
		
		Collections.sort(slist);
		System.out.println("sorted list");
		for(Student s:slist) {
			System.out.println(s);
		}
	}

}
