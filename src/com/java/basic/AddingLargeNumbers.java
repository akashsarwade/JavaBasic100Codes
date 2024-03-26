package com.java.basic;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {

	public static void main(String[] args) {
		String num1, num2;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter First Number");
			num1 = sc.nextLine();

			System.out.println("Enter second Number");
			num2 = sc.nextLine();
		}
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);

		BigInteger sum = first.add(second);
		System.out.println("Resumlt of Addition:" + sum);

	}

}
