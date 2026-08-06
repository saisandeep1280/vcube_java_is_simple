package com.caseStudy;

public class Burger extends FoodItem {
	double packingCharge;
    Burger(double basePrice,double packingCharge){
    	super("Burger",basePrice);
    	this.packingCharge=packingCharge;
    }
    double calculatePrice() {
    	return basePrice + packingCharge;
    }
}
