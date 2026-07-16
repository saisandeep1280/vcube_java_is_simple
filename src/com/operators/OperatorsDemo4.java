package com.operators;

public class OperatorsDemo4 {

	public static void main(String[] args) {
		double  a=10.5;
		double b =12.5;
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println("******************************");
		System.out.println(a>b&&b>a);
		System.out.println(a>b||b>a);
		System.out.println(a>b!=b>a);
		System.out.println("*****************************");
		int x=21;
		boolean result = (x%3==0?true : x%7==0?true:false);
		System.out.println("is  my number is div by 3 or 7 ..? "+result);
	}
}
