package com.kiranacademy.classes;

public class C {

		public static void main(String[] args) {
			
		  //B obj1=new B();
			
			B obj1=B.giveMeObject();
			
			// obj1(1000)===>[display()] B class object at address 1000
			
			obj1.display();
			
			B obj2=B.giveMeObject();
			
			obj2.display();
			
			// obj2(2000)===>[display()] B class object at address 2000
			
			
			System.out.println(obj1==obj2);  // false
			
			Runtime rt1=Runtime.getRuntime();
			
			// rt1,rt2  ==> [ exec() ] Runtime class object
					
			Runtime rt2=Runtime.getRuntime();
			
			System.out.println(rt1==rt2);//true
					
			//Runtime rt3=new Runtime(); // Not possible as it is private
		}
	}
