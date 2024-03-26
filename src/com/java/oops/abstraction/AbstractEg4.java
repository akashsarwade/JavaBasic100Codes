package com.java.oops.abstraction;

abstract class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public abstract void makeSound();

	public String getName() {
		return name;
	}

}

class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeSound() {
		System.out.println(getName() + "Woow wooooww");
	}

}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeSound() {

		System.out.println(getName() + "Meewwooow meaaawooo");
	}
}

public class AbstractEg4 {

	public static void main(String[] args) {

		Animal myDog = new Dog("Tony: ");
		Animal myCat = new Cat("puccy:");
		myDog.makeSound();
		myCat.makeSound();

	}
}
