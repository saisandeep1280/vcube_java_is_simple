package com.loops;

import java.util.Scanner;

public class PerfectDemo {
	static boolean perfect(int n) {
		boolean b =false;
		int result = 0;
		for(int i =1; i<=n/2;i++) {
			if(n%i==0) {
				result = result+i;
			}
		}
		if(result==n) {
			b= true;
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		boolean bo=perfect(num);
		if(bo) {
			System.out.println("is a perfect number");
		}else {
			System.out.println("is a not perfect number");
		}
		sc.close();
	}

}
