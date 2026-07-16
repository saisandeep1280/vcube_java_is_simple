package com.constructor;

class Vehicle1 {
    int vid;
    String model;
    double price;
    String brand;

    public Vehicle1(int vid, String model, double price, String brand) {
        this.vid = vid;
        this.model = model;
        this.price = price;
        this.brand = brand;
    }

    public Vehicle1() {
    }

    void vehicleinfo() {
        System.out.println("Vehicle Id : " + vid);
        System.out.println("Model      : " + model);
        System.out.println("Price      : " + price);
        System.out.println("Brand      : " + brand);
    }
}

public class Vehicle extends Vehicle1 {

    public Vehicle(int vid, String model, double price, String brand) {
        super(vid, model, price, brand);
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle(101, "Kia", 15000.04, "Tata");
        v.vehicleinfo();
    }
}