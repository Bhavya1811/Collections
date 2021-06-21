package com.bhavya.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapExample {

	public static void main(String[] args) {
		
		//HashMap<Integer, String> hm = new HashMap<>();
		//LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(12, "Bhavya");
		hm.put(10, "Keerthi");
		hm.put(8,  "Anusha");
		hm.put(15, "Harshi");
		hm.put(16, "Latha");
		hm.put(18, "Neetu");
		hm.put(10,  "Jaya");
		
		System.out.println(hm);
		System.out.println(hm.toString());
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.toString());
		System.out.println(hm.getClass());
		System.out.println(hm.hashCode());
		System.out.println(hm.clone());
		
		System.out.println(hm.get(10));
		System.out.println(hm.containsKey(16));
		System.out.println(hm.containsKey(78));
		System.out.println(hm.clone());
		
		hm.remove(15);
		System.out.println(hm);
		System.out.println(hm.toString());
		
		hm.clear();
		System.out.println(hm.size());
		System.out.println(hm.isEmpty());
		System.out.println(hm.toString());
		
	}

}
