package inventory;

import java.util.Scanner;

public class Inventory {
	//static Product prod1 = new Product("Vomero Sneakers", 170);
	//static Product prod2 = new Product("Yeezy Boots", 150);
	//static Product prod3 = new Product("Tube Socks", 2);
	
	private static Product[] products = new Product[67];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Scanner nameInput = new Scanner(System.in);
		
		products[0] = new Product("Vomero Sneakers", 170);
		products[1] = new Product("Yeezy Boots", 150);
		products[2] = new Product("Tube Socks", 2);
		products[3] = new Product("Rubber Boots", 67);
		products[3] = new Product("Toe Socks", 4);
		
		int choice = 0;
		String name = "";
		int amount = 0;
		Product p = null;
		String n = "";
		double pr = 0;
		while (choice != 10) {
			System.out.println("1) Print products");
			System.out.println("2) Sell product");
			System.out.println("3) Stock product");
			System.out.println("4) Stock all products");
			System.out.println("5) Print a product");
			System.out.println("6) Double all prices");
			System.out.println("9) Exit Program");
			System.out.println("\n There's a special surprise if you guess the right number");
			System.out.print("Enter a choice (1-10): ");
			choice = input.nextInt();
			switch(choice) {
			case 1: // Print products
				for(int i=0;i<products.length-1;i++)
					System.out.println(products[i]);
				break;
			case 2: // Sell product
				System.out.print("Enter product name: ");
				name = nameInput.nextLine();
				p = findProduct(name);
				if (p != null)
					p.addQty(-1);
				else
					System.out.println("I dont sell that shit cuh");				
				break;
			case 3: // Stock product
				System.out.print("Enter product name: ");
				name = nameInput.nextLine();
				p = findProduct(name);
				if (p != null) {
					System.out.print("Stock how many units? ");
					amount = input.nextInt();				
					p.addQty(amount);
				} else
					System.out.println("I can't stock something I dont have, sorry.");
				break;
			case 4: // Stock all products
				System.out.print("Stock how many units? ");
				amount = input.nextInt();
				for(int i=0;i<products.length-1;i++)
					products[i].addQty(amount);
				break;
			case 5: // Print a product
				System.out.print("Enter product name: ");
				name = nameInput.nextLine();
				p = findProduct(name);
				if (p != null) {
					n = p.getName();
					System.out.println(n);
				} else
					System.out.println("I can't print what I don't have, buddy.");
				break;
			case 6: // Double all prices
				for(int i=0;i<products.length-1;i++)
					products[i].setPrice(pr*2);
					break;
			case 7: // Exit program..?
				System.out.println("\nAYO OCK!!! \nLET ME GET A D AND CHEDDA WITH AN EXTRA D AND CHEDDA, \nHOLD THE CHEDDA JUST GIMME THE D! \nI'M WYLIN?!?! \nWDYM I'M- HEY, HEY, CHILL OUT MAH HEART MAH HEART \nI'M JUST BUSSIN WIT HIM WE JUST BUSSIN WIT EACH OTHER \nHE BUSSIN ON ME IM BUSSIN ON HIM");
				break;
			case 9: //Exit program
				System.out.println("Okay bye bye");
				break;
			default:
				System.out.println("Huh???");
			}
		}
		input.close();
		nameInput.close();
	}
	
	public static Product findProduct(String name) {
		for(int i=0;i<products.length-1;i++)
			if (products[i].getName().equals(name))
				return products[i];
		return null;
	}
}
