package com.rough;

public class Swap1 {

	public static void main(String[] args) {
		int a =10;
		int b =20;
		System.out.println("before Swap");
		System.out.println("a: "+a);
		System.out.println("b: "+ b);
		int temp = b;
		b=a;
		a= temp;
		System.out.println("after swap");
		System.out.println("a: "+a);
		System.out.println("b: "+ b);
		int c =25;
		int d =30;
		System.out.println("before Swap");
		System.out.println("a: "+c);
		System.out.println("b: "+ d);
		c =c+d;
		d=c-d;
		c =c-d;
		System.out.println("after swap");
		System.out.println("a: "+c);
		System.out.println("b: "+ d);
	}
}
