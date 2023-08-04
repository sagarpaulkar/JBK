package com.kiranacademy.streamex;

import java.util.Arrays;

public class MaxEx {

	
public static void main(String[] args) {

		
		//List<Integer> list=Arrays.asList(1,2,3,4).stream().filter(number->number%2==0).toList();
		
		//List<Integer> list=Arrays.asList(1,2,3,4).stream().map(number->number*number).collect(Collectors.toList());
		
		System.out.println(Arrays.asList(1,2,3,4).stream().max((number1,number2)->number1-number2));
		
		System.out.println(Arrays.asList(1,2,3,4).stream().min((number1,number2)->number1-number2));
		
		// int compare(Object o1,Object o2)
		
	}

}
