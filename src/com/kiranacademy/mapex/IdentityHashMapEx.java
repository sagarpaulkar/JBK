package com.kiranacademy.mapex;

import java.util.IdentityHashMap;

public class IdentityHashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IdentityHashMap<Integer,String>  hashmap=new IdentityHashMap<>();

		//HashMap<Integer,String>  hashmap=new HashMap<>();

		Integer i1=new Integer(10);
		Integer i2=new Integer(10);


		System.out.println(i1.hashCode() + " " + i2.hashCode());	
	
		hashmap.put(i1,"sachin");

		hashmap.put(i2,"kamal");


		System.out.println(hashmap);

		// equals() and hashcode() methods are used internally to compare keys 

	}

}
