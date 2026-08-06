package com.chartProblems.arrays;

import java.util.Scanner;

public class SearchingDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter you number to in which index : ");
		int n =sc.nextInt();
		boolean b= false;
		int [] arr = { 1, 2, 3, 4, 5 };
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("the index number is : "+i);
				b = true;
				break;
			}
		}
		if(!b) {
			System.out.println("number is found in the index");
		}
		sc.close();
	}
}
