package com.method;

public class DemoMethods1 {
	static double  d;
	void add(int a ,int b) {
		System.out.println("it is add method :"+(a+b));
		d = d+a+b;
		add(15,12,25);
		System.out.println("the d value :"+d);
	}
	static void add(int a, int b , int c) {
		System.out.println("it is add method :"+(a+b+c)/10);
		d =d+(a+b+c)/10;
	}
	void oddOrEven(int a) {
		if(a%2==0) {
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd");
		}
	}
	void star() {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	void star1() {
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	void star2() {
		int num =0;
		for(int i=1;i<=5;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
	static void min(int a, int b, int c) {
		if(a<b && a<c) {
			System.out.println("a is small number : "+ a);
		}else if(b<c && b<a) {
			System.out.println("b is small number : "+ b);
		}else {
			System.out.println("c is small number :"+ c);
		}
	}
	static void  max(int a,int b, int c) {
		if(a>b &&a>c) {
			System.out.println("a is big number :"+ a);
		}else if(b>a && b>c){
			System.out.println("b is  big number : "+ b);
		}else {
			System.out.println("c is big number :"+c);
		}
	}
	void m1(byte a , short b){
		short s= (short) (a+b);
		System.out.println("it short : "+ s);
	}
	void m2(double a, double b) {
		System.out.println("double is :"+ (a+b));
	}
	void m3(long a, long b) {
		System.out.println("long is"+ (a*b));
	}
	void m4(float a, float b) {
		System.out.println("it float is :"+ (a+b));
	}
	void m5(char a, char b) {
		System.out.println("it char :"+  a);
		System.out.println("it char :"+ b);
		System.out.println("char is "+ (a+b));
	}
	void m6 (char a, char b) {
		String c =Character.toString(a) + Character.toString(b);
		System.out.println("it is String :"+ c);
	}

	public static void main(String[] args) {
		DemoMethods1 d = new DemoMethods1();
		d.add(15, 18);
		System.out.println("The value is : "+d);
		d.oddOrEven(24);
		d.star();
		System.out.println("------------------------------------------------");
		d.star1();
		System.out.println("--------------------------------------------------");
		d.star2();
		min(14, 12, 2);
		min(15,25,14);
		d.m1((byte)15, (short)20);
		d.m2(15, 30);
		d.m3(1554544545445464l, 215454654654151l);
		d.m4(151445, 4545544f);
		d.m5('A', 'B');
		d.m6('M','Z');
		
	}
	

}
