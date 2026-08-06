package com.miniproblem;

import java.util.Scanner;

public class Loan {
	static Scanner sc = new Scanner(System.in);

	boolean moblieNumber() {
		System.out.print("Enter your moblie Number: ");
		String mobile = sc.next();
		boolean b =	mobile.matches("[6-9]{1}[0-9]{9}");
		return b;
	}
	boolean  aadharNumber() {
		System.out.print("Enter Your Aadher Number:");
		String aadhar = sc.next();
		boolean b= aadhar.matches("[3-9]{1}[0-9]{11}");
		return b;
	}
	boolean  panNumber() {
		System.out.print("Enter Your Pan Number:");
		String pan = sc.next();
		boolean b=pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
		return b;
	}
	String name() {
		sc.nextLine();
		System.out.print("Enter Your Name: ");
		String name = sc.nextLine();
		return name;
	}
	int age() {
		System.out.print("Enter Your Age: ");
		int age =sc.nextInt();
		return age;
	}
	double salary() {
		System.out.print("Enter Your Salary: ");
		double salary =sc.nextDouble();
		return salary;
	}
	int cibilInfo() {
		System.out.print("Enter Your cibil Score :");
		int cibil = sc.nextInt();
		return cibil;
	}

	double cibilScore() {
		System.out.print("Enter Your Cibil Score: ");
		double score = sc.nextDouble();
		String rating;
		String action;
		double insterstRate =10.3; 
		if (score >= 750 && score <= 900) {
			rating = "Excellent";
			action = "Instant Approval, Lowest Interest Rates, Pre-approved Offers.";
			return insterstRate = insterstRate-2.0;
		} else if (score >= 650 && score <= 749) {
			rating = "Good/Fair";
			action = "Standard Approval, Average Interest Rates, Mild Documentation.";
			return  insterstRate = insterstRate-1.0;
		} else if (score >= 550 && score <= 649) {
			rating = "Average/Poor";
			action = "Conditional Approval, High Interest Rates, Requires Collateral/Guarantor.";
			return  insterstRate = insterstRate+1.0;
		} else if (score >= 300 && score <= 549) {
			rating = "Critical/Poor";
			action = "High Risk of Rejection, Past Defaults Detected.";
			return  insterstRate = insterstRate+2.0;
		} else if (score == -1) {
			rating = "No History (NH/NA)";
			action = "New to Credit. Lenders will evaluate based on income/employment.";
			return insterstRate = insterstRate+3.5;
		} else {
			rating = "Invalid Score";
			action = "Please enter a value between 300 and 900, or -1.";
			
		}
		System.out.println("Interest Rate: " + insterstRate + "%");
		System.out.println("CIBIL Score: " + score);
		System.out.println("Category: " + rating);
		System.out.println("Lender Decision: " + action);
		return insterstRate;
	}
}

