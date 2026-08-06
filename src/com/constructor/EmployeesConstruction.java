package com.constructor;

public class EmployeesConstruction {
	int empid;
	String empName;
	int salary;
	EmployeesConstruction()
	{
		empid =0;
		empName="unknown";
		salary = 100000;
	}
	EmployeesConstruction (int id, String name , int sal){
		this.empid =id;
		this.empName= name;
		this.salary= sal;
	}
	void empinfo() {
		System.out.println("employee id is : "+ empid );
		System.out.println("employee name is : "+ empName );
		System.out.println("employee salary is : "+ salary );
	}
	
	public static void main(String[] args) {
		EmployeesConstruction e = new EmployeesConstruction();
		e.empinfo();
		EmployeesConstruction e1 = new EmployeesConstruction(101,"sandeep",200000);
		e1.empinfo();
	}

}
