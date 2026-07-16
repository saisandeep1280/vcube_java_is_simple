package com.method;

import java.util.Scanner;

public class TypeOfMethod2 {
	static Scanner sc = new Scanner(System.in);
	double getsal() {
		
		System.out.println("Enter the salary:");
		double salary =sc.nextDouble();
		return salary;
	}
	double getbonus() {
		
		System.out.println("enter the bouns:");
		double bonus = sc.nextDouble();
		return bonus;
	}
	double getgst() {
	
		System.out.println("enter the gst:");
		double gst = sc.nextDouble();
		return gst;
	}
	public static void main(String[] args) {
		System.out.println("the main method start");
		TypeOfMethod2 t = new TypeOfMethod2();
		double sal=t.getsal();
		double bouns =t.getbonus();
		double gst=t.getgst();
		System.out.println("enter the total salary: "+(sal+bouns-gst));
		System.out.println("the main method ended");
	}

}
