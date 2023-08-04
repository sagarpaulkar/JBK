package com.kiranacademy.wildcardex;

import java.util.ArrayList;

public class WildCardEx2 {

	public static void main(String[] args) 
	{
		
		WildCardEx2 obj=new WildCardEx2();
		
		ArrayList<Exception> arrayList=new ArrayList<Exception>();
		
		obj.m1(arrayList);
		
		
		ArrayList<ArithmeticException> arrayList2=new ArrayList<ArithmeticException>();
		
		//obj.m1(arrayList2);
		
		// ArithmeticException is NOT a super class of NullPointerException
		
	}
	
	// Exception is a super class of NullPointerException
	
	void m1(ArrayList<? super NullPointerException>  arrayList)
	{
		System.out.println(arrayList);
	}

}
