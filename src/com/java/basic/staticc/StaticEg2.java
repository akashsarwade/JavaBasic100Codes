package com.java.basic.staticc;

public class StaticEg2 {

	/*
	 * Static Variable can be used to refer common properties of all objects (which is not unique for each other)
	 * The Static variable gets memory only once in the class area at the t of class loading.
	 */

	static int a = fun();

	static {
		System.out.println("I am inside static block");
	}

	static int fun() {
		System.out.println("inside Fun() Function");
		return 10;
	}

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println("Inside main");

	}
}
