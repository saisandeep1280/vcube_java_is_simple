package com.oopsInheritance;
class Apple {
	 void show() {
		System.out.println("Apple class show method");
	}
	 public void show1() {
		 System.out.println("Apple class show1 method");
	 }
	 int add(int a, int b) {
		 return a + b;
	 }
	 private void display() {
		 System.out.println("Private display method in Apple class");
	 }
	 protected void display1() {
		 System.out.println("Private display method in Apple class");
	 }
	public static void main(String[] args) {
		
		Apple apple = new Apple();
		apple.show();
		int sum = apple.add(5, 10);
		System.out.println("Sum: " + sum);
		apple.display();
		apple.show();
	}
}

public class TestDemo extends Apple {
	@Override
	public void show1() {
		System.out.println("TestDemo class show1 method");
	}
	@Override
	protected void show() {
		System.out.println("TestDemo class show method");
	}
	@Override
	int add(int a, int b) {
		System.out.println("TestDemo class add method");
		return a * b;
	}
	@Override
	public void display1() {
		System.out.println("Protected display method in TestDemo class");
	}

	public static void main(String[] args) {
		System.out.println("*****************************************");
//		TestDemo t = (TestDemo) new Apple();
		Apple a = new Apple();
		int result=a.add(5, 7);
		System.out.println("Result: " + result);
//		Apple.main(args);
		a.show();
		a.show1();
		a.display1();
		System.out.println("*****************************************");
		Apple ap = new TestDemo();
		int sum = ap.add(15, 19);
		System.out.println("Sum: " + sum);
		ap.show();
		ap.show1();
		ap.display1();
		System.out.println("*****************************************");
		TestDemo t = new TestDemo();
		t.show();
		int re =t.add(5, 10);
		System.out.println("Result: " + re);
	}

}
class TestDemo1 extends TestDemo {
	@Override
	public void show1() {
		System.out.println("TestDemo1 class show1 method");
	}
	@Override
	public void show() {
		System.out.println("TestDemo1 class show method");
	}
	@Override
	int add(int a, int b) {
		System.out.println("TestDemo1 class add method");
		return a - b;
	}
	@Override
	public void display1() {
		System.out.println("Protected display method in TestDemo1 class");
	}

	public static void main(String[] args) {
		TestDemo1 t = new TestDemo1();
		t.show();
		int re =t.add(5, 10);
		System.out.println("Result:" + re);
		t.show1();
		t.display1();
		System.out.println(t.hashCode());
	
	}
}
