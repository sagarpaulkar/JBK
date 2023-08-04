package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class TestEmployee {

public static void main(String[] args) {
		
		ArrayList<TemporaryEmployee> arrayList=new ArrayList<TemporaryEmployee>();
		
		arrayList.add(new TemporaryEmployee(1, "sachin", 100));
		arrayList.add(new TemporaryEmployee(2, "mahesh", 200));
		
		Employee.increaseSalary(arrayList);
		
		System.out.println(arrayList);
		
		
		
		System.err.println("For Permanant Employee :--   ");
		
		ArrayList<PermantEmployee> arrayList2=new ArrayList<PermantEmployee>();
		
		arrayList2.add(new PermantEmployee(3, "rakesh", 1000));
		arrayList2.add(new PermantEmployee(4, "suresh", 2000));
		
		Employee.increaseSalary(arrayList2);
		
		System.out.println(arrayList2);
		
	}

}
