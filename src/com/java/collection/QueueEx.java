package com.java.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {

//		Queue Implement using 3 classes.

		Queue<String> animal = new LinkedList<>();
		animal.add("DOg");
		animal.add("Cat");
		animal.add("Horse");
		System.out.println(animal);
		animal.peek();
		animal.remove();// remove first element
		animal.element();
		animal.offer("Cat");//
		System.out.println(animal);

	}
}
