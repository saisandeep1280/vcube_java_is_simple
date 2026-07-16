package com.array;

import java.util.Arrays;

public class DuplicateArraay {

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,4};
	       Arrays.sort(arr);//112234
	       int[] temp = new int[arr.length];
	        int j = 0;
	        temp[j++] = arr[0];
		for(int i =0; i<arr.length-1; i++) {
			if(arr[i] != arr[i+1]) {
				System.out.print(arr[i]);
				temp[j++] = arr[i+1];
				
			}
		}
		System.out.println(arr[arr.length-1]);
		System.out.println(Arrays.toString(temp));
		int [] result	=Arrays.copyOf(temp, j);
		System.out.println(Arrays.toString(result));
	
		
	}

}
