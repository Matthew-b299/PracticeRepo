package com;

public class CurrentAccount extends Account {
	private final int minBalance=5000;
	
	public CurrentAccount(int accountId, int customerId, double balance)
	{
		super(accountId,customerId,balance);
	}

	public void withdraw(double amount)
	{
		if(balance-amount<5000) {
			System.out.println("minimum balance should be 5000");
		}
		else {
			balance = balance-amount;
		}
	}
}
