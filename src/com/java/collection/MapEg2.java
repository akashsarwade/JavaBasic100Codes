package com.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapEg2 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(101, "akash@gmail.com");
		map.put(102, "ram@gmail.com");
		map.put(103, "sham@gmail.com");
		map.put(105, "jaan@gmail.com");
		map.put(null, "raj");
		
		
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
