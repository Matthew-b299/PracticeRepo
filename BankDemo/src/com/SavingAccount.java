package com;

public class SavingAccount extends Account {

	public static final int rateOfInterest=7;
	
	public SavingAccount(int accountId, int customerId, double balance)
	{
		super(accountId,customerId,balance);
	}
	
	public void withdraw(double amount) {
		if(balance-amount<1000) {
			System.out.println("Minimum balance should be 1000");
			
		}
		else {
			balance=balance-amount;
		}
	}
}
