package model;

public class BabyprocessImpl {
	
	public static String processWt(Baby baby)
	{
		if ((baby.getWeight()>0)&&(baby.getWeight()<2.5))
			return "Under nourished baby";
		else
			if ((baby.getWeight()>=2.5)&&(baby.getWeight()<3.5))
				 return "Healthy baby";
			else
				 return "Over nourished baby";
	}
	
	
	

}
