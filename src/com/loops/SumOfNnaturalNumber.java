package com.loops;

import java.util.Scanner;

public class SumOfNnaturalNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number");
		int sum =sc.nextInt();
		int total=0;
		for(int i=0;i<=sum;i++) {
			total = total+i;
		}
		System.out.println(total);
		sc.close();
	}

}
