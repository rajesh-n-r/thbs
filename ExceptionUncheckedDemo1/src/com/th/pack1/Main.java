package com.th.pack1;

public class Main {

	public static void main(String[] args) {
		
		//String s1="";
		//String s2 ="";
		int result =0;
		// the commandLine argument  name: args    type: String[]
		try {  // anticipated block
		int n1  = Integer.parseInt(args[0]);
	    int n2 = Integer.parseInt(args[1]) ;
	    result = n1/n2;
		}
		
		catch(ArrayIndexOutOfBoundsException e)  // exception handler 
		{
			System.out.println("Error occured due to insufficent inputs..  "+e.getMessage());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input types......"+e.getMessage());
			//e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division by zero not defined..."+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Exception occurred ....");
		}
		
		finally { // whether or not exception encountered finally block statements will be executed 
			System.out.println("Result: "+result);
		}
	    
         System.out.println("Bye!!!!!");
	}

}
