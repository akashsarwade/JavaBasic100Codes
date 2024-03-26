package com.java.basic.staticc;

public class FinalMethodEg {

	/*
	 * 1.When Method declared as a final keyword its reffered to as final method.
	 * 2.child class cann;t override final method 3.If we do not want to change
	 * implementation of method then we can make method as a final.
	 */

	final void print() {
		System.out.println("I am Final Print method");
	}

}

class Pune extends FinalMethodEg {
	//we can't override it
//	void print() {//here it will throw compile time error.
//		System.out.println("I amin Pune Method..");
//	}

	public static void main(String[] args) {
		Pune p = new Pune();
		p.print();
	}
}