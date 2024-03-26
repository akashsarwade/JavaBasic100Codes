package com.java.basic.iview.question;

public class CountNumberFrequency {

	public static void main(String[] args) {
		int[] a = { 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 };

		int countOne = 0;
		int countZero = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				countZero++;
			} else if (a[i] == 1) {
				countOne++;
			}
		}
		System.out.println("Zero Count:" + countZero);
		System.out.println("One Count" + countOne);
	}
}
