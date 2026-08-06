package com.patterns;

public class Pattern7 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=6;i++) {
			for(j=1;j<=6;j++) {
				if(i>=2 && i<=5 && j>1 && j<6){
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
