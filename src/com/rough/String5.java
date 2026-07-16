package com.rough;

public class String5 {

	public static void main(String[] args) {
		String str ="java is easy";
		String[]  s =str.split(" ");
		for(String word:s) {
			String rev = "";
			for(int i=word.length()-1;i>=0;i--) {
				rev +=word.charAt(i);
				
			}
			System.out.print(rev + " ");
		}
		
		
		

	}

}
