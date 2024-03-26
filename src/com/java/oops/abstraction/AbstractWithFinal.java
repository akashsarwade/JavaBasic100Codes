package com.java.oops.abstraction;

abstract class Fruit {
	abstract void eat();

	final void wash() {
		System.out.println("Fruit Washed.....");
	}
}

class Apple extends Fruit {

	@Override
	void eat() {
		System.out.println("I am Eating Apple");
	}
}
public class AbstractWithFinal {
	public static void main(String[] args) {
		Fruit f = new Apple();
		f.eat();
		f.wash();
	}

}
