package com.th.ppack;

import com.th.dpack.Dice;

public class Player {
	private Dice d1;
	private Dice d2;
	
	
	public Player() {
		super();
		d1 = new Dice();
		d2 = new Dice();
	}
	
	public int play()
	{
		return(d1.roll()+d2.roll());
	}
	
	public int getD1Score()
	{
		return(d1.getfValue());
	}
	
	public int getD2Score()
	{
		return(d2.getfValue());
	}
	
	
	
	
	

}
