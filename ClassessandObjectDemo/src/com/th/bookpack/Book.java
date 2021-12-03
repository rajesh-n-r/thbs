package com.th.bookpack;

public class Book {
	// variables by which we describe the book object is called instance variables
	// every object/instance created from book class will have their copies of instance variable
	// to save their variable values----> the state of the object 
	int bookId;
	String bookName;
	double bookPrice;	

	//plsease bind the methods which are using these instance variables 
	// the method which is used to create objects of a class is to be included within the class 
	//That specific function/ method which creates of object of the class is called as constructor 
	
	// constuctor is a special method which is used to create  object and give the intial values 
	//for the instace variables
	
	// Constructor will have same name that of the class
	//Purpose of the constructor is to intilize the values 
	// Constructor do not return any value
	// the keyword this.bookid, this.bookName, this.bookPrice  ----> this is a keyword in java 
	// this referes to the object/instance that is getting created 
	
	public Book(int bookId, String bookName, double bookPrice) {
		super();  // constructor of  of Object class is called here 
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}




	// to print the details of the object 
		// java provides a method called toString() which converts all the instance values to string 
		// the stringis going to be returned by toString() method 
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}




	public int getBookId() {
		return bookId;
	}




	public String getBookName() {
		return bookName;
	}




	public double getBookPrice() {
		return bookPrice;
	}




	


    
	
	
	
	
	
	
	
	
	

}
