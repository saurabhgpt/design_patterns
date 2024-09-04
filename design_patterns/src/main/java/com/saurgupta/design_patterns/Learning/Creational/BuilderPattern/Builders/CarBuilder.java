package com.saurgupta.design_patterns.Learning.Creational.BuilderPattern.Builders;

import com.saurgupta.design_patterns.Learning.Creational.BuilderPattern.Products.Car;

public class CarBuilder implements IBuilder {
    private int id;
    private String brand, model, color;
    @Override
    public CarBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(id, model, brand, color);
    }
}
