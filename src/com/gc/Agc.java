package com.gc;

class student{
	int sid;
	String sname;
	@SuppressWarnings("removal")
	@Override
	protected void finalize() throws Throwable {
		System.out.println("it is finalize");
		super.finalize();
	}
}
public class Agc {
	public static void main(String[] args) {
		student s= new student();
		student s1= new student();
		student s2= new student();
		student s3= new student();
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		int a =0x6f539caf;
		System.out.println(a);
		s=s1;
		s2=null;
		System.gc();
	}

}
