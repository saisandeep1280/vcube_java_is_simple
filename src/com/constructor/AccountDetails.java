package com.constructor;
class Account{
	
	public Account() {
	}
	
	public Account(int accountNumber, String accountHolderName) {
		
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
	}

	int accountNumber;
	String accountHolderName;
}
class SavingsAccount extends Account {
	
	public SavingsAccount() {
		
	}

	public SavingsAccount(int balance) {
		super(101,"sandeep");
		this.balance = balance;
	}

	int balance;
	void Accountinfo(){
		System.out.println("the accountNumber is :"+accountNumber);
		System.out.println("the accountHolderName is:"+accountHolderName);
		System.out.println("the balance is :"+balance);
	}
}


public class AccountDetails extends SavingsAccount  {

	public static void main(String[] args) {
		
		AccountDetails a =new AccountDetails();
		a.Accountinfo();
	}

	public AccountDetails() {
		super(150000);
	}

}
