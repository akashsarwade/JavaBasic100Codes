package com.java.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEg {
	public static void main(String[] args) {

		Map<String, Integer> ht = new Hashtable<>();
		ht.put("Akash", 987654);
		ht.put("Swati", 327654);
		ht.put("Nivya", 217654);
		ht.put("Swara", 877654);
		System.out.println(ht);
		System.out.println(987654%11);
	}
}
