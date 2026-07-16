package com.method;

public class TypeOfMethodDemo1 {
	void hello() {
		System.out.println("it is a method");
	}
	static void wellcome() {
		System.out.println("it is wellcome");
	}
	void mul() {
		int a =20;
		int b =30;
		System.out.println("it is "+a/b);	
	}
	
	public static void main(String[] args) {
		System.out.println("main method start");
		TypeOfMethodDemo1 t = new TypeOfMethodDemo1();
		t.hello();
		wellcome();
		t.mul();
	}

}
