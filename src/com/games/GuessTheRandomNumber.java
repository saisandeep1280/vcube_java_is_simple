package com.games;

import java.util.Random;
import java.util.Scanner;

public class GuessTheRandomNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int r=ran.nextInt(11); // 0-10
		System.out.println("gues the number between 0 to 10");
		System.out.println("Enter the number  you want to guess");
		for(int i=1;i<=3;i++) {
			int n=sc.nextInt();
			if(n==r) {
				System.out.println("You guessed the number");
				break;
			}
			if(i==3) {
				System.out.println("Better luck next time");
			}
			else if(n>r) {
				System.out.println("Your guess is greater than the number");
			}
			else if (n<r){
				System.out.println("Your guess is less than the number");
			}
			
			
		}
		sc.close();
	}

}
