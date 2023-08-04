package com.kiranacademy.polymorphism;

import com.kiranacademy.classes.MyClass;

public class C {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass obj1=new MyClass(10,20);
		
		int sum1=obj1.add();
		
		System.out.println(sum1);
		
		

		MyClass obj2=new MyClass(70,30);
		
		int sum2=obj2.add();
		
		System.out.println(sum2);

		
		MyClass.display();
		
		
		
		System.out.println(MyClass.x);
		
		MyClass.x=30;
		
		System.err.println(MyClass.x);

		
		obj1.x=60;
		
		
		System.out.println(obj1.x);
		System.out.println(obj2.x);
		System.out.println(MyClass.x);
		
	
	}

}
