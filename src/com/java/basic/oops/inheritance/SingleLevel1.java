package com.java.basic.oops.inheritance;

class Shape {
	public void area() {
		System.out.println("Display Are of Shape");
	}
}

public class SingleLevel1 extends Shape {

	@Override
	public void area() {
//		super.area();
		System.out.println("Called from Child class");
	}

	public static void main(String[] args) {
		SingleLevel1 sl = new SingleLevel1();
		sl.area();

	}

}
