package com.kiranacademy.methods;



public class MaxChecking2 {

	public static void main(String[] args) 
	{
		
		MaxChecking2 obj=new MaxChecking2();
		
		Product maxProduct=obj.checkMax(new Product(1, 100),new Product(2, 200));
		
		System.out.println(maxProduct);

	}
	
	
	Product checkMax(Product product1,Product product2)
	{
		if(product1.price>product2.price)
			return product1;
		else
			return product2;
	}

}
