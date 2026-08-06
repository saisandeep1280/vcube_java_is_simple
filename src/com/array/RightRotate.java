package com.array;

import java.util.Arrays;

public class RightRotate {

	public static void main(String[] args) {
	int[] arr = {1, 2, 3, 4, 5};
	int k=2;
	for(int i=1; i<=k;i++) {
		int last = arr[arr.length-1];
		for(int j =arr.length-1;j >0;j--) {
			arr[j]=arr[j-1];
		}
		arr[0]= last;
	}
	System.out.print("After Right Rotation : ");
	System.out.println(Arrays.toString(arr));
}


}
