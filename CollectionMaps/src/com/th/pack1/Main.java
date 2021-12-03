package com.th.pack1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
public class Main {

	public static void main(String[] args) {
		//keys cannot be duplicaated in maps
		//hashmap is mot ordered map
		//it  organises the elements based in hashcode value
		Map<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(100,"Book");
		hm.put(200, "raj");
		hm.put(300, "raju");
		hm.put(200, "raj");
		hm.put(400, "ramaj");
		
		System.out.println(hm);
		
		hm.put(null, null);
		hm.put(250, null);
		System.out.println(hm);
		
		
		//linked hashmap  follows the order of insertion
		
		Map<Integer,String> lhm=new LinkedHashMap<Integer,String>();
		lhm.put(100,"Book");
		lhm.put(200, "raj");
		lhm.put(300, "raju");
		lhm.put(200, "raj");
		lhm.put(400, "ramaj");
		
		System.out.println(lhm);
		
		lhm.put(null, null);
		lhm.put(250, null);
		System.out.println(lhm);
		
		
		//tree map is sorted map
		//null as key not alllowed
		Map<Integer,String> thm=new TreeMap<Integer,String>();
		thm.put(100,"Book");
		thm.put(200, "raj");
		thm.put(300, "raju");
		thm.put(200, "raj");
		thm.put(400, "ramaj");
		
		System.out.println(thm);
		
		//thm.put(null, null);
		thm.put(250, null);
		System.out.println(thm);
	}

}
