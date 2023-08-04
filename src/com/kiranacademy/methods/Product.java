package com.kiranacademy.methods;

public class Product {

	int pid;
	int price; // global variables
		
	public Product(int pid, int price) 
	{
		super();  // every constructor calls parent class's constructor
		this.pid = pid; 
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + "]";
	}

}
