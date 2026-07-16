package com.method;

public class TypeOfMethod3 {
	double square(double side) {
		return side*side;
	}
	double circe (double rid) {
		double s =Math.PI*rid*rid;
		return s;
	}
	double rectangle(double length, double breth) {
		double e = length*breth;
		return e;
	}
	double triangle (double brth , double hegith) {
		double w =0.5*brth*hegith;
		return w;
	}
	public static void main(String[] args) {
		System.out.println("main method start");
		TypeOfMethod3 t = new TypeOfMethod3();
		System.out.println(t.square(52));
		System.out.println(t.rectangle(1500, 2000));
		System.out.println(t.triangle(1502, 1250));
		System.out.println(t.circe(1500));
		System.out.println("main method ended");
	}
}
