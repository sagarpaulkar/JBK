package com.kiranacademy.threadex;

public class Job2 implements Runnable {

	public void run() 
	{
			for(int i=1;i<=100;i=i+2)
			{
				System.out.print(i+ " ");
			}
	}

}
