package com.kiranacademy.polymorphism;

import java.util.Arrays;

public class A {
	// String[] args={"java","is","easy"}
		// A.main(args)
		public static void main(String[] args) 
		{
			
			System.out.println(args.length);
			
			System.out.println(args[0]);
			
			System.out.println("String array");
			
			System.out.println(Arrays.toString(args));	
			
			int[] a= {10,20,30};
			
			A.main(a);
			
			a[2]=50;
			
		}
		
		
		public static void main(int[] a)
		{
			System.out.println(a.length);
			System.out.println(Arrays.toString(a));
			
		}

}
