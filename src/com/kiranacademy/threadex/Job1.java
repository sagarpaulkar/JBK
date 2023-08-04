package com.kiranacademy.threadex;

public class Job1 implements Runnable {

	public void run() 
	{
			for(int i=2;i<=100;i=i+2)
			{
				System.out.print(i+ " ");
			}
	}

}
