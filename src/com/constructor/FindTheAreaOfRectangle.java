package com.constructor;

public class FindTheAreaOfRectangle {
	int length;
	int breadth;
	FindTheAreaOfRectangle(){}
	FindTheAreaOfRectangle(int length, int breadth){
		this.length =length;
		this.breadth=breadth;
	}
	void value() {
		int area =length *breadth;
		System.out.println("length is : "+ length);
		System.out.println("breath is : "+ breadth);
		System.out.println("Area is : "+area);
	}
	public static void main(String[] args) {
		FindTheAreaOfRectangle f = new FindTheAreaOfRectangle();
		f.value();
		FindTheAreaOfRectangle f1 = new FindTheAreaOfRectangle(50,80);
		f1.value();
		FindTheAreaOfRectangle f2 = new FindTheAreaOfRectangle(5,8);
		int area =f2.length *f2.breadth;
		System.out.println("length is on : "+ f2.length);
		System.out.println("breath is on : "+ f2.breadth);
		System.out.println("Area is on  : "+area);	
		}

}
