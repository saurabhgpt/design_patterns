package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new GoodsVehicle();
        Vehicle vehicle2 = new SportsVehicle();
        Vehicle vehicle3 = new OffroadVehicle();
        vehicle1.drive();
        vehicle2.drive();
        vehicle3.drive();
    }
}
