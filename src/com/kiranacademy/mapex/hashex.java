package com.kiranacademy.mapex;

import java.util.HashMap;
import java.util.Set;

public class hashex {

	public static void main(String[] args)
	{

		HashMap<Integer,String>  hashmap=new HashMap<>();

		hashmap.put(1,"sachin");

		hashmap.put(2,"kamal");


		String name=hashmap.get(20);

		System.out.println(name);


		hashmap.put(1,"manish");


		System.out.println(hashmap);

		// equals() and hashcode() methods are used internally to compare keys 

		
		Set<Integer> allkeys=hashmap.keySet();

		//   allkeys===>[1,2] Set object


		for(Integer key : allkeys)
		{
			name=hashmap.get(key);
			System.out.println("roll no is " + key + " and name is " + name);
		}


				
	}

}
