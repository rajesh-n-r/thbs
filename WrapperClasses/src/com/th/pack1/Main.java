package com.th.pack1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int i=10;
		 //boxing------> t0 wrapper class
		 Integer wInt=new Integer(i);
		 System.out.println(wInt);
		 
		 //unboxing 
		 int i1=wInt.intValue();
		 System.out.println(i1);
		 
		 //autoboxing
		 Integer wInt1=i;
		 int i2=wInt1.intValue();
		 
		 String st="123";
		 int n1=Integer.parseInt(st);
		 int x1=Integer.valueOf(st).intValue();
		 System.out.println(n1+"  "+x1);
		 String dst="12.345";
		 double d1=Double.parseDouble(dst);
		 double x2=Double.valueOf(dst).doubleValue();
	}

}
