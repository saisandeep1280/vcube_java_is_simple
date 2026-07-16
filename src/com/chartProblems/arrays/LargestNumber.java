package com.chartProblems.arrays;

import java.util.Scanner;

public class LargestNumber {
	static void largeNumber(int a[]){
		int largest = a[0];
		for(int i=1 ; i<a.length;i++) {
			if(a[i]>largest) {
				largest =a[i];
			}
		}
		System.out.println("the largest number is :"+ largest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the size of the element :");
		int size =sc.nextInt();
		int [] arr = new int [size];
		System.out.print("enter the numbers :");
		for(int i =0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		largeNumber(arr);
		sc.close();
	}

}
