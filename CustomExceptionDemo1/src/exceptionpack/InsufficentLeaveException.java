package exceptionpack;
//this custom exception is registred as unchecked exception
//public class InsufficentLeaveException extends Runtime 

// this custom exception is registred as checked exception
public class InsufficentLeaveException extends Exception {
	private String msg;

	public InsufficentLeaveException(String msg) {
		super();
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return msg;
	}

	
	
	
	

}
