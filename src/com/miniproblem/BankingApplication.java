package com.miniproblem;

import java.util.Scanner;

class Sbi {
    String customerName;
    int pin;
    int balance;

    Sbi(String customerName, int pin, int balance) {
        this.customerName = customerName;
        this.pin = pin;
        this.balance = balance;
    }

    int deposit(int enterPIN, int depositamount) {
        if (enterPIN != pin) {
            System.out.println("invalid Pin");
            return balance;
        }
        if (depositamount <= 0) {
            System.out.println("enter a valid amount");
            return balance;
        }
        balance = balance + depositamount;
        System.out.println("amount deposit successfully");
        return balance;
    }

    int withDraw(int enterPIN, int withDrawAmount) {
        if (enterPIN != pin) {
            System.out.println("Wrong PIN");
            return balance;
        }
        if (withDrawAmount <= 0) {
            System.out.println("Invalid Withdraw Amount");
            return balance;
        }
        if (balance - withDrawAmount >= 500) {
            balance = balance - withDrawAmount;
            System.out.println("Amount Withdraw Successfully");
        } else {
            System.out.println("Insufficient Balance (Must maintain minimum 500 balance)");
        }
        return balance;
    }    

    void checkblance(int enterPIN) {
        if (enterPIN != pin) {
            System.out.println("invalid Pin");
            return;
        }
        System.out.println("your balance: " + balance);
    }

    void displayDetails() {
        System.out.println("========== ACCOUNT DETAILS ==========");
        System.out.println("Customer Name   : " + customerName);
        System.out.println("Current Balance : " + balance);
        System.out.println("=====================================");
    }
}

public class BankingApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sbi s = new Sbi("sandeep", 1234, 1000);

        while (true) {
            System.out.println("\n=================== Welcome To My Bank ======================");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter a choice : ");
            
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("enter your pin: ");
                    int a = sc.nextInt();
                    System.out.print("enter your deposit amount: ");
                    int b = sc.nextInt();
                    System.out.println("balance : " + s.deposit(a, b));
                    break;

                case 2:
                    System.out.print("enter your pin: ");
                    int c = sc.nextInt();
                    System.out.print("enter your withdraw amount: ");
                    int d = sc.nextInt();
                    System.out.println("balance : " + s.withDraw(c, d));
                    break;

                case 3:
                    System.out.print("enter your pin: ");
                    int e = sc.nextInt();
                    s.checkblance(e);
                    break;

                case 4:
                    s.displayDetails();
                    break;

                case 5:
                    System.out.println("Thank You For Using Banking Application");
                    sc.close(); 
                    System.exit(0);

                default:
                    System.out.println("invalid choice. Please try again.");
            }
        }
    }
}