package com.th.bookdaopack;

import java.util.ArrayList;

import com.th.model.Book;

public interface BookOperations {
	
	   ArrayList<Book> getAllBooks();
	    Book getABook(int bookid);
	    Book getABook(String bookname);
	    ArrayList<Book> getABookbyPrice(int bookprice);
	    String addABook(Book book);

}
