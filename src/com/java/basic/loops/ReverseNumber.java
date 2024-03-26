package com.java.basic.loops;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		int n, reverse = 0;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the number to reverse");
			n = in.nextInt();
		}
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;

		}
		System.out.println("Reverse Number is:" + reverse);
	}
}
