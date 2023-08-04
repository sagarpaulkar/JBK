package com.kiranacademy.sortingex;

import java.util.Comparator;

public class SortOnPrice implements Comparator<Product>
{
	public int compare(Product product1, Product product2) 
	{
		int price1=product1.price;
		int price2=product2.price;
		
		// If prices are not equals , sort objects based on price
		// If prices are  equals , sort objects based on pid
		
		if(price1!=price2)
			return price1-price2;
		else
			return product1.pid-product2.pid;
		
		// p1 ==> 10    -  p2==>10  ==> 
	}


}
