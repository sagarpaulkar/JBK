package com.kiranacademy.polymorphism;

import java.util.Arrays;

public class Child extends Parent{


	// final method is inherited But child class can not redefine it
	
//	final void show()
//	{
//		System.out.println("hello");
//	}
	
   public static void main(String[] args) 
   {
	
	   //final Parent obj=new Child();
	   
	   Parent obj=new Child();
	   
	   //obj(1000) ==> [ a=10 show()] Child class object at address 1000
	   
	   obj.a=70;
	   
	   obj.show();
	   
	   obj=new Parent();
	   
	 //obj(2000) ==> [a=10 show()] Parent class object at address 2000
	   
	   obj.show();
	   
	   System.out.println(obj.toString());
	   
	// toString() is called automatically  whenever we print object or object reference
	   
	   System.out.println(obj);
	   
	   System.out.println(new Parent());
	   
	   
	   Child.display();
	   
	   int[] myArray= {10,20,30};
	   
	   Child.main(myArray);
	   
	  
	   
   }
  
   static void main(int[] myArray)
   {
	   System.out.println(myArray);
	   
	   System.out.println(Arrays.toString(myArray));
   }

}
