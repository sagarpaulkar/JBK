package com.kiranacademy.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx5 {

public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter size of a array :-  ");
		int size=scanner.nextInt();
		
		Employee[] employees=new Employee[size];
	
		System.out.println(Arrays.toString(employees));
		
		for(int index=0;index<size;index++)
		{
			System.out.println("enter eid,name,salary :-  ");
			int eid=scanner.nextInt();
			String name=scanner.next();
			int salary=scanner.nextInt();
			
			employees[index]=new Employee(eid, name, salary);
		}
		
		
		System.out.println(Arrays.toString(employees));
		
		Employee max=getMaxEmployee(employees);
		System.out.println(max);
		
	}
	
	
	// [Employee [eid=1, name=x, salary=100], Employee [eid=2, name=y, salary=200]]

	static Employee getMaxEmployee(Employee[] employees)
	{
		Employee maxEmployee=new Employee();  // maxEmployee==>Employee [eid=0, name=null, salary=0] Employee class object
		
		for (Employee employee : employees) 
		{
			if(employee.salary>maxEmployee.salary)
				maxEmployee=employee;
		}
		
		
		return maxEmployee;
	}

}
