package com.array;

import java.util.Arrays;

// int [] arr= {10,20,30,40,50,60};
//  o/p {30,40,60,80,100,110};
public class DemoArray2 {

	public static void main(String[] args) {
		int [] arr= {10,20,30,40,50,60};
			arr[0]= arr[0]+arr[1];
			arr[arr.length-1] = arr[arr.length-1] +arr[arr.length-2];
			for(int i =1; i<arr.length-1;i++) {
				arr[i]=arr[i]*2;
			}
			System.out.println(Arrays.toString(arr));
			
			
//			int [] arr= {10,20,30,40,50,60};
//			int n = arr.length;
//			int d = arr[n-2];
//			arr[0]= arr[0]+arr[1];
//			
//			for(int i =1; i<n-1;i++) {
//				arr[i]=arr[i]*2;
//			}
//			arr[n-1] = arr[n-1] + d;
//			System.out.println(Arrays.toString(arr));
	}

}
