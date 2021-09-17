package com;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SavingAccount sa = new SavingAccount(1,50001,10000);
		
		System.out.println("AccountId: "+ sa.accountId);
		System.out.println("CustomerId: "+ sa.customerId);
		System.out.println("AccountBalance: "+ sa.balance);
		
		System.out.println(" ");
		System.out.println("Amount before deposit: " + sa.getBalance());
		sa.deposit(1000);
		System.out.println("Amount after deposit: " + sa.getBalance());
		
		System.out.println(" ");
		sa.deposit(60000,"ABC123XY");
		System.out.println("Amount after deposit: " + sa.getBalance());
		CurrentAccount ca = new CurrentAccount(2,70002,11000);
	
		
		//System.out.println("Amount before withdraw" + a.getBalance());
		//a.withdraw(10000);
		//System.out.println("Amount after withdraw" + a.getBalance());
		
		//a=sa;
		
		//System.out.println("amount before withdraw from sa" + a.getBalance());
		//a.withdraw(10000);
		//System.out.println("amount after withdraw from sa:" +a.getBalance());
		
		
		
		System.out.println("Amount after withdraw: ");
		System.out.println("AccountId: "+ ca.accountId);
		System.out.println("CustomerId: "+ ca.customerId);
		System.out.println("AccountBalance: "+ ca.balance);
		
	}

}
