package com.java.basic;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int x;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the number to check odd or Even");
			x = in.nextInt();
		}
		if (x % 2 == 0) {
			System.out.println("Number is Even:" + x);
		} else {

			System.out.println("Number is Odd:" + x);
		}

	}
}
