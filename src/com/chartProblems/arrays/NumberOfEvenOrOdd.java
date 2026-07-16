package com.chartProblems.arrays;

public class NumberOfEvenOrOdd {
	static void evenOrOdd(int arr[]) {
		int odd = 0 ;
		int even = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				even++;
			}else
				odd++;
		}
		System.out.println("the even numbers are :"+ even );
		System.out.println("the odd numbers are :"+ odd);
	}
	public static void main(String[] args) {
		int []arr = {15,25,24,36,75,99,45,75,22,10,20,33};
		evenOrOdd(arr);
	}
}
