package com.java.basic;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n, c, fact = 1;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number to find it's factorial.");
			n = sc.nextInt();
		}
		if (n < 0) {
			System.out.println("Number should be non-negative");
		} else {
			for (c = 1; c <= n; c++) {
				fact = fact * c;
				System.out.println("Factorial of +" + n + " is" + fact);

			}
		}
	}
}
