package com.java.basic;

import java.util.Scanner;

public class NestedIfElseClause {

	public static void main(String[] args) {
		int marksObtained, passingMarks;
		char grade;
		passingMarks = 40;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Scored Marks");
			marksObtained = sc.nextInt();
		}
		if (marksObtained >= passingMarks) {
			if (marksObtained > 90)
				grade = 'A';
			else if (marksObtained > 70)
				grade = 'B';

			else if (marksObtained > 60)
				grade = 'C';
			else
				grade = 'D';
			System.out.println("You passed the exam and your grade is " + grade);


		} else {
			grade = 'F';
			
			System.out.println("You Faiiled and your grade is:" + marksObtained);
		}
	}
}
