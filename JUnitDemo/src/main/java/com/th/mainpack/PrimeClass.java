package com.th.mainpack;

public class PrimeClass {

	public boolean isPrime(int num) {
		boolean flag=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) 
				flag=false;
		
		}
		return flag;
	}
}
