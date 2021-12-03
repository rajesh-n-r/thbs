package model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
	@Table(name="Book")
	public class Book {
		
		@Id
		private int bookid;
		private String bookname;
		private int bookprice;
		public Book() {
			
	     }
		public int getBookid() {
			return bookid;
		}
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}
		public String getBookname() {
			return bookname;
		}
		public void setBookname(String bookname) {
			this.bookname = bookname;
		}
		public int getBookprice() {
			return bookprice;
		}
		public void setBookprice(int bookprice) {
			this.bookprice = bookprice;
		}
		@Override
		public String toString() {
			return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookprice=" + bookprice + "]";
		}
		
		
		
		
		
		

}
