package com.th.pack1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*int[] arr = {10,20,30,40,50}; // we are defining the array with elements
		
		
		System.out.println("Printing array elements :");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"    ");
		}*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		
		// declare the array with size n 
		int[] arr = new int[n];
		
		// Reading the elements of arr thru console
		int sum =0;
		System.out.println("Enter the elements of the array");
		for (int i=0;i<arr.length;i++)
		{
			arr[i] = sc.nextInt();
			sum+=arr[i];
		}
		
		/*System.out.println(" The sum of elements of arr : "+sum);
		
		// Enhanced for loop for traversing the elements in the array 
		
		for (int ele:arr)
		{
			System.out.print(ele+"    ");
		}*/
		
		System.out.println("Enter the element to be serached..");
		int ele = sc.nextInt();
		int pos = searcharray(ele,arr);	
		if (pos==-1)
			 System.out.println("element not found.....");
		else
			System.out.println(ele+" element found in index value: "+pos);
			  
		sc.close();
			

	}
	
	public static int searcharray(int ele, int[] arr)
	{
		 int pos=-1;
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]==ele)
			{
				pos =i;
				break;
			}
			
		}
		 return pos;
	}

}
