package com.chartProblems.arrays;

import java.util.Scanner;

public class FindTheAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("how many element do you want to do average :");
		int size = sc.nextInt();
		double [] arr = new double[size];
		System.out.print("enter the number :");
		for(int i=0;i<size; i++) {
			arr[i]=sc.nextDouble();
		}
		double avg =sumaveage(arr);
		System.out.println("the avg of the number is :"+ avg);
		sc.close();
	}

	static double sumaveage(double [] arr) {
		double avg =0;
		for(int i=0; i<arr.length;i++) {
			avg +=arr[i]; 
		}
		return (double) avg/arr.length;
	}
}