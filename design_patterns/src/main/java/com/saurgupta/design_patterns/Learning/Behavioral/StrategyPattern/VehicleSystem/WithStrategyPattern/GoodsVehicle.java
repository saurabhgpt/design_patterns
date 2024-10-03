package com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern;

import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy.DriveStrategy;
import com.saurgupta.design_patterns.Learning.Behavioral.StrategyPattern.VehicleSystem.WithStrategyPattern.Strategy.NormalDriveStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new NormalDriveStrategy());
    }
}
