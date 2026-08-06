package com.caseStudy;

public class Biryani extends FoodItem{
	double gst;
	Biryani(double basePrice ,double gst){
		super("Biryani",basePrice);
		this.gst= gst;
	}
	double calculatePrice() {
		return basePrice + (basePrice*gst/100);
	}
}

