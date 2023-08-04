package com.kiranacademy.methods;

import com.mysql.cj.jdbc.Driver;

public class TestEmployee {
	
public static void main(String[] args) throws Exception {
		
		System.out.println("Hello");
		
		TestEmployee obj=new TestEmployee();
		
		Employee e1=new Employee(1, "ramesh", 1000);
		Employee e2=new Employee(2, "rakesh", 2000);
		Employee e3=new Employee(3, "suresh", 3000);
		
			
		Employee maxEmployee=obj.getMaxEmployee(e1, e2, e3);
		System.out.println(maxEmployee);
		
		maxEmployee=obj.getMaxEmployee(new Employee(1, "ramesh", 1000), new Employee(2, "rakesh", 2000), new Employee(3, "suresh", 3000));
		System.out.println(maxEmployee);
		
		Class.forName("com.mysql.jdbc.Driver");
		
	    Driver driver=new Driver();
	}
	
	
	Employee getMaxEmployee(Employee e1,Employee e2,Employee e3)
	{
		if(e1.salary>e2.salary && e1.salary>e3.salary)
			
			return e1;
		
		else if(e2.salary>e1.salary && e2.salary>e3.salary)
	
			return e2;
		
		else
			return e3;
		
	
	}

}
