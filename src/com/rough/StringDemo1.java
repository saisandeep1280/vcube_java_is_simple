package com.rough;

public class StringDemo1 {

	public static void main(String[] args) {
		String s ="java123@r#";
		int letter =0;
		int number= 0;
		int special =0;
		for(char c : s.toCharArray()) 
		{
			if(Character.isLetter(c)) 
			{
				letter++;
			}else if(Character.isDigit(c))
			{
				number++;
			}else {
				special++;
			}
		}
		System.out.println(letter);
		System.out.println(number);
		System.out.println(special);
	}
}
