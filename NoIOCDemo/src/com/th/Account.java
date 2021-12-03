package com.th;

public class Account {
	private int accId;
	private String accType;
	
	
	public Account() {
		super();
	}
	public Account(int accId, String accType) {
		super();
		this.accId = accId;
		this.accType = accType;
	}
	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", accType=" + accType + "]";
	}
	
	

}
