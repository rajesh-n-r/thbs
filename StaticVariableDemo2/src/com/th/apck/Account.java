package com.th.apck;

import java.util.Random;

public class Account {
	
	private static long accnoValue;
	private final long  accNo; // final ----> we cannot change its value (constants)
	 String accType;// if no access specifier , it  has a default specifier 
	                // default ------>  package friendly 
	private double balance;
	
	static {
		accnoValue=0;
		}
	

	public static long getAccnoValue() {
		//return (++accnoValue);
		
		Random rand = new Random();
		accnoValue = rand.nextInt(3000)+2000;
		return accnoValue;
	}



	public Account(String accType, double balance) {
		super();
		this.accNo=getAccnoValue();  // accNo is final, once assigned cannot be changed 
		this.accType = accType;
		this.balance = balance;
	}
	
	public    double deposit(double amount)
	{
		balance+=amount;
		return balance;
	}
	
	public double withdraw(double amount)
	{
		balance-=amount;
		return balance;
	}



	public double getBalance() {
		return balance;
	}



	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accType=" + accType + ", balance=" + balance + "]";
	}
	
	

}
