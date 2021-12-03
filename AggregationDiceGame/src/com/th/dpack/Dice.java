package com.th.dpack;

import java.util.Random;

public class Dice {
	private int fValue;
	
	public int roll()
	{
		Random rand = new Random();
		fValue =  rand.nextInt(5)+1;// (diff between 6 and 1 )
		return fValue;

	}

	public int getfValue() {
		return fValue;
	}

	

	
	
	
	

}
