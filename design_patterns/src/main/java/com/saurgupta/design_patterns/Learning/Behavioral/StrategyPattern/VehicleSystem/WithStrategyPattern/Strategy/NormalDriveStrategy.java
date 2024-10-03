package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal drive capability.");
    }
}
