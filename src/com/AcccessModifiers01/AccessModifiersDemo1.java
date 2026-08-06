package com.AcccessModifiers01;

public class AccessModifiersDemo1 {
 private AccessModifiersDemo1() {
		System.out.println("con called");
	}
	private void show() {
		System.out.println("method is called ");
	}
	private int a =3;
	private  String s ="bob";
	public static void main(String[] args) {
		AccessModifiersDemo1 t =new AccessModifiersDemo1();
		System.out.println(t.a);
		System.out.println(t.s);
		t.show();
	}

}
