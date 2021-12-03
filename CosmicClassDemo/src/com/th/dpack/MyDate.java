package com.th.dpack;

public class MyDate {
	
	private int dd;
	private int mm;
	private int yy;
	
	public MyDate(int dd, int mm, int yy) {
		super();
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
	}
	
	
	
	
	
	

	@Override
	public int hashCode() {
		final int prime=31;
		int result =1;
		result = prime*result+dd;
		result = prime*result+mm;
		result = prime*result+yy;	
		
	 //	result = dd^mm^yy;
		
		return  result ;
	}







	@Override
	public boolean equals(Object obj) {
		MyDate d = (MyDate)obj; // downcasting  obj to d 
		if ((dd==d.dd)&&(mm==d.mm)&&(yy==d.yy))
			return true;
		else
		
		return false;
	}







	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
	}
	
	
	
	

}
