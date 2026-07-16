package com.rough;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int a = sc.nextInt();
		System.out.println("enter b value");
		int b = sc.nextInt();
		int result = a*a + b*b +2*(a*b);
		System.out.println(result);
		sc.close();

	}

}
