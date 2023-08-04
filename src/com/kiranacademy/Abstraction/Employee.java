package com.kiranacademy.Abstraction;

public class Employee implements Cloneable
{
	
	int eid;
	String name;
	int salary;
	
	// non-static members are accessed using reference
	
	
	Employee()
	{
		
	}
	
	public Employee(int eid, String name, int salary) 
	{
		
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		
		return "Employee [eid=" + this.eid + ", name=" + name + ", salary=" + salary + "]";
	}

	public Object clone() throws CloneNotSupportedException
	{
		System.out.println("calling same clone() method");
		//return clone();
		
		return super.clone();
	}
	

}

