package com.kiranacademy.wildcardex;

public class PermantEmployee extends Employee{

	int salary;

	public PermantEmployee(int eid, String name,int salary) 
	{
		super(eid,name);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PermantEmployee [salary=" + salary + ", eid=" + eid + ", name=" + name + "]";
	}

}
