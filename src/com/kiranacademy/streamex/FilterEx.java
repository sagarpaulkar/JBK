package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEx {

	public static void main(String[] args) {

		// ToList() is from JDK 16
		
		//List<Integer> list=Arrays.asList(1,2,3,4).stream().filter(number->number%2==0).toList();
		
		List<Integer> list=Arrays.asList(1,2,3,4).stream().filter(number->number%2==0).collect(Collectors.toList());
		
		System.out.println(list);
		
	}

}
