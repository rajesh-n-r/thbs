package com.th.mainpack;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// adding two numbers 
		//int num1=10,num2=20;		
		// using Scnner class objects we can read data from console
		
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter two integers:");
				
		 int num1 = sc.nextInt();
		 int num2 = sc.nextInt();
		 int sum = num1+num2;		
		System.out.println("Result = "+sum);	*/	
		
		/*System.out.println("Enter a integer");
		int num = sc.nextInt();
		
		if (num%2==0)
			 System.out.println(num+" is a even number ");
		else
			System.out.println(num+" is a odd number ");*/
		System.out.println("Enter 3 numbers ");
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 int n3 = sc.nextInt();
		 
		 int l = (n1>n2)?n1:n2;
		 int lar = (l>n3)?l:n3;
		 
		 System.out.println("largest of 3 numbers: "+lar);
		// how to nest ternary operators 
		
		
		
		
		
		sc.close();
		

	}

}
