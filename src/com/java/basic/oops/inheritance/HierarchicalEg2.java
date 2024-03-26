package com.java.basic.oops.inheritance;

class Shapee {
	
	public void draw() {
		System.out.println("Drawing differents Shapes");
	}
}

class Circle extends Shapee {

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
}

class Tringle extends Shapee {

	public void draw() {
		System.out.println("Drawing Tringle");
	}
}

public class HierarchicalEg2 {
	public static void main(String[] args) {
		Circle ob = new Circle();
		Tringle t = new Tringle();

		ob.draw();
		t.draw();

	}

}
