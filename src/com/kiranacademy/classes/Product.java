package com.kiranacademy.classes;

public class Product {

	int pid;
	int price; // global variables
		
	public Product(int pid, int price) 
	{
		super();  // every constructor calls parent class's constructor
		this.pid = pid; 
		this.price = price;
	}

	void display()
	{
		System.out.println(this.pid);
		System.out.println(this.price);
	}
	
	public static void main(String[] args) {
		
		Product product1=new Product(101, 1000); // product1 [pid=101 price=1000 display() ] Product class object
		Product product2=new Product(102, 2000); // product2,this===>===> [pid=102 price=2000 display() ] Product class object
		
		//System.out.println(this.price); // non static and non-static methods are called using reference .
		
		product1.display();
		
		product2.display();
		
		
	}
}
