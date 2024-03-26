package com.java.oops.abstraction;

abstract class Person {

	abstract void eat();

	abstract void work();

	abstract void sleep();

}

class Employee extends Person {

	@Override
	void eat() {
		System.out.println("Employee Eat's Food");
	}

	@Override
	void work() {
		System.out.println("employees Go to offic and work 8 hrs");
	}

	@Override
	void sleep() {
		System.out.println("Employee go to home eat food and sleeps");
	}
}

public class AbstractEg5 {

	public static void main(String[] args) {
		Person p = new Employee();
		p.eat();
		p.sleep();
		p.work();
	}
}
