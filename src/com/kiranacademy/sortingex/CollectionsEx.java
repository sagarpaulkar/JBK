package com.kiranacademy.sortingex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CollectionsEx {

public static void main(String[] args) {
		

		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(5);
		
		Collections.sort(arrayList);	
		
		System.out.println(arrayList);
		
		// Collections sorts elements and retain duplicates . 
		// TreeSet sorts elements but DO NOT retain duplicates .
		
		
		TreeSet<Integer> treeset=new TreeSet<Integer>();
		treeset.addAll(arrayList);
		
		System.out.println(treeset);
		
	}

}
