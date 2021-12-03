package com.th.bookdaopack;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.th.model.Book;

public class BookOperationsImpl implements BookOperations {
	private static Connection con=DBManager.getConnection();	

	@Override
	public ArrayList<Book> getAllBooks() {
		 
		ArrayList<Book>  blist = new ArrayList<Book>();
		//con = DBManager.getConnection();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book");
			  while(rs.next())
			  {
				  int bookId = rs.getInt(1);
				  String bookName=rs.getString(2);
				  int bookPrice = rs.getInt(3);
				  Book book = new Book(bookId,bookName,bookPrice);
				  blist.add(book);
				  
			  }			  
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return blist;
	}

	@Override
	public Book getABook(int bookid) {
		
		//con = DBManager.getConnection();
		Book b = null;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book where bookid="+bookid);
			while (rs.next())
			{
				int bookId = rs.getInt(1);
				  String bookName=rs.getString(2);
				  int bookPrice = rs.getInt(3);
				b= new Book(bookId,bookName,bookPrice);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public Book getABook(String bookname) {
		//con = DBManager.getConnection();
		Book b = null;
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book where bookname='"+bookname+"'");
			while (rs.next())
			{
				int bookId = rs.getInt(1);
				  String bookName=rs.getString(2);
				  int bookPrice = rs.getInt(3);
				b= new Book(bookId,bookName,bookPrice);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return b;
	}

	@Override
	public ArrayList<Book> getABookbyPrice(int bookprice) {
		ArrayList<Book>  plist = new ArrayList<Book>();
		//con = DBManager.getConnection();
		
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from book where bookprice="+bookprice);
			  while(rs.next())
			  {
				  int bookId = rs.getInt(1);
				  String bookName=rs.getString(2);
				  int bookPrice = rs.getInt(3);
				  Book book = new Book(bookId,bookName,bookPrice);
				  plist.add(book);
				  
			  }			  
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return plist;
		
	}
	
	@Override
	public String addABook(Book book) {
		PreparedStatement ps = null;
		String str = "insert into book value (?,?,?)";
		try {
			ps = con.prepareStatement(str);
			ps.setInt(1, book.getBookid());
			ps.setString(2, book.getBookname());
			ps.setInt(3, book.getBookprice());
			ps.executeUpdate();
			return("Book added successfully!!!");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return(e.getMessage());
		}
	}
	
	
	
	 public void closeConnection()
	   {
		   try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }

	

}
