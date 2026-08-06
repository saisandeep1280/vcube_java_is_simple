package com.oopspolymorphism;

public class PolymorphismDemo2 {

	public static void main(String[] args) {
		PolymorphismDemo2 p = new PolymorphismDemo2();
		p.method();
//		 p.method((byte)11);
//		 p.method((short)100); 
//		 p.method(11);
//		 p.method((long)15);
//		 p.method((float)11);
		 p.show(10,20);

	}
//	void show( float f ,int i) {
//		System.out.println("no int , float method  called");
//	}

	void show(int i, float f) {
		System.out.println("no int , float method  called");
	}

	void method() {
		System.out.println("no arg method  called");
	}

	void method(byte b) {
		System.out.println("no byte method  called");
	}

	void method(short s) {
		System.out.println("no short method  called");
	}

	void method(int i) {
		System.out.println("no int method  called");

	}

	void method(long l) {
		System.out.println("no long method  called");
	}

	void method(float f) {
		System.out.println("no float method  called");

	}

	void method(double i) {
		System.out.println("no double method  called");

	}

	void method(char i) {
		System.out.println("no char method  called");

	}

	void method(boolean i) {
		System.out.println("no boolean method  called");
	}

}
