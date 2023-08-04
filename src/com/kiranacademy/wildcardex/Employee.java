package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class Employee {

	int eid;
	String name;
		
	public Employee(int eid, String name) 
	{
		super();
		this.eid = eid;
		this.name = name;
	}


	@Override
	public String toString() 
	{
		return "Employee [eid=" + eid + ", name=" + name + "]";
	}
	
	
public static void increaseSalary(ArrayList<? extends Employee> arrayList)
	{
	
		for (Employee employee : arrayList) 
		{
			if(employee instanceof TemporaryEmployee)
			{
				TemporaryEmployee temp=(TemporaryEmployee)employee;
				
				temp.wages=temp.wages+500;
			}
			
			if(employee instanceof PermantEmployee)
			{
				PermantEmployee permant=(PermantEmployee)employee;
				
				permant.salary=permant.salary+5000;
			}
		
		}
	}
}
