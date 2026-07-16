package com.rough;

public class Demo {

	 void main() {
		String javaVersion = System.getProperty("java.version");
		String javaRuntimeVersion = System.getProperty("java.runtime.version");
		System.out.println("Java Version: " + javaVersion);
		System.out.println("Java Runtime Version: " + javaRuntimeVersion);
		System.out.println(System.getProperty("java.version"));
	}

}
