package com.java.basic.oops.inheritance;

class A {
	public A() {
		System.out.println("I am A Const");
	}
}

public class B extends A {
	public B() {
		System.out.println("I am b Const");
	}

	public static void main(String[] args) {
		B b = new B();
		
	}

}
