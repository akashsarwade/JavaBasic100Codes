package com.java.basic.strings;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		String s1, s2;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the  first string");
			s1 = in.next();
			System.out.println("Enter the  second string");
			s2 = in.next();
		}
		if (s1.equals(s2)) {
			System.out.println("both String are Same");
		} else {
			System.out.println("both string are different");
		}

		if (s1.compareTo(s2) > 0) {
			System.out.println("First string is greater than second");
		} else if (s1.compareTo(s2) < 0) {
			System.out.println("first string is smaller than second");

		} else {
			System.out.println("Both string are equal | same ");
		}
	}
}
