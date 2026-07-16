package com.loops;

import java.util.Scanner;

public class TableDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to print its multiplication table: ");
		int num = sc.nextInt();
		System.out.println("how many times do you want to print the table? ");
		int times = sc.nextInt();
		System.out.print("Multiplication table of " + num + ":");

		for (int i = 1; i <=  times;i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}	
		sc.close();
	}

}
