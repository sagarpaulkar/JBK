package com.kiranacademy.mapex;

import java.util.LinkedHashMap;
import java.util.Set;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<Character,Integer>  map=new LinkedHashMap<>();

		String s="javaa";

		int i=0;

		while(i<s.length())
		{

			char ch=s.charAt(i);

			if(map.containsKey(ch))
			{
				map.put(ch , map.get(ch) + 1);
			}
			else
			{
				map.put(ch,1);
			}

			i=i+1;	
		}


//              key        value

//              j           1
//              a           3
//              v           1

		Set<Character> allkeys=map.keySet();   // allkeys==>[j,a,v] Set object

		for(Character key : allkeys)
		{
			System.out.println(key + " has occured " + map.get(key) + " times ");
		}

	}

}
