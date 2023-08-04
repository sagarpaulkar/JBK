package com.kiranacademy.methods;

public class MaxChecking {

		public static void main(String[] args) {
			
			MaxChecking obj=new MaxChecking();
			
			int answer=obj.checkMax(10, 3);
			
			System.out.println(answer);

		}
		
		
		int checkMax(int no1,int no2)
		{
			if(no1>no2)
				return no1;
			else
				return no2;
		}


}
