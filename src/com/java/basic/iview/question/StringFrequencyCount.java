package com.java.basic.iview.question;

public class StringFrequencyCount {

	public static void main(String[] args) {
		char[] s = { 'a', 'a', 'a', 'b', 'b', 'a', 'a', 'b', 'b', 'a' };

		int countA = 0;
		int countB = 0;

		for (int i = 0; i < s.length; i++) {
			if (s[i] == 'a') {
				countA++;
			} else if (s[i] == 'b') {
				countB++;
			}
		}
		System.out.println(countA);
		System.out.println(countB);
	}
}