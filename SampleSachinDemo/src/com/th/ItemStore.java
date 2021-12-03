package com.th;

public class ItemStore {
	IntemInterface intem;
	
	
	
	
	public ItemStore(IntemInterface item) {
		super();
		this.intem = item;
	}




	void doSomething()
	{
		intem.print();
	}
	

}
