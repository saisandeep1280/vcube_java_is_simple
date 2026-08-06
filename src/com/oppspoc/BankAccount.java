package com.oppspoc;

public class BankAccount {
	private int  accountNumber;
	private String accountHolderName;
	private double balance;
	BankAccount(){}
	BankAccount(int accountNumber,String accountHolderName,double balance){
		this.accountNumber=accountNumber;
		this.accountHolderName=accountHolderName;
		this.balance = balance;
	}
	void deposit(double amount) {
		if(amount>0) {
			balance = balance+amount;
			System.out.println("₹" + amount + " deposit successfully.");
		}else {
			System.out.println(" invalid deposit Amount");
		}
	}
	void withdraw(double amount ) {
		  if (amount <= 0) {
	            System.out.println("Invalid amount.");
	        } else if (balance >= amount) {
	            balance -= amount;
	            System.out.println("₹" + amount + " withdrawn successfully.");
	        } else {
	            System.out.println("Insufficient balance.");
	        }
	}
	void checkBlance() {
		System.out.println("current balance is: ₹"+balance);
	}
	void displayDetalis() {
		System.out.println("--------------------Account Details------------------------");
		System.out.println("Account Holder  Number :"+ accountNumber);
		System.out.println("Account Holder Name    :"+accountHolderName);
		System.out.println("Account Balance        :₹"+balance);
	}
}
