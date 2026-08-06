package com.oppspoc;

import java.util.Scanner;

public class Bank  extends BankAccount {
	Scanner sc = new Scanner(System.in);
	BankAccount b;
	void start() {
		System.out.println("Enter your Account number :");
		int accountNum= sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name :");
		String name= sc.nextLine();
		System.out.println("Enter your balance :");
		double balance = sc.nextDouble();
		b = new BankAccount(accountNum,name,balance);
		while(true) {
			System.out.println("======================WLLCOME BANK MENU========================");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Display Detalis");
			System.out.println("5.Exit");
			System.out.println("Enter choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1: {
				System.out.println("Enter your amount");
				b.deposit(sc.nextDouble());
				break;
			}
			case 2:{
				System.out.println("Enter your amount");
				b.withdraw(sc.nextDouble());
				break;
			}
			case 3: {
				b.checkBlance();
				break;
			}
			case 4: {
				b.displayDetalis();
				break;
			}	
			case 5: {
				System.out.println("Thank you for visiting bank"); 
				return;
			}
			default:{
				System.out.println("invalid choice");
			}
			}
		}
		
	}

}
