package com.kiranacademy.array;

import java.util.Arrays;

public class ArrayEx1 {

public static void main(String[] args) {
		
		int[] a=new int[2];
		
		//a  [0][0]
		//    0  1   index
		
		System.out.println(a);
		
		System.out.println(a.toString());
		
		System.out.println(Arrays.toString(a));
		
		a[1]=90;
		
		System.out.println(Arrays.toString(a));
		
		
	}

}
