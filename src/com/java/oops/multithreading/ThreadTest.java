package com.java.oops.multithreading;

class A extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From thread A:" + i);
		}
		System.out.println("Ext from thread A");
	}

}

class B extends Thread {

	public void run() {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("From thread B:" + i);
		}
		System.out.println("Ext from thread B");
	}
}

class C extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("From thread C:" + i);
		}
		System.out.println("Ext from thread C");
	}

}

public class ThreadTest extends Thread {

	public static void main(String[] args) {

		new A().start();
		new B().start();
		new C().start();
	}

}
