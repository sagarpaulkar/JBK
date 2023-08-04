
public class Products {
	
	String pname;
	int price; 
	
	public Products(int price, String pname) {
		super();
		this.pname = pname;
		this.price = price;
	}

	public static Products getCheapProduct(Products p1, Products p2) {
		
		if(p1.price<p2.price) 
			return p1;
		else 
				return p2;
		}
	
	public  String toString () {
		
		return " Product name is "+ pname + " product price is "+ price;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 Products p = Products.getCheapProduct(new Products(1000, "Mouse"), new Products(2000,"Keyboard"));
	
	 String s= p.toString();
	 
	 System.out.println(s);
	 
	 
	}

}
