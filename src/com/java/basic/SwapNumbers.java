package com.java.basic;

public class SwapNumbers {

	public static void main(String[] args) {

		// Swap 2 numbers using 3rd Variable

		int a = 10;
		int b = 54;
		int temp;

		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swapping");
		System.out.println("A value is: " + a);
		System.out.println("B value is: " + b);

		System.out.println("Swap Numbers withouut 3rd Variable");

		float x = 89.89f;
		float y = 56.24f;
		System.out.println("X Before Swaping" + x);
		System.out.println("Y Before Swaping" + y);

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("X After Swaping" + x);
		System.out.println("Y After Swaping" + y);

	}
}
