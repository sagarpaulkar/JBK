package com.kiranacademy.classes;

public class A {

	private A() {
		
	}
	
	public void show () {
		System.out.println("Kiran Academy");
	}
	
	public static A giveMeObject() {
		
		return new A();
		
	}
}
