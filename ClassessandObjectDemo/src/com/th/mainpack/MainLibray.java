package com.th.mainpack;

import java.util.Scanner;

import com.th.bookpack.Book;

public class MainLibray {

	public static void main(String[] args) {
		
	/*	// we need to create the instance of object using operator: new operator 
		Book book = new Book(100,"Java",300);
		
		System.out.println(book);   // toString() is implicitively called 
      // if the toString() is not implemented the book (which is object name gives the object reference)
		
		
		Book book1 = new Book(101,"C++",350);
		System.out.println(book1);
		*/
		Scanner sc = new Scanner(System.in);
		//Book book=null;
		
		//Arrays
		//int[]  arr = new int[5];
		Book[] bookarr = new Book[3];
		
		  int i=0;
		  while(true)
		  {
			  System.out.println("1. Create a book ");
			  System.out.println("2. Display all book details");
			  System.out.println("3. To search a book id");
			  System.out.println("4. Exit");
			  
			  System.out.println("Enter your choice");
			  int choice = sc.nextInt();
			
			  
			  
			  switch(choice)
			  {
			  case 1:System.out.println("Enter book id");
			          int bookId = sc.nextInt();
			         System.out.println("Enter book name");
			          String bookName=sc.next();
			          System.out.println("Enter book price");
			          double bookPrice=sc.nextDouble();
				      //Book book = new Book(bookId,bookName,bookPrice);
				      bookarr[i]=new Book(bookId,bookName,bookPrice);
				      i=i+1;
				      System.out.println("Book created sccessfully...");
				      break;
			  case 2:
				      for (Book ele:bookarr)
				      {
				     System.out.println(ele);
				      }
				     break;
				     
			  case 3:
				  System.out.println("Enter the bookid to search:");
				  int sbookid = sc.nextInt();
				  boolean flag=false;
			      for (Book ele:bookarr)
			      {
			    	   if (sbookid==ele.getBookId())
			    	   {
			     System.out.println(ele);
			            flag=true;
			            break;
			    	   }
			      }
			      if (flag==false)
			    	  System.out.println("Book not found ");
			     break;	     
				     
			  default:
				      sc.close();
				      System.out.println("Bye Bye ..... ");
				      System.exit(0);
				  
			 
			  }// switch case
			  
			  
		  }// while loop
		
		 
		
		
		
		
	}// main()

}// Main class
