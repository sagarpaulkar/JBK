package com.kiranacademy.collectionex;

import java.util.TreeSet;

public class TreeSetEx1 
{

	public static void main(String[] args) 
	{
		// set do  not accepts duplicates
		// set DO NOT preserve insertion order
		// TreeSet sorts the elements 
		// but elements should be of same type
		
			TreeSet set=new TreeSet();
			set.add(30);// 0 index
			set.add(20);// 1 index
			set.add(30);// 2 index
			//set.add("KiranAcademy");// 3 index
					
			System.out.println(set);
	}

}

