package com.patterns;

public class Pattern2 {

	public static void main(String[] args) {
		int i,j,k;
		for(i=0;i<4;i++) {
			if(i%2==0) {
				for(j=0;j<4;j++) {
					System.out.print("*");
				}
				System.out.println();

			}else {
				for(k=0;k<4;k++) {
					System.out.print("#");
				}

				System.out.println();
			}
		}
	}

}
