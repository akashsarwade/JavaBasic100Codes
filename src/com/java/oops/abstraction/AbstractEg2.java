package com.java.oops.abstraction;

abstract class Bank {
//	this is Abstract method
	abstract String rateOfIntrest();
}

class SBI extends Bank {

	@Override
	String rateOfIntrest() {

		return "SBI ROI 7 %";
	}
}

class HDFC extends Bank {
	@Override
	String rateOfIntrest() {
		return "HFCF ROI 9 %";
	}

}

class ICICI extends Bank {

	@Override
	String rateOfIntrest() {
		return "ICICI ROI 9 %";
	}
}

public class AbstractEg2 {
	public static void main(String[] args) {
		Bank b = new SBI();
		System.out.println(b.rateOfIntrest());

		Bank b1 = new HDFC();
		System.out.println(b1.rateOfIntrest());

		Bank b2 = new ICICI();
		System.out.println(b2.rateOfIntrest());

	}

}
