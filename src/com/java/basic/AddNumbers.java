package com.java.basic;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {

		int x, y, z;
		System.out.println("Enter Two Numbers to calculate their sum");
		try (Scanner sc = new Scanner(System.in)) {
			x = sc.nextInt();
			y = sc.nextInt();
		}
		z = x + y;
		System.out.println("Sum of two Numbers:" + z);
	}
}
