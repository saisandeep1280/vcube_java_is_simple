package com.operators;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("Before swap : a value : "+a);
		System.out.println("Before swap : b value :"+b);
		int c =a;
		a=b;
		b=c;
		System.out.println("----------------------------------");
		System.out.println("After swap : a value : "+a);
		System.out.println("After swap : b value :"+b);
		System.out.println("----------------using arithmetic operators--------------------------");
		int x = 10;
		int y = 20;
		System.out.println("Before swap : x value : "+x);
		System.out.println("Before swap : y value :"+y);
		x=x+y;
		y=x-y;
		x=x-y;
	
		System.out.println("----------------------------------");
		System.out.println("After swap : x value : "+x);
		System.out.println("After swap : y value :"+y);
		
		
	}
}
