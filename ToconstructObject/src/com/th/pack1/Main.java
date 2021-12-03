package com.th.pack1;

public class Main {

	public static void main(String[] args) {
		
		Item  item1 = new Item(100,"Book",500); 
		
		Item item2 = new Item();
		item2.setItemId(200);
		item2.setItemName("Pens");
		item2.setItemPrice(400);
		
		System.out.println(item1);
		System.out.println(item2);

	}

}
