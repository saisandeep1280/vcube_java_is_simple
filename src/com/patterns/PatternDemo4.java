package com.patterns;

public class PatternDemo4 {

	public static void main(String[] args) {
		  for (int i = 0; i <= 6; i++) {

	            // Print leading spaces
	            for (int j = 0; j < i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars
	            for (int k = 6; k >= i; k--) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	}

}
