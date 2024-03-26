package com.java.basic.oops.inheritance;

class Father {
	void show() {
		System.out.println("I am Father");
	}
}

class Son extends Father {

	@Override
	void show() {
		super.show();
		System.out.println("I am Son of my Father");
	}
}

class Daughter extends Father {

	@Override
	void show() {
		super.show();
		System.out.println("I am Daughter of my Father");
	}
}

public class HierarchicalEg {
	public static void main(String[] args) {

		Daughter ob = new Daughter();
		ob.show();//father and Daughter called.
	}

}
