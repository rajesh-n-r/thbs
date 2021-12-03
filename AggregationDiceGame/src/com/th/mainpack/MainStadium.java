package com.th.mainpack;

import com.th.ppack.Player;

public class MainStadium {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		int p1Score = p1.play();
		int p1d1Score = p1.getD1Score();
		int p1d2Score = p1.getD2Score();
		System.out.println("P1 Scores: "+p1Score);
		System.out.println("P1 d1:"+p1d1Score+"  P1 d2:"+p1d2Score);
		
		
		Player p2 = new Player();
		int p2Score = p2.play();
		int p2d1Score = p2.getD1Score();
		int p2d2Score = p2.getD2Score();
		System.out.println("P2 Scores: "+p2Score);
		System.out.println("P2 d1:"+p2d1Score+"  P2 d2:"+p2d2Score);
		
		if (p1Score>p2Score)
			System.out.println("P1 won the game!!");
		else
			if (p1Score==p2Score)
				System.out.println("Game Draw!!");
			else
				System.out.println("P2 won the game!!!");
		
		

	}

}
