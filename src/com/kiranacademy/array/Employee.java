package com.kiranacademy.array;

public class Employee {

	int eid;
	String name;
	int salary;
	
	
	public Employee(int eid, String name, int salary) 
	{
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}

}
