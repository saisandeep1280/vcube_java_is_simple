package com.operators;

import java.util.Scanner;

public class ExpressionDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int m =7;
		int n =m++ + --m + ++m;//7 + 7 + 8
		System.out.println(n);
		int x= 3;
		int y = x++ + ++x +x-- + --x;// 3 + 5 + 5 + 3
		System.out.println(y);
		System.out.println("Enter a Year to check if it is Leap Year or Not");
		int year  = sc.nextInt();

		if ((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) {

			System.out.println(year + " is aLeap Year");

		} else {

			System.out.println(year + " is Not a Leap Year");

		}
		sc.close();

	}

}
