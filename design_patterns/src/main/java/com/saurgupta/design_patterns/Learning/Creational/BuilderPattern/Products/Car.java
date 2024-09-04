package com.saurgupta.design_patterns.Learning.Creational.BuilderPattern.Products;

public class Car {
    private final int id;
    private final String model;
    private final String brand;
    private final String color;

    public Car(int id, String model, String brand, String color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
}
