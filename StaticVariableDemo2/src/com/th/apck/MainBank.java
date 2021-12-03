package com.th.apck;

import com.th.apck.Account;

public class MainBank {

	public static void main(String[] args) {
		
		Account account1 = new Account("Savings account",5000);
		System.out.println(account1);
		System.out.println("Balance after deposit: "+account1.deposit(6000));
		System.out.println("Balance after withdraw: "+account1.withdraw(1000));
		System.out.println("Current balance in the account: "+account1.getBalance());
		System.out.println(account1);
		
		System.out.println(account1.accType);
		
		Account account2 = new Account("Fixed Account",10000);
		System.out.println(account2);
		

	}

}
