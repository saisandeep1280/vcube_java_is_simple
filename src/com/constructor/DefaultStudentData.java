package com.constructor;

public class DefaultStudentData {
	int studentid;
	String student;
	DefaultStudentData(){
		System.out.println("constructor is caller");
		 studentid= 80;
		 student = "srinivas";
	}
	DefaultStudentData(int studentid,String student){
		this.studentid =studentid;
		this.student =student;
	}
	  void data () {
		 System.out.println("studentid id :"+ studentid );
		 System.out.println("student name is : "+ student);
	 }

	public static void main(String[] args) {
		System.out.println();
		DefaultStudentData d1 = new DefaultStudentData();
		d1.data();
		DefaultStudentData d = new DefaultStudentData(45,"bob");
		d.data();
		
		
	}

}
