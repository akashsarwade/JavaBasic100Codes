package com.java.basic.staticc;

public class FinalEg1 {
	final int a = 76;

	void show() {
//		a = 78;//It will throw a compile time error
		System.out.println(a);
	}

	public static void main(String[] args) {
		FinalEg1 f = new FinalEg1();
		f.show();
	}

}
