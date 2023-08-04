package com.kiranacademy.polymorphism;

public class Parent {

	int a=10;
	
	Parent()
	{
		
	}
	
	Parent(int a)
	{
		this.a=a;
	}
	
	final void show()
	{
		System.out.println(a);
	}
	
	// static method is inherited
	
	static void display()
	{
		System.out.println("KiranAcademy");
	}

	@Override
	public String toString() {
		return "Parent [a=" + a + "]";
	}
}

