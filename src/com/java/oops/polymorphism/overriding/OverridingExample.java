package com.java.oops.polymorphism.overriding;

class ParentMath {
	void area() {
		int a = 2;
		System.out.printf("Area of Square with side 2 = %d %n", a * a);
		System.out.println();
	}
}

class ChildMath extends ParentMath {

	void area() {
		int a = 4;
		System.out.printf("Area of Square with side 4= %d %n", a * a);
	}
}

public class OverridingExample {
	public static void main(String[] args) {
		ChildMath ch=new ChildMath();
		ch.area();
		ParentMath pm=new ParentMath();
		pm.area();
		
	}

}
