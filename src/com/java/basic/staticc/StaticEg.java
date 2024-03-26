package com.java.basic.staticc;

public class StaticEg {

	//Static block get execute before main method 
	static {
		System.out.println("I am Static Block");

	}

	public static void main(String[] args) {

		System.out.println("Hello I am Main method");
	}
}
