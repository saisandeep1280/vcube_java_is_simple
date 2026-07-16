package com.rough;

public class Demo1 {
	byte age;
	short subject;
	int rollNo;
	long moblieNo;
	float att;
	double amount;
	char grade;
	public static void main(String[] args) {
		Demo1 d =new Demo1();
		d.age =15;
		d.subject=6;
		d.rollNo = 59;
		d.moblieNo =987654321;
		d.att=99.98f;
		d.amount =30000;
		d.grade ='A';
		int a = d.grade;
		System.out.println(d.age);
		System.out.println(d.subject);
		System.out.println(d.rollNo);
		System.out.println(d.moblieNo);
		System.out.println(d.att);
		System.out.println(d.amount);
		System.out.println(d.grade);
		System.out.println(a);

	}

}
