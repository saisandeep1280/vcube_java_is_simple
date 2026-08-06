package com.oops;

public class TestEncapsulationDemo1 {

	public static void main(String[] args) {
		System.out.println("main method started");
		EncapsulationDemo1 e = new EncapsulationDemo1();
		e.setEid(100);
		e.setName("sandeep");
		e.setAge((short) 22);
		e.setSalary(10000.10);
		System.out.println(e.getEid());
		System.out.println(e.getName());
		System.out.println(e.getAge());
		System.out.println(e.getSalary());

		EncapsulationDemo1 e1 = new EncapsulationDemo1();
		e1.setEid(101);
		e1.setName("sandy");
		e1.setAge((short) 20);
		e1.setSalary(1000000.10);
		System.out.println(e1.getEid());
		System.out.println(e1.getName());
		System.out.println(e1.getAge());
		System.out.println(e1.getSalary());
	
	}

}
