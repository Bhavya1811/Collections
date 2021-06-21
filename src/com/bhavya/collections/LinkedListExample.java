package com.bhavya.collections;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList al = new LinkedList();
		al.add(121);
		al.add(45.96);
		al.add('r');
		al.add("Bhavya");
		al.add(null);
		al.add(121);
		al.add(true);
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.getFirst());
		System.out.println(al.getLast());
		
		al.removeFirst();
		al.removeLast();
		
		System.out.println(al.toString());
		System.out.println(al.clone());
		System.out.println(al.isEmpty());
		System.out.println(al.hashCode());
		
		System.out.println(al.getClass());
		al.clear();
		System.out.println(al.size());
		System.out.println(al.isEmpty());

	}

}
