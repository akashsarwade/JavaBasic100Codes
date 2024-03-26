package com.java.basic;

import java.util.Scanner;

public class InputTakingScanner {

	public static void main(String[] args) {

		int a;
		float b;
		String s;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Employee Name:");
			s = sc.next();
			System.out.println("Enter the Employee Id:\n");
			a = sc.nextInt();
			System.out.println("\nEnter the Employee Salary:\n");
			b = sc.nextFloat();
		}

		System.out.println("Employee Name:\n" + a);

		System.out.println("Employee Name:\n" + s);

		System.out.println("Employee Name:\n" + b);

	}
}
