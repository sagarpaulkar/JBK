package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx1 {

	public static void main(String[] args) 
	{
		
		WildCardEx1 obj=new WildCardEx1();
		
		ArrayList<Integer> arrayList=new ArrayList<Integer>();
		
		obj.m1(arrayList);
		
		
		ArrayList<Float> arrayList2=new ArrayList<Float>();
		
		obj.m1(arrayList2);
		
//		
//		ArrayList<String> arrayList3=new ArrayList<String>();
//		
//		obj.m1(arrayList3);

	}
	
	// class Integer extends Number
	// class Float extends Number
	
	
	// In ArrayList Integer and Float both will be acceptable

	// using ? , we specify range of possible types of objects , allowed in collection 
	
	// we can use ? only when we write argument of type collection
	
	
	void m1(ArrayList<? extends Number>  arrayList)
	{
		System.out.println(arrayList);
	}

}
