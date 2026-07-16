package com.array;

public class FindEvenOrOdd {

	public static void main(String[] args) {
		int [] arr = {6,5,8,6,2,3,7,5,9,0};
		for(int a:arr) {
			if(a%2==0) {
				System.out.println("this is even number :" + a + " ");
			}else {
				System.out.println("this is odd number :" + a + " ");
			}
		}
	}

}
