package com.array;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a size of array");
		int size =sc.nextInt();
		int evenCount=0;
		int oddCount=0;
		int []  a= new int[size];
		System.out.println("enter the element");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
			if(a[i]%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("evenCount is :"+ evenCount);
		System.out.println("oddCount is :"+ oddCount);
		sc.close();
	}

}
