package com.th.cpack;

import com.th.apack.Address;
import com.th.spack.Student;

public class MainCollege {

	public static void main(String[] args) {
		
      Address addrs = new Address(17,"Dream Medow street","Bangalore","Karnataka",560030);
      Student s1 = new Student(1000,"Riya",addrs);
      System.out.println(s1);
		

	}

}
