package com.th.bookdao;

import java.sql.SQLException;
import java.util.ArrayList;

import com.th.Model.Book;

public interface BookOperations {
	
	ArrayList<Book> getAllBooks();
	Book getABook(int bookId) throws SQLException;
	Book getABook(String bookname);
	Book getABookbyPrice(int bookprice);

}
