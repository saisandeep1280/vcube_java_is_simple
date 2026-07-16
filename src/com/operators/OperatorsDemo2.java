package com.operators;

public class OperatorsDemo2 {

	public static void main(String[] args) {
		int a = 10;
		int b =11;
		double d= 0.5;
		d--;
		System.out.println(d);
		System.out.println(a++ + b++ + b-- + a-- - b++ - a++ + b++);
		System.out.println("a value : "+a);
		System.out.println("b value :"+b);
		System.out.println("d value :"+d);
	}

}
