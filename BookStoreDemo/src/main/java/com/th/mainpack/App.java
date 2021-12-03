package com.th.mainpack;

import java.util.ArrayList;
import java.util.Scanner;

import com.th.bookdaopack.BookOperationsImpl;
import com.th.custpack.CustomerTransactionImpl;
import com.th.model.Book;
public class App 
{
    public static void main( String[] args )
    {
    	 Scanner sc = new Scanner(System.in);
    	 
    	 BookOperationsImpl  bop = new BookOperationsImpl();
    	 CustomerTransactionImpl ct = new CustomerTransactionImpl();
    	 while(true)
		  {
			  System.out.println("1.Display all books in the  BookStore ");// Admin, Customer
			   System.out.println("2. Search a Book- by id");//Admin Customer
			   System.out.println("3. Search a Book- by name");//Admin Customer
			   System.out.println("4. Search  Books- by price");//Admin Customer
			   System.out.println("5. Add a book to the BookStore");// Admin
			   System.out.println("6. Add books to the cart");// Customer
			   System.out.println("7. Billing ");
			   
			   
			 // System.out.println("6. Update the price of the book");
			//   
			  System.out.println("8. Exit");
			  
			  System.out.println("Enter your choice");
			  int choice = sc.nextInt();			  
			  
			  switch(choice)
			  {
			  case 1:	
				  
				     ArrayList<Book> blist = bop.getAllBooks();
				     for (Book b:blist)
				     {
				    	 System.out.println(b);
				     }		     
				        
				     break;
			  case 2:
				  System.out.println("Enter the bookid to be searched:");
		          int sbid = sc.nextInt();
		           Book book = bop.getABook(sbid) ;
		           if (book!=null)
		          System.out.println(book);
		           else
		        	   System.out.println("Book not found!!");
				  
				    break;
			  
				    
			  case 3:
				  System.out.println("Enter the bookname to be searched:");
		          String sbname = sc.next();
		           Book book1 = bop.getABook(sbname) ;
		           if (book1!=null)
		          System.out.println(book1);
		           else
		        	   System.out.println("Book not found!!");
				  
				    break;	
				    
			  case 4:
				  System.out.println("Enter the price  to be searched:");
		          int sbprice = sc.nextInt();
		           ArrayList<Book> plist = bop.getABookbyPrice(sbprice);
		           if (plist.size()==0)
		        	   System.out.println("Books with this price not found!!");   
		         
		           else
		           {
		        	   for (Book book2:plist)
		        	   {
		        		   System.out.println(book2);
		        	   }
		           }
		        	   
				  
				    break;	    
				    
			  	    
			  case 5:
				      System.out.println("Enter the book details to be added: ");
				      System.out.println("Enter book id");
			          int bid = sc.nextInt();
			          System.out.println("Enter book name");
			          String bname=sc.next();
			          System.out.println("Enter book price");
			          int bprice=sc.nextInt();	
			          Book book3 = new Book(bid,bname,bprice);
			          
			          System.out.println(bop.addABook(book3));
				        					     
				      break;
			  
			  
			  case 6:
				     while(true)
				     {
				    	String ch="Y"; 
				     
				      System.out.println("Enter the bookId to add to cart");
				      int bookId = sc.nextInt();
				      System.out.println("Enter the no. of copies");
				      int qty = sc.nextInt();
				      Book book4 = bop.getABook(bookId);
				      if (book4!=null)
				    	    ct.addToCart(book4, qty);
				      else
				    	  System.out.println("Book not found!!");
				      
				      System.out.println("Do you want to continue:");
				      ch = sc.next();
				      if (ch.charAt(0)=='N')
				    	  break; 
				  
				     }
			  case 7:
				   System.out.println(ct.gettId()+"    Total bill amount : "+ct.getBill());
				  break;
				  
				   
				     
				      
				      
				    
			/*  case 5:
						  System.out.println("Enter manager_id to be updated");
				          int umId = sc.nextInt();
				          System.out.println("Enter Department_id to be updated");
				          int udId = sc.nextInt(); 
				         
				          System.out.println(dop.setManagerId(udId, umId));
						  
						    break;  */  
				    
			  	    
			  default:
				      sc.close();
				      bop.closeConnection();
				      System.out.println("Bye Bye ..... ");
				      System.exit(0);
				  
			 
			  }// switch case
			  
			  
		  }// while loop
    }
}
