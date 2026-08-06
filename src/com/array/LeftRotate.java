package com.array;

import java.util.Arrays;

public class LeftRotate {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int k=2;
		for(int i=1; i<=k;i++) {
			int first = arr[0];
			for(int j =0;j <arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]= first;
		}
		System.out.print("After Left Rotation : ");
//		for(int arr1:arr) {
//			System.out.print(arr1 + " ");
//		}
		System.out.println(Arrays.toString(arr));
	}
}