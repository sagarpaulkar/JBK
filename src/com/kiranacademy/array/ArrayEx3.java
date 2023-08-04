package com.kiranacademy.array;

import java.util.Arrays;

public class ArrayEx3 {

public static void main(String[] args) {
		
		Employee[] employees=new Employee[3];
		
		System.out.println(Arrays.toString(employees));
		
		//              0      1    2
		//  employees [null][null][null]
		
		//System.out.println(employees[0].salary);
		
		employees[0]=new Employee(1, "sagar", 100000);
		
		employees[1]=new Employee(2, "pratik", 200000);
		
		employees[2]=new Employee(3, "pranav", 300000);
		
		
		System.out.println(Arrays.toString(employees));
		
		
	}

}
