package pack1;

import java.util.Date;

public class Person {
	private int pId;
	private Date dob;
	public Person(int pId, Date dob) {
		super();
		this.pId = pId;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person [pId=" + pId + ", dob=" + dob + "]";
	}
	
	
	
	

}
