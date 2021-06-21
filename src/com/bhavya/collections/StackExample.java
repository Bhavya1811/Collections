package com.bhavya.collections;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<String> s = new Stack();
		s.push("Bhavya");
		s.push("Neha");
		s.push("swathi");
		s.push("divya");
		s.push("lavanya");
		System.out.println(s.toString());
		s.pop();
		System.out.println(s.toString());
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.contains("hello"));
		s.contains("Neha");
		System.out.println(s.size());
		System.out.println(s.clone());
		System.out.println(s.hashCode());
		System.out.println(s.firstElement());
		System.out.println(s.lastElement());
		System.out.println(s.get(3));
		System.out.println(s.set(2, "hi"));
		System.out.println(s.toString());
		s.clear();
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.toString());

	}

}
