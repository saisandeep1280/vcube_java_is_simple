package com.method;
class Student{
	int studentId;
	String studentName;
	static String collegeName;
	double marks;
	 static int count;
	void displayWelcome() {
		System.out.println("welcome to student management");
	}
	void setStudentDetalis(int studentId1 ,String studentName1, double marks1) {
		studentId =studentId1;
	    studentName = studentName1;
		marks =marks1;
		System.out.println("student id     :"+studentId);
		System.out.println("Student name   :"+studentName);
		System.out.println("Stundent marks :"+marks);
	}
	double getmarks() {
		return marks;
	}
	double calculateBonusMarks(double bonus) {
		marks = marks+bonus;
		return marks;
	}
	void displayCollegeName() {
		collegeName = "krishna university";
		System.out.println("the college name is: "+collegeName);
	}
	void totalStudentsCount() {
		count =1500;
		System.out.println("total number of Students are :" + count );
	}
}
public class Management {
	public static void main(String[] args) {
		Student s = new Student();
		s.displayWelcome();
		s.setStudentDetalis(1, "bob", 79.85);
		System.out.println(s.getmarks());
		s.calculateBonusMarks(12);
		System.out.println(s.getmarks());
		s.displayCollegeName();
		s.totalStudentsCount();
	}
}
