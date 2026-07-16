package com.rough;


class Product {
	int productId;
	String productName;
	String brand;
	double price;
	int warranty;

	// Parameterized Constructor
	Product(int productId, String productName, String brand,double price, int warranty) {
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}

	// Copy Constructor
	Product(Product p) {
		this.productId = p.productId;
		this.productName = p.productName;
		this.brand = p.brand;
		this.price = p.price;
		this.warranty = p.warranty;
	}

	void display() {
		System.out.println("Product ID   : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Brand        : " + brand);
		System.out.println("Price        : " + price);
		System.out.println("Warranty     : " + warranty );
		System.out.println("---------------------------");
	}
}
public class Assignment1 {

	public static void main(String[] args) {

		// Original Product
		Product p1 = new Product(101, "Galaxy S25","Samsung", 85000, 2);

		// New Product created using Copy Constructor
		Product p2 = new Product(p1);

		System.out.println("Original Product Details");
		p1.display();

		System.out.println("Copied Product Details");
		p2.display();
	}

}
