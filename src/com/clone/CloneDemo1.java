package com.clone;
class Student implements Cloneable{
	int sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public Student(int sid, String sname, Address address) {
		this.sid = sid;
		this.sname = sname;
		this.address = address;
	}
	
}
class Address{
	String city;

	public Address() {
	}

	public Address(String city) {
		this.city = city;
	}
	
}

public class CloneDemo1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Address a = new Address("srikakulam");
		Student s = new Student(101,"sandeep",a);
		System.out.println("Student id is : "+ s.sid);
		System.out.println("Student name is : "+ s.sname);
		System.out.println("Student city is : "+ s.address.city);
		System.out.println("***************************************************");
		Student s1 =(Student) s.clone();
		System.out.println("Student id is : "+ s1.sid);
		System.out.println("Student name is : "+ s1.sname);
		System.out.println("Student city is : "+ s1.address.city);
		System.out.println("***************************************************");
		s1.address.city="kotturu";
		System.out.println("Student id is : "+ s.sid);
		System.out.println("Student name is : "+ s.sname);
		System.out.println("Student city is : "+ s.address.city);
		System.out.println("***************************************************");
		System.out.println("Student id is : "+ s1.sid);
		System.out.println("Student name is : "+ s1.sname);
		System.out.println("Student city is : "+ s1.address.city);
		System.out.println("***************************************************");
	}

}
