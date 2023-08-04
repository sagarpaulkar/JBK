package com.kiranacademy.Abstraction;

public class TestCloning {

	public static void main(String[] args) throws Exception {
		
		Employee original=new Employee(1, "sachin", 10000);
		
		//original(1000) ===> [new Employee(1, "sachin", 10000)] Employee class object at address 1000
		
		
		Employee duplicate=(Employee) original.clone();
		
		//duplicate(2000) ===> [new Employee(1, "sachin", 10000)] Employee class object at address 2000
		
		
		System.out.println(original==duplicate);

//		
//		TestCloning obj=new TestCloning();
//		obj.clone();

		
//		Object object=new Object();
//		object.clone();
	}

}
