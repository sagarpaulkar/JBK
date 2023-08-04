package com.kiranacademy.Abstraction;

import java.util.Scanner;

public abstract class ElectricityPlan 
	{
		int rate;
		
		public abstract void setRate();
		
	
		public void calculteBill(int unit)
		{
			System.out.println(rate*unit);
		}
		
		
		public static ElectricityPlan getPlan(String plan)
		{
			if(plan.equals("commercial"))
				return new CommercialPlan();
			else if(plan.equals("domestic"))
				return new DomesticPlan();
			else
				return null;
						
		}
		
		
		public static void main(String[] args) {
			
			
			Scanner sc= new Scanner(System.in);
			
			System.out.println("Select plan:");
			
			String plan=sc.next();
			
			ElectricityPlan plan1=ElectricityPlan.getPlan(plan);
			plan1.setRate();
			plan1.calculteBill(5);
			
			
			
			
			
		}
	}
