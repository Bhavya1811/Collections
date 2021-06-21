package com.bhavya.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.addElement(145);
		v.addElement(45.35);
		v.addElement('d');
		v.addElement("java");
		v.addElement(null);
		System.out.println(v.toString());
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		System.out.println(v.hashCode());
		System.out.println(v.clone());
		System.out.println(v.getClass());
		v.remove(3);
		System.out.println(v.toString());
		System.out.println(v.get(3));
		v.set(3, "Bhavya");
		System.out.println(v.toString());
		System.out.println(v.size());
		v.clear();
		System.out.println(v.isEmpty());
		System.out.println(v.size());
		System.out.println(v.toString());
	}

}
