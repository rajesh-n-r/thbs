package com.th.custpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.th.model.Book;

public class CustomerTransactionImpl implements CustomerTransaction {
	private static int count=1;
	private final int tId;
	
	private ArrayList<Book> slist = new ArrayList<Book>();
	private Map<Integer,Integer> smap = new HashMap<Integer,Integer>();
	public CustomerTransactionImpl() {
		this.tId=count++;
	}

	public int gettId() {
		return tId;
	}

	@Override
	public String addToCart(Book book, int qty) {
		slist.add(book);
		smap.put(book.getBookid(), book.getBookprice()*qty);
		return "Book added to the cart";
	}

	@Override
	public double getBill() {
		
		int totamt=0;
		for (Integer key:smap.keySet())
		{
			totamt +=smap.get(key);
		}
		return totamt;
	}
	

}
