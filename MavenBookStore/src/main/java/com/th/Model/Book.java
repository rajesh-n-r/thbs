package com.th.Model;

public class Book {
	private int bookId;
	private String nookName;
	private int bookPrice;
	public Book(int bookId, String nookName, int bookPrice) {
		super();
		this.bookId = bookId;
		this.nookName = nookName;
		this.bookPrice = bookPrice;
	}
	public int getBookId() {
		return bookId;
	}
	public String getNookName() {
		return nookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", nookName=" + nookName + ", bookPrice=" + bookPrice + "]";
	}
	
	

}
