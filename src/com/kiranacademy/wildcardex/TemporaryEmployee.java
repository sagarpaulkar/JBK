package com.kiranacademy.wildcardex;

public class TemporaryEmployee extends Employee {

	int wages;

	public TemporaryEmployee(int eid, String name,int wages) 
	{
		super(eid,name);
		this.wages = wages;
	}

	@Override
	public String toString() {
		return "TemporaryEmployee [wages=" + wages + ", eid=" + eid + ", name=" + name + "]";
	}

}
