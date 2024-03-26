package com.java.oops.polymorphism.overriding;

class Truck {
	void run() {
		System.out.println("Truck Running");
	}
}

class Car extends Truck {
	void run() {
		System.out.println("Car Running");
	}
}

public class Vehicle {

	public static void main(String[] args) {

		Truck c = new Car();
		c.run();
	}

}
