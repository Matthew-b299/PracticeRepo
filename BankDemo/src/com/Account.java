package com;

abstract public class Account {
	protected int accountId;
	protected int customerId;
	protected double balance;
	
	public Account(int accountId, int customerId, double balance) {
		this.accountId=accountId;
		this.customerId=customerId;
		this.balance=balance;
		
	}
	
	public void deposit(double amount)
	{
		balance=balance + amount;
	}
	
	public void deposit(double amount, String panNumber){
		System.out.println("Verify pan Number");
		balance = balance + amount;
	}

	public abstract void withdraw(double amount);
	
	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
