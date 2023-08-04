package com.kiranacademy.sortingex;

import java.util.Scanner;
import java.util.TreeSet;

public class Test2 {

public static void main(String[] args) {
		
		// TreeSet()  - it looks for Comparable
		// TreeSet(Comparator c)
		// class SortOnPrice implements Comparator
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1.name 2. price");
		int choice=scanner.nextInt();
		
		TreeSet<Product> set;
		
		if(choice==1)
			set=new TreeSet<>(new SortOnName());
		else
			set=new TreeSet<>(new SortOnPrice());
		
		
		set.add(new Product(101, "pen",50));
		set.add(new Product(102, "notebook",50));
		set.add(new Product(103, "calculator",250));
	
				
		System.out.println(set);
				
	}

}
