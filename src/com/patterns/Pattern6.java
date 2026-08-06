package com.patterns;

public class Pattern6 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(i==j) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
