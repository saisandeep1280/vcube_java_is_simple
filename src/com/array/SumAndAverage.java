package com.array;

public class SumAndAverage {

	public static void main(String[] args) {
		int[] arr= {5,25,45,70,16,30,80,12,100};
		int sum =0;
		int average = 0;
		for(int  i=0; i<arr.length;i++) {
			sum = sum + arr[i];
		}
		average = sum / arr.length;
		System.out.println("the sum of the number is :" + sum);
		System.out.println("the average of the number is :" + average);

	}

}
