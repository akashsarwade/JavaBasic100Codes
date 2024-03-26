package com.java.oops.encapsulation;

class Person {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		if (id >= 0 && id <= 150) {
			this.id = id;
		} else {
			System.out.println("Invalid Age");
		}
	}

}

public class EncapsulationEg1 {

	public static void main(String[] args) {
		Person p = new Person();
		p.setName("Akash");
		p.setId(234);
		System.out.println(p.getName());
 
		System.out.println(p.getId());
	}
}
