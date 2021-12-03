package com.th.mainpack;

import java.util.Scanner;


import com.th.fpack.FileprocessClass;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileprocessClass fp = new FileprocessClass();
		
		while(true)
		  {
			  System.out.println("1. Add student record in the file ");
			  System.out.println("2. Display all students records from the file");
			  System.out.println("3. Exit");
			  
			  System.out.println("Enter your choice");
			  int choice = sc.nextInt();
			
			  
			  
			  switch(choice)
			  {
			  case 1:System.out.println("Enter student id");
			          int id = sc.nextInt();
			         System.out.println("Enter student name");
			          String name=sc.next();
			          System.out.println("Enter student marks");
			          int marks=sc.nextInt();
				       System.out.println(fp.WriteObject(id, name, marks)); 
				     
				      break;
			  case 2:
				     fp.ReadObjects();
				      
				     break;
				     
			  
				     
			  default:
				      sc.close();
				      System.out.println("Bye Bye ..... ");
				      System.exit(0);
				  
			 
			  }// switch case
			  
			  
		  }// while loop

	}

}
