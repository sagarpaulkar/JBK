package com.kiranacademy.threadex;

import java.util.Scanner;

public class Job implements Runnable {

Scanner scanner = new Scanner(System.in);
	
	public void run()
	{
		// running state
		
		System.out.println("running state");
		
		System.out.println("Enter a number :-  ");
		
		int no=scanner.nextInt(); // blocked state
		
		// Thread goes into blocked state due to I/O , sleep()
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Kiranacademy " + i + " by " + Thread.currentThread().getName());
			
			try 
			{
				Thread.sleep(5000);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			
		}
	}
	
	// dead state :- when run() execution is over , thread goes into dead state

}
