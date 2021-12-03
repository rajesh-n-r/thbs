package com.th.mainpack;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		//sets does not allow any duplicate values
		//HashSet  
		Set s1=new HashSet();
		s1.add(1);
		s1.add("good boy raj");
		s1.add(null);
		s1.add(12.12);
		
		
		//hashset doesn't follow the order of insertion
		//it orders the objects based on its hashcode
		System.out.println(s1);
		
		//lets give  a generic type to our set
		//i need all elements in this structure set to be of strings
		Set<String> s2=new HashSet<String>();
		s2.add("aaa");
		s2.add("bbb");
		s2.add("ccc");
		System.out.println(s2);
		
		
		//linked HashSet 
		//does not allow duplicate values
		Set<String> s3=new LinkedHashSet<String>();
		s3.add("aaa");
		s3.add("bbb");
		s3.add("ccc");
		s3.add("aaa");
		s3.add("bbb");
		System.out.println(s3);
	
		
		//tree set
		//duplicates not allowed
		//sorted set sorting according to the natural ordering
		Set<String> s4=new TreeSet<String>();
		s4.add("arun");
		s4.add("harsha");
		s4.add("raj");
		s4.add("zeen");
		System.out.println(s4);
	}

}
