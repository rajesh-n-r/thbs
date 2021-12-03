package com.th.mainpack;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Map<String,Integer> pmap =new HashMap<String,Integer>();
		pmap.put("sofa",5000);
		pmap.put("center",3000);
		pmap.put("lamps",3000);
		pmap.put("lampshades",2000);
		
		System.out.println(pmap.keySet());
		System.out.println(pmap.values());
		System.out.println(pmap.entrySet());
		
		System.out.println("Printimg the map elements");
		for(String key:pmap.keySet()) {
			System.out.println(key+"    "+pmap.get(key));
		}
		int totamt=0;
		for(String key:pmap.keySet()) {
			totamt+=pmap.get(key);
		}
		System.out.println("Total amount invested in showroom :"+totamt);
		
		
		
		Map<String,String> smap =new TreeMap<String,String>();
		smap.put("Karnataka","bangalore");
		smap.put("kerala","Trivandram");
		smap.put("andra pradesh","ananthapur");
		smap.put("telangana","hyderabad");
		
		for(String key:smap.keySet()) {
			System.out.println(key+"  "+smap.get(key));
		}
	
		
		Map<Customer,Integer> Custmap=new LinkedHashMap<Customer,Integer>();
		Custmap.put(new Customer(10,"raj"),5000);
		Custmap.put(new Customer(11,"raja"),15000);
		Custmap.put(new Customer(12,"raju"),51000);

	int totsalesamt=0;
	for(Customer cust:Custmap.keySet()) {
		totsalesamt+=Custmap.get(cust);
	}
	
	System.out.println(totsalesamt);
	}

}
