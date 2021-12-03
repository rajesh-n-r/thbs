package com.th.tpack;

import com.th.ipack.Printable;
import com.th.ipack.Showable;

public class ReportClass extends TweetClass implements Printable,Showable {

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return "thru ReportClass: printing documents";
	}

	@Override
	public String show() {
		// TODO Auto-generated method stub
		return "Thru RepoartClass: showing documents";
	}

	
	
	

	

}
