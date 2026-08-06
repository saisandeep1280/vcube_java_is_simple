package com.poc;

public class PayrollSystem extends NetSalary {
	public static void main(String[] args) {
		PayrollSystem p = new PayrollSystem();
		p.detalis();
		p.calculateNetSalary();
		p.displayDetails();
	}
}
