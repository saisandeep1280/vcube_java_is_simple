package com.miniproblem;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        String more = "";

        System.out.println("Enter you want vegetables or fruits:");
        String choice = sc.nextLine();

        switch (choice.toLowerCase()) { 
            case "vegetables" -> {
                
                do {
                    System.out.println("Enter the name of the vegetable:");
                    String vegetable = sc.next(); 

                    switch (vegetable.toLowerCase()) {
                        case "tomato" -> {
                            System.out.println("Enter the quantity of tomato:");
                            int weight = sc.nextInt();
                            price = price + weight * 20;
                            System.out.println("The price of tomato is " + weight * 20);
                        }
                        case "potato" -> {
                            System.out.println("Enter the quantity of potato:");
                            int weight = sc.nextInt();
                            price = price + weight * 30;
                            System.out.println("The price of potato is " + weight * 30);
                        }
                        case "onion" -> {
                            System.out.println("Enter the quantity of onion:");
                            int weight = sc.nextInt();
                            price = price + weight * 40;
                            System.out.println("The price of onion is " + weight * 40);
                        }
                        case "carrot" -> {
                            System.out.println("Enter the quantity of carrot:");
                            int weight = sc.nextInt();
                            price = price + weight * 10;
                            System.out.println("The price of carrot is " + weight * 10);
                        }
                        default -> {
                            System.out.println("Out of stock!");
                        }
                    } 
                    System.out.println("The total price is " + price);
                    System.out.println("Do you want to buy more vegetables? (yes/no)");
                    more = sc.next();

                } while (more.equalsIgnoreCase("yes")); 
            }
            case "fruits" -> {
				do {
					System.out.println("Enter the name of the fruit:");
					String fruit = sc.next(); 

					switch (fruit.toLowerCase()) {
						case "apple" -> {
							System.out.println("Enter the quantity of apple:");
							int weight = sc.nextInt();
							price = price + weight * 50;
							System.out.println("The price of apple is " + weight * 50);
						}
						case "banana" -> {
							System.out.println("Enter the quantity of banana:");
							int weight = sc.nextInt();
							price = price + weight * 20;
							System.out.println("The price of banana is " + weight * 20);
						}
						case "orange" -> {
							System.out.println("Enter the quantity of orange:");
							int weight = sc.nextInt();
							price = price + weight * 30;
							System.out.println("The price of orange is " + weight * 30);
						}
						case "grapes" -> {
							System.out.println("Enter the quantity of grapes:");
							int weight = sc.nextInt();
							price = price + weight * 40;
							System.out.println("The price of grapes is " + weight * 40);
						}
						default -> {
							System.out.println("Out of stock!");
						}
					} 
					System.out.println("The total price is " + price);
					System.out.println("Do you want to buy more fruits? (yes/no)");
					more = sc.next();

				} while (more.equalsIgnoreCase("yes")); 
			}
            default -> {
                System.out.println("Invalid choice or category not built yet.");
            }
            
        }
        
        sc.close(); 
    }
}