public class ProductNode {
	String productName;
	String locator;
	int quantity;
	float price;
	ProductNode next;
	
	//Constructor #1
	ProductNode() {
		//Initialize other variables here
		String productName = "";
		String locator = "";
		int quantity = 0;
		float price = (float) 0.0;
		next = null;
	}
	
	//Constructor #2
	ProductNode(String productName, String locator, int quantity, float price) {
		this.productName = productName;
		this.locator = locator;
		this.quantity = quantity;
		this.price = price;
		this.next = null;
	}
}
