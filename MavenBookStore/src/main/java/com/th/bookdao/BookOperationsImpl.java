package com.th.bookdao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.xdevapi.Statement;
import com.th.Model.Book;

public class BookOperationsImpl  implements BookOperations{
	private static Connection con=null;
	
	@Override
	public ArrayList<Book> getAllBooks() {
		
		ArrayList<Book> blist=new ArrayList<Book>();
		try {
			con=DBManager.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
		Statement st= (Statement) con.createStatement();
		ResultSet rs=((java.sql.Statement) st).executeQuery("Select * from book");
		while(rs.next()) {
			int bookId=rs.getInt(1);
			String bookName=rs.getString(2);
			int bookPrice=rs.getInt(3);
			
			Book book =new Book(bookId,bookName,bookPrice);
			blist.add(book);
		}
		
		}catch(SQLException e){
			
			e.printStackTrace();
		}
		return blist;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Book getABook(int bookId) throws SQLException {
		con=DBManager.getConnection();
		Book b=null;
		try {
			Statement st=(Statement) con.createStatement();
			ResultSet rs=((java.sql.Statement) st).executeQuery("Select * from book where book id "+bookId); bookPrice bookPrice = new bookPrice();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		Book b1=null;
		
		return null;
	}

	@Override
	public Book getABook(String bookname) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book getABookbyPrice(int bookprice) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
