package com.th;

public class Item implements IntemInterface {
	private  int id;

	public Item(int id)
	{
		this.id=id;
	}
	@Override
	public void print() {
		System.out.println(id);
		
	}
	
	

}
