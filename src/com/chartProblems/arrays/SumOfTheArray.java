package com.chartProblems.arrays;

import java.util.Scanner;

public class SumOfTheArray {
    static int  sumofthearray(int n[]) {
    	int sum  =0;
    	for(int i=0;i<n.length;i++) {
    		sum += n[i];
    	}
    	return sum;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many element do you want to add :");
		int size = sc.nextInt();
		int [] arr = new int [size];
		System.out.print("enter the numbers the to add :");
		for(int i = 0; i<size;i++) {
			arr[i]= sc.nextInt();
		}
		int sum=sumofthearray(arr);
		System.out.println("the sum is :"+ sum);
		sc.close();
	}

}
