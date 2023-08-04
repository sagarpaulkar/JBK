
public class Pro {

	int productId;
	String productName;
	int price; 
	
	
	public Pro(int productId, String productName, int price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public static Pro getlowest(Pro p1,Pro p2, Pro p3) {
		
		if(p1.price<p2.price && p1.price<p3.price)
			return 
					p1;
		else if (p2.price<p1.price && p2.price<p3.price)
			return 
					p2;
		else 
			return 
					p3;
	}

	@Override
	public String toString() {
		return "Pro [productId=" + productId + ", productName=" + productName + ", price=" + price + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pro p= Pro.getlowest(new Pro(01,"Straberries",4000), new Pro(02,"Peru",5000), new Pro(03,"Banana",3000));
		
		String s= p.toString();
		
		System.out.println(s);
	}

}
