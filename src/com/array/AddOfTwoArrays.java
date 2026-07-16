package com.array;

import java.util.Arrays;

public class AddOfTwoArrays {

	public static void main(String[] args) {
		int [] a={10,15,26};
		int [] b= {14,56,85};
		int [] c =new int[3];
		for(int i =0;i<a.length;i++) {
			c[i]=a[i]+b[i];
		}
		System.out.println(Arrays.toString(c));
	}

}
