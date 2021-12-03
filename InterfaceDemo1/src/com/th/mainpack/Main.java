package com.th.mainpack;

import com.th.ipack.*;
import com.th.tpack.ReportClass;
import com.th.tpack.TweetClass;

public class Main {

	public static void main(String[] args) {
		
		ReportClass rc = new ReportClass();
		System.out.println(rc.print());
		System.out.println(rc.show());
		
		Printable p = new ReportClass();
		System.out.println("thru printable ref: "+p.print());
		
		Showable s = new ReportClass();
		System.out.println("thru showable ref :"+s.show());
		
		TweetClass  c = new ReportClass();
		System.out.println(c.print());
		
		TweetClass c1 = new TweetClass();
		System.out.println(c1.print());
		
		
		
		

	}

}
