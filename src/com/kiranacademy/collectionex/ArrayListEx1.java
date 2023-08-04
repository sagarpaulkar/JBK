package com.kiranacademy.collectionex;

import java.util.ArrayList;

public class ArrayListEx1 {

	public static void main(String[] args) 
	{
		// list accepts duplicates
		// list preserve insertion order
		
			ArrayList arrayList=new ArrayList();
			arrayList.add(30);// 0 index
			arrayList.add(20);// 1 index
			arrayList.add(30);// 2 index

			
			System.out.println(arrayList);
			
			
			int element=(int) arrayList.get(1);
			
			System.out.println(element);
			
			arrayList.set(2, 50);
			
			System.out.println(arrayList);
			
			arrayList.remove(1);
			
			System.out.println(arrayList);
			
			
			
	}

}
