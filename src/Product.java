
public class Product {
	
	int productID, price;
	
	void display() {
		System.out.println(this.productID);
		System.out.println(this.price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product obj= new Product ();
		obj.display();
		
	}

}
