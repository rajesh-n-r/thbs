package com.th.pack1;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//queues in java are implemented using linked list
		Queue<String> q=new LinkedList<String>();
		q.add("java");
		q.add("Java Script");
		q.add(".Net");
		q.add("HTML5");
		System.out.println(q);
		System.out.println(q.poll());;
		System.out.println(q);
		System.out.println(q.peek());
		System.out.println(q);
		
		
	}

}
