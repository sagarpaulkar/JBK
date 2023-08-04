package com.kiranacademy.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter size of a array :-  ");
		int size=scanner.nextInt();
		
		Employee[] employees=new Employee[size];

		
		System.out.println(Arrays.toString(employees));
		
		//              0      1    2
		//  employees [null][null][null]
		
		//System.out.println(employees[0].salary);
		
		for(int index=0;index<size;index++)
		{
			System.out.println("enter eid,name,salary :-  ");
			int eid=scanner.nextInt();
			String name=scanner.next();
			int salary=scanner.nextInt();
			
			employees[index]=new Employee(eid, name, salary);
		}
		
//		employees[0]=new Employee(1, "sagar", 100000);
//		
//		employees[1]=new Employee(2, "pratik", 200000);
//		
//		employees[2]=new Employee(3, "pranav", 300000);
//		
		
		System.out.println(Arrays.toString(employees));
		
		
	}

}
