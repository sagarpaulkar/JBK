package com.kiranacademy.collectionex;

import java.util.TreeSet;

public class TreeSetEx2 
{

	public static void main(String[] args) 
	{
		// set do  not accepts duplicates
		// set DO NOT preserve insertion order
		// TreeSet sorts the elements 
		// but elements should be of same type
		
			TreeSet<Product> set=new TreeSet<Product>();
			set.add(new Product(101, "pen",100));
			set.add(new Product(102, "notebook",50));
			set.add(new Product(103, "calculator",250));
		
					
			System.out.println(set);
	}

}
