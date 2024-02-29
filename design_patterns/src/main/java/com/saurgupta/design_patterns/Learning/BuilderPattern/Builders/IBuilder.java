package com.saurgupta.design_patterns.Learning.BuilderPattern.Builders;

public interface IBuilder {
    IBuilder id(int id);
    IBuilder brand(String brand);
    IBuilder model(String model);
    IBuilder color(String color);
}
