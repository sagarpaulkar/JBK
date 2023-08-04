package com.kiranacademy.mapex;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap hashmap=new HashMap();
		
		hashmap.put("sachin",12345678905L);
		hashmap.put("mahesh",22345678905L);
		
		System.out.println(hashmap);
		
		// value get(key)
		
		// get(-) accepts key and gives value
		// If key is not present , it return null 
		
		
		Long mobno=(Long) hashmap.get("mahesht");
		System.out.println(mobno);

		// key must be unique .
		// hence if entry with given key is present 
		// then hashmap update value
		
		hashmap.put("mahesh",54321L);
		
		System.out.println(hashmap);
		
		
		hashmap.remove("sachint");
		
		
		System.out.println(hashmap);

	}

}
