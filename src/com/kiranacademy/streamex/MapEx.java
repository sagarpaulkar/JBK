package com.kiranacademy.streamex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapEx {

		public static void main(String[] args) {

			
			//List<Integer> list=Arrays.asList(1,2,3,4).stream().filter(number->number%2==0).toList();
			
			List<Integer> list=Arrays.asList(1,2,3,4).stream().map(number->number*number).collect(Collectors.toList());
			
			System.out.println(list);
			
		}

}
