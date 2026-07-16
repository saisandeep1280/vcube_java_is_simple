package com.array;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("enter your row : ");
		int m =sc.nextInt();
		System.out.print("enter your column : ");
		int n =sc.nextInt();
		int [] [] arr = new int[m][n]; 
		System.out.println("enter your number :");
		for(int i =0; i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++ ){
				arr[i][j]=sc.nextInt();
			}
			
		}
//		int[][] arr = {
//				{9,5,1},
//				{3,2,4},
//				{5,3,1},
//		};
		System.out.println("before transoseMatrix ");
		for(int i= 0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("After transoseMatrix");
		for(int i =0; i<arr.length;i++) {
			for(int j=i;j<arr[i].length; j++) {
				int temp = arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		for(int i =0;i<arr.length;i++) {
			for(int j =0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		sc.close();

	}
}
	