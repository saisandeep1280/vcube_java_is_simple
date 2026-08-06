package com.poc;

import java.util.Scanner;

public class Employee {
	int employeeId;
	String employeeName;
	String employeeType;
	double basicSalary;
	void detalis() {
		Scanner sc = new Scanner (System.in); 
		System.out.println("Enter Your Employee Id : ");
		this.employeeId =sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Your Name : ");
		this.employeeName = sc.nextLine();
		System.out.println("Enter your Employee Type ");
		this.employeeType = sc.nextLine().toLowerCase();
		System.out.println("Enter Your Salary");
		this.basicSalary = sc.nextDouble();
		sc.close();
	}
}
