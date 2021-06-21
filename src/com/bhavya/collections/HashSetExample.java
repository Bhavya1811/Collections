package com.bhavya.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetExample {

	public static void main(String[] args) {
		
		//HashSet hs = new HashSet();
		
		LinkedHashSet hs = new LinkedHashSet();
		
		hs.add(113);
		hs.add(20.91);
		hs.add('r');
		hs.add("Bhavya");
		hs.add(null);
		hs.add(113);
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println(hs.clone());
		System.out.println(hs.hashCode());
		System.out.println(hs.getClass());
		System.out.println(hs.contains("bhavya"));
		System.out.println(hs.contains("Bhavya"));
		hs.remove('r');
		System.out.println(hs.toString());
		hs.clear();
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs.toString());

	}

}
