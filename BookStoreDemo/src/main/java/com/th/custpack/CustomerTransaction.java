package com.th.custpack;

import com.th.model.Book;

public interface CustomerTransaction {
	
	String addToCart(Book book,int qty);
	double getBill();

}
