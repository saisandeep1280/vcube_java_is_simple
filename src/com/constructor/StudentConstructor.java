package com.constructor;

public class StudentConstructor {
	int stuId;
	String stuName;
	int marks;
	long stuAdr;
	StudentConstructor(){
		stuId =100;
		stuName="not know";
		marks=35;
		stuAdr=0;		
	}
	StudentConstructor(int stuId,String stuName,int marks,long stuAdr){
		this.stuId = stuId;
		this.stuName =stuName;
		this.marks =marks;
		this.stuAdr=stuAdr;
	}
	StudentConstructor (int stuId,String stuName){
		this.stuId = stuId;
		this.stuName =stuName;
	}
	void studentinfo() {
		System.out.println("the id of student :"+ stuId);
		System.out.println("the student name :"+ stuName);
		System.out.println("the student marks :"+ marks);
		System.out.println("the student adr :"+ stuAdr);
		System.out.println("----------------------------");
	}
	void studentinfo2() {
		System.out.println("the id of student :"+ stuId);
		System.out.println("the student name :"+ stuName);
		System.out.println("--------------------------------");
	}
	public static void main(String[] args) {
		StudentConstructor s = new StudentConstructor();
		s.studentinfo();
		StudentConstructor s1 = new StudentConstructor(101,"sandeep",100,431837445645L);
		s1.studentinfo();
		StudentConstructor s2 = new StudentConstructor(102,"alice");
		s2.studentinfo2();
	}
}