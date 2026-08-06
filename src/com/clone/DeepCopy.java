package com.clone;

class Address1 {
    String city;

    public Address1(String city) {
        this.city = city;
    }
}

class Student1 {

    int sId;
    String sName;
    Address1 address;

    // Parameterized Constructor
    public Student1(int sId, String sName, Address1 address) {
        this.sId = sId;
        this.sName = sName;
        this.address = address;
    }

    // Deep Copy Constructor
    public Student1(Student1 s) {
        this.sId = s.sId;
        this.sName = s.sName;

        // Create a new Address object
        this.address = new Address1(s.address.city);
    }

    // Display Method
    public void display() {
        System.out.println("Student Id   : " + sId);
        System.out.println("Student Name : " + sName);
        System.out.println("Student City : " + address.city);
        System.out.println("--------------------------------------");
    }
}

public class DeepCopy {

    public static void main(String[] args) {

        // Create Address Object
        Address1 address = new Address1("Srikakulam");

        // Create Original Student Object
        Student1 s = new Student1(101, "Sandeep", address);

        // Create Copy using Copy Constructor
        Student1 s1 = new Student1(s);

        System.out.println("========== BEFORE CHANGES ==========\n");

        System.out.println("Original Student");
        s.display();

        System.out.println("Copied Student");
        s1.display();

        // Modify only copied object
        s1.sId = 102;
        s1.sName = "Rahul";
        s1.address.city = "Hyderabad";

        System.out.println("\n========== AFTER CHANGES ==========\n");

        System.out.println("Original Student");
        s.display();

        System.out.println("Copied Student");
        s1.display();
    }
}