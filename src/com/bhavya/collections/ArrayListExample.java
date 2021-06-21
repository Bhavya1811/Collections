package com.bhavya.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(130);
		al.add(45.36);
		al.add('d');
		al.add("JAVA");
		al.add(true);
		al.add(130);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(3));
		System.out.println(al.remove(3));
		System.out.println(al);
		System.out.println(al.clone()); // creates duplicate object
		System.out.println(al.hashCode());
		System.out.println(al.isEmpty());
		System.out.println(al.toString());
		System.out.println(al.getClass());
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		al.clear();
		System.out.println(al.size());
		System.out.println(al.toString());
		System.out.println(al.isEmpty());
		
		


	}

}
