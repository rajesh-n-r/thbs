package com.th.pack1;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		
		//stack follow LIFO rule
		Stack<String> st=new Stack<String>();
		st.push("raj");
		st.push("ravi");
		st.push("raju");
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		st.push("ram");
		System.out.println(st);
		System.out.println(st.search("raj"));
		System.out.println(st.search("ram"));
	}

}
