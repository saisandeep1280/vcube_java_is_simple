package com.operators;

public class OperatorsDemo3 {

	public static void main(String[] args) {
		int a=10;
		int b= 20;
		double c= 20;
		System.out.println("**************************");
		System.out.println(a<b && a!=b && b==c);
		System.out.println(a<b|| a==b || b!=c);
		System.out.println(0&1);
		System.out.println(25 & 15);
		System.out.println(25 | 15);
		System.out.println(25 ^ 15);
		System.out.println(~36);
		System.out.println(~ -100);
		System.out.println(25 << 2);
		System.out.println(25>>2);
	}
}
