package com.oopsInheritance;

class A extends Object {
	A() {
		super();
		System.out.println("This is class A constructor");
	}
	void display() {
		System.out.println("This is class A");
	}
}
class B extends A {
	B() {
		super();
		System.out.println("This is class B constructor");
	}
	@Override
	void display() {
		System.out.println("This is class B");
	}
}
public class TestDemo2 extends B {
	TestDemo2() {
		super();
		System.out.println("This is class TestDemo2 constructor");
	}
	void display() {
		System.out.println("This is class TestDemo2");
	}
	public static void main(String[] args) {
		TestDemo2 obj = new TestDemo2();
		obj.display();
	}
}
