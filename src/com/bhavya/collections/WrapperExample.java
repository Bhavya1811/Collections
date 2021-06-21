package com.bhavya.collections;

public class WrapperExample {

	public static void main(String[] args) {
		
		int a=12;
		Integer i =Integer.valueOf(a);
		System.out.println("After converting primitive data type into object :" +i);
		
		Integer x=new Integer(45);
		int x1=x.intValue();
		System.out.println("After converting object to primitive :"+x1);

	}

}
