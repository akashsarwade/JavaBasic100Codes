package com.java.oops.abstraction;

interface A {
	void a();

	void b();

	void c();
}

class B implements A {
	@Override
	public void a() {
		System.out.println("I am A Method");
	}

	@Override
	public void b() {
		System.out.println("I am B Method");
	}

	@Override
	public void c() {
		System.out.println("I am C Method");
	}
}

public class AbstractEg3 {

	public static void main(String[] args) {
		A b = new B();
		b.a();
		b.b();
		b.c();
	}

}