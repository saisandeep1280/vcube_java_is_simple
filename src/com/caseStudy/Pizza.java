package com.caseStudy;

public class Pizza extends FoodItem{
	double toppingCharge; 
   Pizza(double basePrice, double toppingCharge ){
	   super("pizza",basePrice);
	   this.toppingCharge=toppingCharge;
   }
   double calculatePrice() {
	   return basePrice + toppingCharge;
   }
}
