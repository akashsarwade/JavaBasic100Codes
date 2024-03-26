package com.java.basic;

import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		float temprature;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Temprature in Fahrenheit:");
			temprature = sc.nextFloat();
		}

		temprature = (temprature - 32) * 5 / 9;
		System.out.println("Temprature in Celsious:" + temprature);

	}
}
