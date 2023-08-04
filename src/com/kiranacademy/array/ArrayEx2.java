package com.kiranacademy.array;

import java.util.Arrays;

public class ArrayEx2 {

public static void main(String[] args) {
		
		String[] a=new String[2];
		
		//a  [null] [null]
		//    0       1   index
		
		System.out.println(a);
		
		System.out.println(a.toString());
		
		System.out.println(Arrays.toString(a));
		
		a[1]=new String("TheKiranAcademy");
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
