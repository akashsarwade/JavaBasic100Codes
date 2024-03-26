package com.java.oops.polymorphism.overriding;

class GrandFather {

	void Tall() {
		System.out.println("GrandFather is Tall 6 Ft.");
	}

}
class Father extends GrandFather {

	void Tall() {
		System.out.println("Father is Tall 5.9 Ft.");
	}
}

class Son extends Father {
	void Tall() {
		System.out.println("Son is Tall 5 Ft.");
	}
}

public class Overriding2 {

	public static void main(String[] args) {

		Son s = new Son();
		s.Tall();

		GrandFather s1 = new Son();
		s1.Tall();

		GrandFather s2 = new Father();
		s2.Tall();

//		Father f = new GrandFather();//it won;t work
//		Son ss=new Father()//it won't work
		Son sss=new Son();	
		sss.Tall();

		
		GrandFather gf=new GrandFather();
		gf.Tall();
	}
}
