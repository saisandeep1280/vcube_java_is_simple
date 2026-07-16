package com.loops;

import java.util.Scanner;

public class ReverseOfaNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number :");
		int n = sc.nextInt();
		sc.close();
		String a=" ";
		for(; n>0;) {
			int digit=n%10;
			a=a+digit;
			n=n/10;
			
		}
		System.out.println("the revese is : "+ a );
		
	}

}
