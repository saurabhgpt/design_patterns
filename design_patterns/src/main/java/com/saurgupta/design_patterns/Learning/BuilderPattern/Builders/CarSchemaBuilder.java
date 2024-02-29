package com.saurgupta.design_patterns.Learning.BuilderPattern.Builders;

import com.saurgupta.design_patterns.Learning.BuilderPattern.Products.Car;

public class CarSchemaBuilder implements IBuilder {
    private int id;
    private String brand, model, color;
    @Override
    public CarSchemaBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public CarSchemaBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public CarSchemaBuilder model(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarSchemaBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        return new Car(id, model, brand, color);
    }
}
