package com.th.pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Trying to do subfunction 
		Scanner sc = new Scanner(System.in);
		/*System.out.println("Enter a number");
		int num = sc.nextInt();*/
		
	/*	if (isPrime(num))
			System.out.println(num+" is prime");
		else
			System.out.println(num+" is not prime");*/
		
		
		// let the function name reversenum
		
		/*int rnum = reversenum(num);
		
		System.out.println("reverse of the given "+ num + "is :  "+rnum);*/
		
		
		/*long fact = factorial(num);
		System.out.println("factorial of "+num+"  =  "+fact);*/
		
		/*System.out.println("Enter the month number");
		int mno = sc.nextInt();
		
		String message = tofinddays(mno);
		
		System.out.println("the month no: "+mno+"   "+message);*/
		
		//int i=10;
		//  preincrement operator 
		//int ans = ++i;  // increment and assign 
		//System.out.println("ans:  "+ans+"  value of i: "+i);
		
		
		//post increment operator 
		/*int ans = i++; // assign and increment 
		System.out.println("ans:  "+ans+"  value of i: "+i);*/
		
		for (int i=1;i++<=10;i++)
		{
			System.out.print(i+"     ");
		}
		
		
		
		
		
		sc.close();
		
		
	}
	
	public static String tofinddays(int mno)
	{
		String msg="";
		
		switch(mno)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			      msg = "has 31 days";
			      break;
			      
		case 2: 
			    msg = "has 28 or 29 days";
			    break;
		case 4:
		case 6:
		case 9:
		case 11: 
			    msg ="has 30 days";
			    break;
		default:
			    msg="invalid month number";
		}
		
		 return msg;
	}
	
	
	
	public static long factorial(int num)
	{
		long f=1;
		for (int i=1;i<=num;i++)
		{
			f*=i;  // f= f*i;
		}
		return f;
	}
	
	
	public static int reversenum(int num)
	{
		int revnum =0;
		while(num!=0)
		{
			int rem = num%10;
			revnum = revnum*10+rem;
			num = num/10;
		}
		return revnum;
	}
	
	
	
	
	
	  public static boolean isPrime(int n)
	  {
		  
		  boolean  flag = true;		  
		  for (int i=2;i<=(n/2);i++)
		  {
			  if (n%i==0)
			  {
				  flag= false;
			      break;
			  }
		  }		    
		  return flag;		  
		  
	  }

}
