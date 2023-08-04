package com.kiranacademy.methods;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A p= new A();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter lower:-");
		
		int lower = sc.nextInt();
		
		System.out.println("Enter upper:-");
		
		int upper = sc.nextInt();
		
		for (int no=lower; no<=upper; no++) {
			
			boolean answer= p.checkPrime(no);
			
			if (answer)
				
				System.out.println(no+" ");
		}
	}
	
	boolean checkPrime(int no) {
		
		for (int i=2; i<no;i++) {
			
			if(no%2==0)
				return false;
		}
		
		return true;
	}
}
