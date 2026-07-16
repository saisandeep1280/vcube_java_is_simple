package com.constructor;

public class Car {
    int id;
    String model;
    String brand;
    double price;

    // No-argument constructor
    Car() {
        this(0, "Unknown", "Unknown",100);
    }

    // 2-parameter constructor
    Car(int id, String model) {
        this(id, model, "Unknown",0);
    }

    // 3-parameter constructor
    Car(int id, String model, String brand) {
        this(id, model, brand, 0.0);
    }

    // 4-parameter constructor
    Car(int id, String model, String brand, double price) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.price = price;
    }

    void carInfo() {
        System.out.println("Car ID    : " + id);
        System.out.println("Car Model : " + model);
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Price : " + price);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car(101, "BMW");
        Car c3 = new Car(102, "X5", "BMW");
        Car c4 = new Car(103, "Q7", "Audi", 8500000);
        c1.carInfo();
        c2.carInfo();
        c3.carInfo();
        c4.carInfo();
    }
}