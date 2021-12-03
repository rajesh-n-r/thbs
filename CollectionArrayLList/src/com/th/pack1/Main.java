package com.th.pack1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// dynamically growing increases to 50% of current size
		//default size is 10
		//duplicates allowed
		
		List<String> alist=new ArrayList<String>(15);
		alist.add("meera");
		alist.add("mani");
		alist.add("anil");
		alist.add("raj");
		alist.add("raju");
		System.out.println(alist);
		
		List<String> slist=new ArrayList<String>();
		slist.add("one");
		slist.add("two");
		slist.add("three");
		slist.add("four");
		alist.addAll(1,slist);
		System.out.println(alist);
		alist.add(1,"raghu");
		System.out.println(alist);
		
		for(int i=0;i<alist.size();i++) {
			System.out.print(alist.get(i)+"  ");
		
		}
		System.out.println();
		//enhanced for loop
		for(String s:alist) {
			System.out.println(s+"   ");
		}
		//iterator class ref for  iterating
		Scanner sc=new Scanner(System.in);
		System.out.println("no. of elements in the array");
		int n=sc.nextInt();
		ArrayList<Integer> ilist=new ArrayList<Integer>();
		System.out.println("Enter the elements in the array ");
		for(int i=0;i<n;i++) {
			int ele=sc.nextInt();
			ilist.add(ele);
		}
		int sum=0;
		//iterator class ref is used to iterate any collection
		Iterator<Integer> it=ilist.iterator();
		while(it.hasNext()) {
			int e=it.next();
			System.out.println(e+"  ");
			sum+=e;
		}
		
		System.out.println("sum= "+sum);
		sc.close();
	}

}
