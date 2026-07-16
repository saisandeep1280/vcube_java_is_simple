package com.whileloops;

import java.util.Scanner;

public class WhileExcludeNUM {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a starting range value :");
		int m=sc.nextInt();
		System.out.print("enter a ending range value :");
		int n =sc.nextInt();
		while (m<n) {
			System.out.println(m);
			m++;
		}
		
		sc.close();
	}

}
