package com.java.basic.loops;

import java.util.Scanner;

public class BreakWhileLoop {

	public static void main(String[] args) {

		int n;
		try (Scanner input = new Scanner(System.in)) {
			
			while (true) {
				System.out.println("Input an Integer");
				n = input.nextInt();
				if (n == 0) {
					break;
				}
				System.out.println("You Enterrd " + n);
			}
		}

	}
}
