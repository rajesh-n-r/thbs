package com.th;

public class Main {

	public static void main(String[] args) {
		
		IntemInterface i1 = new Item(100);
		
		ItemStore is= new ItemStore(i1);
		
		i1.print();
		

	}

}
