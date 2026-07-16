package com.array;


import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size");
		int size = sc.nextInt();
		int[] num =new int[size];
		for(int i=0; i<size;i++) {
		  num[i] = sc.nextInt();
		}
		int max =num[0];
		for(int i =1 ;i<num.length; i++) {
			if(max <num[i]) {
				max =num[i];
			}
		}
		System.out.println("the max number is :"+ max);
		sc.close();
	}

}
