package com.kiranacademy.classes;

public class MyClass {

		int a,b;   // non-static global variables . constructor's job is to initilize this variables
		
		static public int x=10; // static global variable
		
		// global variables if not initilized JVM initilize them with default value
		// local variable's initilization is compulsory .
		
		public MyClass(int a, int b) 
		{
			super();
			this.a = a;
			this.b = b;
		}


		public int add()
		{
			return a+b;
		}
		
		
		static public void display()
		{
			System.out.println("KiranAcademy");
		}
		
}
