package com.java.oops.abstraction;

abstract class Shape {

	abstract void draw();

}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Drawing Rectangle.");
	}

}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing Circle.");
	}

}

public class AbstractEg1 {
	public static void main(String[] args) {
		Shape ob = new Circle();
		ob.draw();
		Shape obj = new Rectangle();
		obj.draw();
	}
}