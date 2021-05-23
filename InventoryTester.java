public class InventoryTester {
	public static void main(String[]args) {
		ProductInventory inventory = new ProductInventory();
		
		//Add product to inventory
		inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "box256" + "\t", 10, (float) 699.80);
		inventory.addProduct("Apple iphone 7 plus 32gb rose gold", "shelf4" + "\t", 04, (float) 699.80);
		inventory.addProduct("Apple macbook pro" + "\t\t", "box15" + "\t", 02, (float) 1500.87);
		inventory.addProduct("Dell Monitor" + "\t\t\t", "shelf10" + "\t", 12, (float) 221.54);
		
		System.out.println("CURRENT INVENTORY: ");
		System.out.println();
		//Show inventory
		inventory.showInventory();
		/*
		Product Name						Locator		Quantity					Price
		----------------------------------------------------------------------------------
		Apple iphone 7 plus 32gb rose gold 	 box256			  10					699.80
		Apple iphone 7 plus 32gb rose gold   shelf4			   4					699.80
		Apple macbook pro				      box15			   2				   1500.87
		Dell Monitor						shelf10			  12					221.54
		 */

		//Sort products in inventory
		inventory.sortInventory();
		
		System.out.println();
		System.out.println("CURRENT INVENTORY: ");
		System.out.println();
		//Show inventory after sorting
		inventory.showInventory();
		
		/*
		Product Name						Locator		Quantity					Price
		----------------------------------------------------------------------------------
		Dell Monitor						shelf10			  12					221.54
		Apple iphone 7 plus 32gb rose gold 	 box256			  10					699.80
		Apple iphone 7 plus 32gb rose gold   shelf4			   4					699.80
		Apple macbook pro				      box15			   2				   1500.87
		 */
		
		System.out.println();
		System.out.println();
		System.out.print("This is how many Apple iphone 7 plus gb rose gold models we have in stock: ");
		System.out.print(inventory.countProduct("Apple iphone 7 plus 32gb rose gold")); //Should return 14
		System.out.println();
		System.out.println();
		System.out.print("This is how many Dell Monitor's we need to add to stock: ");
		System.out.print(inventory.countNeededQuantity("Dell Monitor" + "\t\t\t", 15)); //Should return 3
		System.out.println();
		System.out.println();
		inventory.removeMaximum();
		inventory.removeProduct("Apple iphone 7 plus 32gb rose gold", "shelf4" + "\t");
		System.out.print("This is the quantity of our current total inventory: ");
		System.out.print(inventory.getTotalQuantity()); //Should return 12
	}
}
