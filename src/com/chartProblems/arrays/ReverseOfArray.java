package com.chartProblems.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseOfArray {
	static void revese(int [] arr){
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the size of array : ");
		int size = sc.nextInt();
		int [] arr = new int[size];
		System.out.print("enter the number");
		for(int i=0; i<arr.length;i++) {
			arr[i]= sc.nextInt();
		}
		System.out.println("before revese order :" + Arrays.toString(arr));
		revese(arr);
		sc.close();
	}

}
