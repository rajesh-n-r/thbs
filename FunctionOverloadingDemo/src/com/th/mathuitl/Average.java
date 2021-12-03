package com.th.mathuitl;

public class Average {
	
	public static double avg(double d,float f ,int ...nums) // nums act as integer array 
	{
		 double sum =0;
		 
		 for ( int n:nums)
		 {
			 sum+=n;
		 }
		 
		return(sum/(double)(nums.length+2));
	}
	
	

}
