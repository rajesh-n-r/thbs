package com.th.mainpack;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Java world";
		String str2="Java world";
		String str4="Java world";
		System.out.println(str1==str2);
		String str3=new String("Java world");
		System.out.println(str1==str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str4));
		
	        System.out.println("----------------------------------");
	         //Strings are immutable ---> we cannot change its contents 
	        String str10="Welcome";
	        System.out.println(str10.length());
	        System.out.println(str10.charAt(0));
	        System.out.println(str10.toLowerCase());
	        System.out.println(str10);
	        System.out.println(str10.toUpperCase());
	        System.out.println("--------------------------------------");
	        String str11 = str10.toLowerCase();
	        System.out.println(str11);
	        System.out.println(str10);

	        String str12 = "My mother Earth";

	        //lowerlimit = 4  ,  upperlimit = 10   -----> 4 to 9 index values will be takenfor substring
	        System.out.println(str12.substring(3, 9));
	        //extraction of substring is 1 less the upper limit 
	         // 3,4,5,6,7,8

	        System.out.println(str10.replace('e', 'i'));
	        System.out.println(str10.replace("We","Hel"));

	        // integer to String
	        int i=10;
	        String istr = String.valueOf(i);
	        System.out.println(istr);

	        String s="200";
	        int si = Integer.parseInt(s);
	        System.out.println(si);

	        String str14="Welcome to Java World.";
	        String[] words = str14.split(" ");
	        for (String word:words)
	        {
	            System.out.println(word);
	        }

	        StringTokenizer st = new StringTokenizer("http://10.123.43.56://65",":");
	        while(st.hasMoreTokens())
	        {
	            System.out.println(st.nextToken());
	        }


	 
	 }
	 
	
}


