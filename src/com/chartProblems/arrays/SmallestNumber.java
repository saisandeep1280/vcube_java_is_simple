package com.chartProblems.arrays;


import java.util.Scanner;

public class SmallestNumber {
	static void smallestNumber(int a[]){
		int smallest = a[0];
		for(int i=1 ; i<a.length;i++) {
			if(a[i]<smallest) {
				smallest =a[i];
			}
		}
		System.out.println("the smallest number is :"+ smallest);
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
		smallestNumber(arr);
		sc.close();
	}

}
