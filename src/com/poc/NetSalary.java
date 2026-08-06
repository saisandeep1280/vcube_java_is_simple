package com.poc;

public class NetSalary extends Employee {
	double netSalary;
	void calculateNetSalary() {
		if(employeeType.equalsIgnoreCase("fulltime")) {
			netSalary = basicSalary + (basicSalary * 0.20) + (basicSalary * 0.10);
		}
		else if(employeeType.equalsIgnoreCase("parttime")) {
			netSalary = basicSalary + (basicSalary * 0.05);
		}
		else if(employeeType.equalsIgnoreCase("contract")) {
			netSalary = basicSalary;
		} else {
			System.out.println("Invalid Employee Type");
		}
	}
	void displayDetails() {
		System.out.println("Employee Id : " + employeeId);
		System.out.println("Employee Name : " + employeeName);
		System.out.println("Employee Type : " + employeeType);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Net Salary : " + netSalary);
	}

}
