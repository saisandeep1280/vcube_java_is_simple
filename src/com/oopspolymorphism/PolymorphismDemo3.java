package com.oopspolymorphism;

public class PolymorphismDemo3 {

	public static void main(String[] args) {
		PolymorphismDemo3  p = new PolymorphismDemo3();
		String s = new String ("sai");
		String s2 =null;
		p.name("sandeep");
		p.name(s);
		p.name(s2);
//		The method name(Integer) is ambiguous for the type PolymorphismDemo3
//		p.name(null);
	}
//	void name(Integer in) {
//		System.out.println("Str method called");
//		System.out.println(in);
//	}
	void name(String str) {
		System.out.println("String method called : "+ str);
	}
	void name(Object obj) {
		System.out.println("obj method called");
		System.out.println(obj);
	}
}
