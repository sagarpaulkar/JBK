package com.kiranacademy.polymorphism;

import java.util.ArrayList;
import java.util.Iterator;

import com.kiranacademy.classes.A;

public class B {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//com.kiranacademy.classes.A obj=new A();
		
		A obj1= A.giveMeObject();
		
	//	A obj=new A();
		
		obj1.show();
		
		ArrayList<String> al=new ArrayList();
		al.add("java");
		al.add("is");
		al.add("easy");
		
		Iterator it=al.iterator();
		
		// it==>[next() hasNext()] Iterator object
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
	}

}
