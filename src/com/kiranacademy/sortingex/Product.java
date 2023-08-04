package com.kiranacademy.sortingex;

public class Product 
{
	int pid;
	String name;
	int price; // global variables
	
	
	public Product(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

// Product p1=new Product(1,'p',10)
// Product p2=new Product(2,'r',20)
// p2.toString();
// this refer to that object which is used for calling a method
	
	@Override
	public String toString() {
		return "Product [pid=" + this.pid + ", name=" + name + ", price=" + price + "]";
	}

}
