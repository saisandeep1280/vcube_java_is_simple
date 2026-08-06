package com.oops;

public class EncapsulationDemo1 {
	private int eid;
	private String name;
	private short age;
	private double salary; 
	public void setEid(int eid) {
		this.eid=eid;
	}
	public int getEid() {
		return eid;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setAge(short age) {
		this.age =age;
	}
	public short getAge() {
		return age;
	}
	public void setSalary(double salary) {
		if(salary>0)
		this.salary =salary;
		else
			System.out.println("invalid amount");
	}
	public double getSalary() {
		return salary;
	}
}
