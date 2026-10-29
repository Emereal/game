package inventory;

public class Product {
	// Instance variables
	private String name; // Product's name
	private double price; // Unit price for the product
	private int qty; // Number of units in stock
	// Constructor method - used to build a product object
	public Product(String n, double p) {
	name = n;
	price = p;
	qty = 0;
	}
	// Get Methods
	public String getName() {
	return name;
	}
	public double getPrice() {
	return price;
	}
	public int getQty() {
	return qty;
	}
	// Set Methods
	public void setPrice(double p) {
	price = p;
	}
	public void addQty(int howMuch) {
	qty += howMuch;
	}
	// Special Methods
	public String toString() {
	String s = name;
	s += "\n\t$"+price+" (Qty: "+qty+")";
	return s;
	}

}
