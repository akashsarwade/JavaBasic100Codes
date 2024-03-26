package com.java.oops.polymorphism;

class Adder {

	public static int add(int a, int b) {
		return a + b;
	}

	public static int add(int a, int b, int c) {
		return a + b + c;
	}
}

//method Overloading 
public class Example1 {
	public static void main(String[] args) {

		System.out.println(Adder.add(22, 43, 445));

		System.out.println(Adder.add(54, 2));
	}
}
