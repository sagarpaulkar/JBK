package com.kiranacademy.mapex;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {

	public static void main(String[] args)
	{

		LinkedHashMap<Integer,String>  hashmap=new LinkedHashMap<>();

		//HashMap<Integer,String>  hashmap=new HashMap<>();

		Integer i1=5;
		Integer i2=3;


		System.out.println(i1.hashCode() + " " + i2.hashCode());	
	
		hashmap.put(i1,"sachin");

		hashmap.put(i2,"kamal");


		System.out.println(hashmap);

		// equals() and hashcode() methods are used internally to compare keys 

		

				
	}

}
