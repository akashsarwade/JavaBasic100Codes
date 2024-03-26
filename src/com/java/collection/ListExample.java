package com.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		
		List<String>list=new ArrayList<>();
		list.add("Ram");
		list.add("Mike");
		list.add("Sham");
		list.add("John");
		
		System.out.println(list);
		
		//simple loop (Traverse list)
		for(int i=0; i<=list.size()-1;i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------");
	}
}
