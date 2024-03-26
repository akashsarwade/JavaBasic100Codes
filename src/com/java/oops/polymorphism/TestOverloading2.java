package com.java.oops.polymorphism;

public class TestOverloading2 {
	// same methods but different datatype.

	static int add(int a, int b) {
		return a + b;
	}

	static double add(double a, double b) {
		System.out.println("Double method");
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(TestOverloading2.add(32.34d, 3265.2d));

	}
}
