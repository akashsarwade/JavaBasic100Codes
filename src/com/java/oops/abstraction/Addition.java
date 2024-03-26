package com.java.oops.abstraction;

abstract class MathOperation {

	abstract int sum(int a, int b);

	public static void printResult(int res) {
		System.out.println("Result:" + res);
	}
}

public class Addition extends MathOperation {

	@Override
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		MathOperation a = new Addition();
		System.out.println(a.sum(123, 131));
	}
}
