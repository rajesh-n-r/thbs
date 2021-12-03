package com.th.model;

public class Book {
	private int bookid;
	private String bookname;
	private int bookprice;
	public Book(int bookid, String bookname, int bookprice) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookprice = bookprice;
	}
	public int getBookid() {
		return bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public int getBookprice() {
		return bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
	}
	
	

}
