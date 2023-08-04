package com.kiranacademy.mapex;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args)
	{

		TreeMap<Integer,String>  hashmap=new TreeMap<>();


		Integer i1=5;
		Integer i2=3;


		System.out.println(i1.hashCode() + " " + i2.hashCode());	
	
		hashmap.put(i1,"sachin");

		hashmap.put(i2,"kamal");


		System.out.println(hashmap);

		// equals() and hashcode() methods are used internally to compare keys 

		

				
	}

}
