package com.saurgupta.design_patterns.Learning.BuilderPattern.Products;

public class CarSchema {
    private final int id;
    private final String model;
    private final String brand;
    private final String color;

    CarSchema(int id, String model, String brand, String color) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.color = color;
    }
}
