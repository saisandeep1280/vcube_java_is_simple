package com.loops;

import java.util.Scanner;

public class PrimeDemo {
	static boolean isPrime(int num) {
		boolean status = true;

		if (num==0 || num==1) {
			return false;
		}
		for (int i = 2; i <= num / 2; i++) {
			if (num% i == 0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		if (isPrime(num)) {
			System.out.println(num + " is a prime number.");
		} else {
			System.out.println(num + " is not a prime number.");
		}
		sc.close();
	}

}
