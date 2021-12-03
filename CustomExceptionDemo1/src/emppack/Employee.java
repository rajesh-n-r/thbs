package emppack;

import exceptionpack.InsufficentLeaveException;

public class Employee {
	private int empId;
	private int bleave;
	public Employee(int empId, int bleave) {
		super();
		this.empId = empId;
		this.bleave = bleave;
	}
	
	public  String applyLeave(int n) throws InsufficentLeaveException
	{
		if (bleave<n)
			throw new InsufficentLeaveException("Insufficent Leave ......");
			else
			{
				bleave-=n;
				return ("Leave sanctioned....  Happy time enjoy!!!!");
			}
	}

}
