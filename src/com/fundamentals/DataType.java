package com.fundamentals;

public class DataType {

	public static void main(String[] args) {
		// Primitive Data Types
		int myInt = 42;
		double myDouble = 3.14;
		boolean myBoolean = true;
		char myChar = 'A';

		System.out.println("Integer: " + myInt);
		System.out.println("Double: " + myDouble);
		System.out.println("Boolean: " + myBoolean);
		System.out.println("Character: " + myChar);

		// Non-Primitive Data Types
		String myString = "Hello, World!";
		int[] myArray = {1, 2, 3, 4, 5};

		System.out.println("String: " + myString);
		System.out.print("Array: ");
		for (int num : myArray) {
			System.out.print(num + " ");
		}
	}
}
