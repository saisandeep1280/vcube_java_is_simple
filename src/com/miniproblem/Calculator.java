package com.miniproblem;

import java.util.Scanner;

public class Calculator {
	void add() {
		int a=98;int b=76;int c=99;
		System.out.println("the addition of two number is "+(a+b+c));
	}
	void add(int a,int b) {
		System.out.println("the subtraction of two number is "+(a+b));
	}
	void  add1(int c,int d) {
	int sum = c+d;
		System.out.println("the mult of two number"+ sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator c = new Calculator();
//		System.out.println("enter the three number");
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();
		c.add();
		int p = sc.nextInt();
		int q = sc.nextInt();
		c.add(p, q);
		c.add1(10,5);
		sc.close();
	}
}
