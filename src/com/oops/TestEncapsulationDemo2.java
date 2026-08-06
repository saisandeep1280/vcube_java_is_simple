package com.oops;

public class TestEncapsulationDemo2 {

	public static void main(String[] args) {
		
		System.out.println("main method started");
		EncapsulationDemo2 s = new EncapsulationDemo2();
		s.setSid(100);
		s.setSname("sandeep");
		s.setSage((short) 22);
		s.setSmarks(100000.10);
		System.out.println(s);
		EncapsulationDemo2 s1 = new EncapsulationDemo2(101, "sandy",  (short) 21, 1500000.10);
		System.out.println(s1);
		}
}
