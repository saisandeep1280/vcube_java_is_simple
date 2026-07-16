package com.loops;

import java.util.Scanner;

public class FebboniccSeiesDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value :");
		int a=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1 + " "+ n2 +" ");
		for(int i=1;i<=a;i++) {
			int n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(n3 +" ");
		}
		sc.close();

	}

}
