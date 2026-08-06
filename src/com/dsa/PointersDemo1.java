package com.dsa;

import java.util.Arrays;
import java.util.Scanner;

public class PointersDemo1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter your number : ");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int target = 15;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] + arr[j] == target) {
					System.out.print(i + " ->" + j + " : ");
					System.out.println(arr[i] + "+" + arr[j] + "= " + target);
				}
			}
		}
		sc.close();
	}

}
