package com.gutassignment;

public class Problem1 {

	public static void main(String[] args) {
		int [] a = {10,20,30};
		int [] b =a;
		b[1]=99;
		System.out.println(a[1]);
		int [] arr = {10,20,30};
		for(@SuppressWarnings("unused") int i :arr)
			i*=2;
		System.out.println(arr[1]);
		
	}

}
