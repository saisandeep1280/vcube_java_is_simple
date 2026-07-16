package com.chartProblems.arrays;


import java.util.Scanner;

public class CountPositiveNegativeNumbers {
	static void  number(int [] arr) {
		int positive =0;
		int negative =0;
		int zero =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				zero++;
			}else if(arr[i]>0) {
				positive++;
			}else {
				negative++;
			}
		}
		System.out.println("the positive number are :"+ positive);
		System.out.println("the negative number are :"+ negative);
		System.out.println("the zero number are :"+ zero);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the of the array : ");
		int size =sc.nextInt();
		int [] arr = new int[size];
		for(int i= 0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		number(arr);
		sc.close();
	}

}
