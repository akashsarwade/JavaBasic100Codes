package com.java.basic;

import java.util.Scanner;

public class ElseIfClause2 {

	public static void main(String[] args) {
		int marksObtain, passingMarks;
		passingMarks = 34;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter your obtained Marks:");
			marksObtain = sc.nextInt();
		}
		if (passingMarks <= marksObtain) {
			System.out.println("You Passed:" + marksObtain);
		} else {
			System.out.println("You Faileddd...!:" + marksObtain);
		}
	}
}
