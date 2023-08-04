package com.kiranacademy.threadex;

public class MultiThreadingEx {

	public static void main(String[] args) {

		Job1 job1=new Job1();
		Thread thread1=new Thread(job1, "eventhread");
		thread1.run(); // don't call run() . For parallel execution , call start() method
		

		Job2 job2=new Job2();
		Thread thread2=new Thread(job2, "oddthread");
		thread2.run();// don't call run() . For parallel execution , call start() method


	}

}
