package com.array;

public class PrimaryAndSecondary {

	public static void main(String[] args) {
		int [] [] arr= {
				{1,2,3,1},
				{4,5,6,2},
				{7,8,9,3},
				{7,8,9,4}
		};
		int sum =0;
		int n =arr.length;
		for(int i =0;i<arr.length;i++) {
			sum = sum + arr[i][i];
			sum =sum +arr[i][n-1-i];
		}
		if(n%2==1) {
			sum =sum -arr[n/2][n/2];
		}
		System.out.println("sum :"  +sum);
	}
}
