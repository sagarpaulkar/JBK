package com.kiranacademy.threadex;
/* 
 * 
 * Thread is like a worker . we assign some work to worker and then worker execute that job
 * 
 * We define a job and assign that job to some thread . then thread execute that job
 * 
 * 
 * Different threads executes run() method simultaneously(parallery)
 * */


public class TestThread 
{
	public static void main(String[] args) 
	{
		
		Job job=new Job();
		
		Thread thread1=new Thread(job, "thread1"); // born state
		thread1.start(); // ready to run state / runnable state
		
//
//		Thread thread2=new Thread(job, "thread2");
//		thread2.start();
		
		
	}
}
