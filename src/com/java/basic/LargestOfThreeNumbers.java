package com.java.basic;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {

		int x, y, z;
		System.out.println("Enter three Numbers to find Largest one");
		try (Scanner sc = new Scanner(System.in)) {
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
		}

		if (x > y && x > z) {
			System.out.println("X is Largest:" + x);
		} else if (y > z && y > x) {
			System.out.println("Y is Largest:" + y);
		}

		else if (z > y && z > y) {
			System.out.println("Z is Largest:" + z);
		} else
			System.out.println("ENter Numbers are not Distinct");
	}

}