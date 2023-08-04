package com.kiranacademy.methods;

import java.util.Scanner;

public class B {

	
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		B obj=new B();
		
		System.out.println("please enter number :- ");
		
		int no=sc.nextInt();
		
		boolean answer=obj.checkPrime(no);
		
		System.out.println(answer);

	}

	boolean checkPrime(int no)
	{
		//5
	
		// 5%2==>1
		// 5%3==> 2
		// 5%4==>1
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
				return false;
			
		}
		
		return true;
		
	}
}

