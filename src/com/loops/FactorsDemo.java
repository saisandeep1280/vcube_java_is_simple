package com.loops;

import java.util.Scanner;

public class FactorsDemo {
	static void fact(int n) {
		
		for(int i=1; i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
			}
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number :");
		int s = sc.nextInt();
		fact(s);
		sc.close();
	}




}
