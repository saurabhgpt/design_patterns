package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern;

import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }
    public void drive() {
        driveStrategy.drive();
    }
}
