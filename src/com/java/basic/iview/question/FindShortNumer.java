package com.java.basic.iview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindShortNumer {

	public static void main(String[] args) {

		int[] num = { 21, 34, 3, 54, 22, 64, 86, 3 };
		int shortNum = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] < shortNum) {
				shortNum = num[i];
			}
		}
		System.out.println(shortNum);

		// 2 using java 8 method

		int shorter = Arrays.stream(num).sorted().min().orElse(Integer.MAX_VALUE);
		System.out.println(shorter);

		// 3 using java Collections.
		// convert to array to list
		List<Integer> list = new ArrayList<>();
		for (int n : num) {
			list.add(n);
		}
		System.out.println(list);

		int shortNum2 = Collections.min(list);
		System.out.println("Shottest Number is:"+shortNum2);
	}
}
