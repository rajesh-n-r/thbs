package com.th.tpack;

import com.th.emppack.*;

public class Tax {
	
	public static double calcTax(Employee e)
	{
		// operator instanceof  which is used to find e is which type of instance / object 
		// whether e  is Manager instance or Programamer instance or employee instance
		
		if (e instanceof Manager)
			return(e.getBsal()*0.2);
		else
			 if (e instanceof Programmer)
				 return(e.getBsal()*0.15);
			 else
				  return(0);
	}

}
