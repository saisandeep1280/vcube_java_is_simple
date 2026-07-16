package com.array;

public class LeaderInArray {

	public static void main(String[] args) {

		int[] arr = {16, 17, 4, 3, 5, 2};
		int n = arr[arr.length-1];

		System.out.println("Leaders in the array are: ");
		for (int i= arr.length-1;i>=0;i--) {
			if(arr[i]>=n) {
				n= arr[i];
				System.out.println(n);
			}
		}
	}
}


