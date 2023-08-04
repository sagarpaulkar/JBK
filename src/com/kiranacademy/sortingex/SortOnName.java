package com.kiranacademy.sortingex;

import java.util.Comparator;

public class SortOnName implements Comparator<Product>{

	public int compare(Product product1, Product product2) 
	{
		String name1=product1.name;
		String name2=product2.name;
		
		return name1.compareTo(name2);
	}

}
