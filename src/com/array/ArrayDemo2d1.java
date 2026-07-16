package com.array;

public class ArrayDemo2d1 {

	public static void main(String[] args) {
		int [][] arr = { 
				{9, 5, 1}, 
				{3, 2, 4}, 
				{5, 3,1},
				{7, 6,2}
		};
		for(int i =0; i <arr.length;i++) {
		   if(i%2==0) {
			   for(int j=arr[i].length-1;j>=0;j--) {
				   System.out.print(arr[i][j]+"  ");
			   }
			   System.out.println();
		   }else {
			   for(int k =0; k<arr[i].length; k++ ) {
				   System.out.print((int)Math.pow(arr[i][k], 2)+"  ");
			   }
			   System.out.println();
		   }
		}
	}

}
