package com.constructor;

public class StudentCon {
	int id;
	String name;
	double marks;
	char result;
	public StudentCon() {
		this(100,"null",25,'n');
	}
	StudentCon(int id,String name){
		this(id,name,99,'p');
	}
	StudentCon(int id, String name ,double marks ){
		this(id,name,marks,'n');
	}
	public StudentCon(int id, String name, double marks, char result) {
		
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.result = result;
	}
	void studentinfo() {
		System.out.println("the student id : "+ id);
		System.out.println("the student name: "+name);
		System.out.println("the student marks: "+marks);
		System.out.println("the student result : "+result);
		System.out.println("-------------------------------------");
	}

	public static void main(String[] args) {
		StudentCon s = new StudentCon();
		s.studentinfo();
		StudentCon s1 = new StudentCon(101,"sandeep");
		s1.studentinfo();
		StudentCon s2 = new StudentCon(102,"zoro",56.5);
		s2.studentinfo();
	}
}
